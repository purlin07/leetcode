class SpiralMatrix2
{
	public static void main(String[] args){
		spiralMatrix(1);	



	}
	
	public static int[][] spiralMatrix(int n ){
		int x   = 0;
		int y   = n-1;
		int num = 1;
		int[][] result = new int[n][n];

		while(x <= y){
			for(int i = x; i <= y; ++i){
				result[x][i] = num++;
			}
			if(x < y){
				for(int i = x+1; i < y; ++i){
					result[i][y] = num++;
				}
				for(int i = y; i >= x; --i){
					result[y][i] = num++;
				}
				for(int i = y-1; i>x; --i){
					result[i][x] = num++;
				}

			}
			++x;
			--y;

			print(result);
		}
		return result;
	}

	public static int[][] spiralMatrix2(int n){
		int[][] result = new int[n][n];

		int x = 0;
		int y = 0;
		int[] xd = {0,1,0,-1};
		int[] yd = {1,0,-1,0};

		int rows = n,cols = n;

		int num = 1;
		int step = 0;
		int rest;
		int direct = 0;

		while(rows > 0 && cols > 0){
			if(xd[direct] == 0){
				rest = cols-step-1;
			}else{
				rest = rows-step-1;
			}
			System.out.println("rest="+rest+" x="+x+" y="+y+" rows="+rows+" cols="+cols+" step="+step);
			result[x][y] = num;
			step++;
			num++;

			if(rest == 0){
				step = 0;
				if(xd[direct] == 0){
					rows--;
				}else{
					cols--;
				}
				direct++;
				direct %= 4;
			}

			x = x + xd[direct];
			y = y + yd[direct];
			print(result);
		}

		return result;
	}

	public static void print(int[][] arr){
		for(int[] a : arr){
			for(int i : a){
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}
