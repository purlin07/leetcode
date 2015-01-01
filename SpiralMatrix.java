import java.util.ArrayList;
import java.util.List;

class SpiralMatrix
{
	public static void main(String[] args){
		int[][] test  = {{1,2,3},{8,9,4},{7,6,5}};
		int[][] test1 = {{1}};
		int[][] test2 = {{1,2,3,4},{1,2,3,4}};
		List<Integer> result = spiralMatrix2(test2);
		print(result);
	}

	public static List<Integer> spiralMatrix(int[][] matrix){
		List<Integer> result = new ArrayList<Integer>();

		if(matrix == null){
			return null;
		}
		int rows = matrix.length;
		if(rows == 0){
			return result;
		}
		int cols = matrix[0].length;
		if(cols == 0){
			return result;
		}
		int x1 = 0;
		int y1 = 0;

		while(rows>0&&cols>0){
			int x2 = x1+rows-1;
			int y2 = y1+cols-1;
			System.out.println("x1="+x1+" x2="+x2+" y1="+y1+" y2="+y2);
			System.out.println("rows="+rows+" cols="+cols);
			for(int i=y1; i<=y2; i++){
				result.add(matrix[x1][i]);	
			}

			for(int i=x1+1; i<x2;i++){
				result.add(matrix[i][y2]);
			}
			if(rows > 1) {
				for(int i=y2;i>=y1;i--){
					result.add(matrix[x2][i]);
				}

			}
			if(cols > 1){
				for(int i=x2-1;i>x1;i--){
					result.add(matrix[i][y1]);
				}
	
			}
			x1++;
			y1++;
			rows-=2;
			cols-=2;
			print(result);
		}

		return result;
	}
	//Use Orientation matrix
	public static List<Integer> spiralMatrix2(int[][] matrix){
		List<Integer> result = new ArrayList<Integer>();

		if(matrix == null){
			return null;
		}
		int rows = matrix.length;
		if(rows == 0){
			return result;
		}
		int cols = matrix[0].length;
		if(cols == 0){
			return result;
		}

		int x=0;
		int y=0;
		//1: means we are visiting the row by the right direction.
		//-1: means we are visiting the row by the left direction.
		int[] xd={0,1,0,-1};
		// 1: means we are visiting the colum by the down direction.
		// -1: means we are visiting the colum by the up direction.
		int[] yd={1,0,-1,0};
		//0: right, 1: down, 2: left, 3: up.
		int direct = 0;
		int rest;
		int step=0;

		while(rows>0&&cols>0){
			if(xd[direct] == 0){
				// visit Y axis
				rest=cols-step-1;
			}else{
				// visit X axis
				rest=rows-step-1;
			}

			System.out.println("step="+step+" direct="+direct+" x="+x+" y="+y+" rest"+rest);
			System.out.println(matrix[x][y]);

			result.add(matrix[x][y]);
			step++;
			if(rest == 0){
				step=0;
				if(xd[direct] == 0){
					rows--;
				}else{
					cols--;
				}
				// move forward the direction.
				direct++;
				direct %=4;
			}
			x+=xd[direct];
			y+=yd[direct];
		}

		return result;
	}

	public static void print(List<Integer> arr){
		for(Integer i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
