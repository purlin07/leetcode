class SearchInRotatedSortedArrayII
{
	public static void main(String[] args){
		int[] test = {1,3,1,1,1,1};
		int[] test2 = {3,1};
		int[] test3 = {4,4,5,5,6,6,6,0,0,1,2,3,4};
		int[] test4 = {1,1,1,1,3,1};
		int[] test5 = {1,1,1,1,1,1};

		System.out.println(search(test,3));
		System.out.println(search(test2,3));
		System.out.println(search(test3,3));
		System.out.println(search(test4,3));
		System.out.println(search(test5,3));
	}

	public static boolean search(int[] A,int target){
		int start = 0;
		int end = A.length - 1;

		while(!(end == start || end - start == 1)){
			int mid = (start + end)/2;
			if(A[mid] == target){
				return true;
			}
			if(A[start] > A[mid]){
				if(A[mid] <= target && target <= A[end] ){
					start = mid + 1;
				}else{
					end = mid - 1;
				}
			}else if (A[start] < A[mid]){
				if(A[start] <= target && target <= A[mid]){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else{
				while(start < end &&A[start] == A[mid]){
					++start;
				}
			}
		}

		if(A[start] == target || A[end] == target){
			return true;
		}else{
			return false;
		}
	}
}
