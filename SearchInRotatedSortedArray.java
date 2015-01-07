class SearchInRotatedSortedArray
{
	public static void main(String[] args){
		int[] test = {3,4,5,6,7,1,2};
		System.out.println(search2(test,1));
		System.out.println(search2(test,3));
		System.out.println(search2(test,8));
	}

	public static int search(int[] A, int target){
		int n = A.length;
		int[] arr = new int[2*n];
		int begin = 0;
		int end = n-1;
		int index = -1;

		for(int i = 0; i < n; i++){
			arr[i] = A[i];
			arr[n+i] = A[i];
		}

		for(int i = 0; i < n; i++){
			if(arr[i] > arr[i+1]){
				begin = i+1;
				break;
			}
		}
	    end = begin + n - 1;
	    int  m = (begin + end)/2;
		while(begin <= end){
			m = (begin+end)/2;
			if(arr[m] == target){
				index = m;
				break;
			}else if(arr[m] > target) {
				end = m - 1;
			}else{
				begin = m + 1;
			}
		}

		if(index == -1){
			return -1;
		}

		if(index >= n){
			return index-n;
		}else{
			return index;
		}
		
	}
	
	public static int search2(int[] A, int target){
		int begin = 0;
		int end = A.length - 1;

		while(begin <= end){
			int mid = (begin+end)/2;
			if(A[mid] == target){
				return mid;
			}

			if(A[begin] <= A[mid]){
				if(A[begin] <= target && target <= A[mid]){
					end = mid - 1;
				}else{
					begin = mid + 1;
				}
			}else{
				if(A[mid] <= target && target <= A[end]){
					begin = mid + 1;
				}else{
					end = mid - 1;
				}
			}
		}	
		return -1;
	}
}

