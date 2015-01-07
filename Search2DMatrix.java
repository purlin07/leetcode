class Search2DMatrix
{
	public static void main(String[] args){
		int[][] test = {{1,3,5},{6,8,9},{10,13,14}};
		System.out.println(searchMatrix(test,3));
		System.out.println(searchMatrix(test,6));
		System.out.println(searchMatrix(test,14));
		System.out.println(searchMatrix(test,0));
		System.out.println(searchMatrix(test,15));
	}

	public static boolean searchMatrix(int[][] matrix, int target){
		int m = matrix.length - 1;
		int n = matrix[0].length - 1;

		int s1 = 0;
		int s2 = 0;
		int m1 = m/2;
		int m2 = n/2;

		int j;

		while(s1 <= m){
			m1 = (s1+m)/2;
			if(matrix[m1][0] == target){
				return true;
			}else if (matrix[m1][0] < target){
				s1 = m1 + 1;
			}else{
				m = m1 - 1;
			}
		}
		
		if(matrix[m1][0] < target){
			j = m1;
		}else{
			j = m1 -1;
		}
		System.out.println("m1 = "+m1);
		if(j < 0){
			return false;
		}
		System.out.println("j = "+ j);	
		while(s2 <= n){
			m2 = (s2+n)/2;
			if(matrix[j][m2] == target){
				return true;
			}else if( matrix[j][m2] < target){
				s2 = m2 + 1;
			}else{
				n = m2 - 1;
			}
		}
		return false;

	}
}
