class SearchRange
{
	public static void main(String[] args){
		int[] test1 = {5,7,7,8,8,9,9};
		int[] test2 = {8,8,8,8};
		int[] test3 = {5,7,7,7,7};
		int[] test4 = {8};
		int[] test5 = {7};

		print(search(test1,8));
		print(search(test2,8));
		print(search(test3,8));
		print(search(test4,8));
		print(search(test5,8));
	}

	public static int[] search(int[] A, int target){
		int[] result = new int[2];
		int s  = -1;
		int e  = -1;
		result[0] = s;
		result[1] = e;

		int start = 0;
		int end   = A.length - 1;

		while(start <= end){
			int mid = (start + end)/2;
			if(A[mid] == target){
				s = mid;
				e = mid;
				while(s >= 0 && A[s] == target){
					--s;
				}

				while(e <= A.length - 1 && A[e] == target){
					++e;
				}
				result[0] = s + 1;
				result[1] = e - 1;
				return result;
			}else if(A[mid] > target){
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
	    return result;
	}

	public static void print(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
}
