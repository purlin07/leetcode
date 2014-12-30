import java.util.List;
import java.util.ArrayList;

class PascalsTriangle
{
	public static void main(String[] args){
		int[][] arr = pascalsTriangle(5);
		print(arr);
		List<List<Integer>> list = pascalsTrangle2(5);
		printList(list);
	}

	public static int[][] pascalsTriangle(int num){

		int[][] arr = new int[num][];

		for(int i=0;i<num;i++){
			arr[i] = new int[i+1];
			arr[i][0]=1;
			arr[i][i]=1;
			for(int j=1;j<i;j++){
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}

		return arr;
	}

	public static List<List<Integer>> pascalsTrangle2(int num){
		List<List<Integer>> trangle = new ArrayList<List<Integer>>();
		for(int i=0;i<num;i++){
			List<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<=i;j++){
				if(j==0 | j==i){
					row.add(1);
				}else{
					row.add(trangle.get(i-1).get(j-1)+trangle.get(i-1).get(j));
				}
			}
			trangle.add(row);
		}

		return trangle;
	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> row = new ArrayList<Integer>();

		if(rowIndex == 0){
			row.add(1);
			return row;
		}
		if(rowIndex == 1){
			row.add(1);
			row.add(1);
			return row;
		}
		List<Integer> preRow = getRow(rowIndex - 1);
		for(int i =0;i<=rowIndex;i++){
			if(i==0|i== rowIndex){
				row.add(1);
			}else{
				row.add(preRow.get(i-1)+preRow.get(i));
			}
		}
		return row;
	}

	public static void print(int arr[][]){
		for(int[] i : arr){
			for(Integer j : i){
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void printList(List<List<Integer>> list){
		for(ArrayList l : list){
			for(Integer i : l){
				System.out.print(i+" ");
			}
		}
		System.out.print("\n");
	}
}
