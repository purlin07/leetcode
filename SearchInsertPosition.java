class SearchInsertPosition
{
	public static void main(String[] args){
		int[] test = {1,3,5,7,9};
		System.out.println(searchInsertPosition(test,1));
		System.out.println(searchInsertPosition(test,0));
		System.out.println(searchInsertPosition(test,6));
		System.out.println(searchInsertPosition(test,10));
		System.out.println(searchInsertPosition(test,8));
	}

	public static int searchInsertPosition(int[] A,int target){
		int n = A.length - 1;
		int s = 0;
		int m = (n+s)/2;

		if(A[0] >= target){
			return 0;
		}
		while(s <= n){
			m = (n+s)/2;
			if(A[m] == target){
				return m;
			}else if(A[m] < target){
				s = m + 1;
			}else{
				n = m - 1;
			}
		}
		System.out.println("m="+m);
		if(A[m] > target){
			return m;
		}else{
			return m + 1;
		}
	}
}
