class RotateImage
{
	public static void main(String[] args){
		int[][] test = {{1,2,3,},{1,2,3},{1,2,3}};
		print(test);
		rotateImage(test);
		print(test);
	}

	public static void rotateImage(int[][] matrix)
	{
		if(matrix == null){
			return;
		}
		int n = matrix[0].length;
		int temp;
		for(int i = 1;i<=n/2;i++){
			for(int j=i-1;j<n-i;j++){
				temp=matrix[i-1][j];
				matrix[i-1][j]=matrix[n-j-1][i-1];
				matrix[n-j-1][i-1]=matrix[n-i][n-j-1];
				matrix[n-i][n-j-1]=matrix[j][n-i];
				matrix[j][n-i]=temp;
			}
		}
	}

	public static void print(int arr[][]){
		for(int[] i : arr){
			for(int j : i){
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
}
