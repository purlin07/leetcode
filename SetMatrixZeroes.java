class SetMatrixZeroes
{
	public static void main(String[] arges){
		int[][] test = {{1,2,0},{0,1,2},{1,0,2}};
		int[][] test1 = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		int[][] result = setMatrixZeroes3(test1);

		print(result);
	}
	// Space Complexity : O(n+m)
	public static int[][] setMatrixZeroes(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		int[] rows = new int[m];
		int[] rols = new int[n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(matrix[i][j] == 0){
					rows[i]=1;
					rols[j]=1;
				}
			}
		}

		for(int i = 0; i < m; i++){
			for(int j = 0;j < n;j++){
				if(rows[i] == 1 | rols[j] == 1){
					matrix[i][j] = 0;
				}
			}
		}
		
		return matrix;

	}
	//Space Complexity : in place
	public static int[][] setMatrixZeroes2(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		boolean row1 = false;
		boolean rol1 = false;
		for(int i = 0; i < m; i++){
			if(matrix[i][0] == 0){
				rol1 = true;
			}
		}

		for(int i = 0; i < n ; i++){
			if(matrix[0][i] == 0){
				row1 = true;
			}
		}
		print(matrix);

		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j++){
				if(matrix[i][j] == 0){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		print(matrix);
		for(int i = 1; i < m; i++){
			if(matrix[i][0] == 0){
				for(int j = 0; j < n; j++){
					matrix[i][j] = 0;
				}
			}
		}
		print(matrix);

		for(int i = 1; i < n; i++){
			if(matrix[0][i] == 0){
				for(int j = 0; j < m; j++){
					matrix[j][i] = 0;
				}
			}
		}
		print(matrix);

		if(rol1){
			for(int i = 0; i < m;i++){
				matrix[i][0] = 0;
			}
		}
		print(matrix);

		if(row1){
			for(int i = 0; i < n; i++){
				matrix[0][i] = 0;
			}
		}
		print(matrix);

		return matrix;
	}

	public static int[][] setMatrixZeroes3(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		boolean col1 = false;
		
		print(matrix);

		for(int i = 0; i < m; i++){
			if(matrix[i][0] == 0) {
				col1 = true;
			}
			for(int j = 1;j < n; j++){
				if(matrix[i][j] == 0){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		print(matrix);

		for(int i = m-1;i >= 0;i--){
			for(int j = n-1; j >= 1;j--){
				if(matrix[i][0] == 0 || matrix[0][j] == 0){
					matrix[i][j] = 0;
				}
			}
			print(matrix);
			if(col1){
				matrix[i][0] = 0;
			}
		}
		return matrix;
	
	}

	public static void print(int[][] arr){
		for(int[] i : arr){
			for(int j: i){
				System.out.print(j+ " ");
			}
			System.out.print("\n");
		}
		System.out.println("~~~~~~~~~~~~~~~");
	}
}
