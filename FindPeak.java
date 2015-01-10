class FindPeak
{
	public static void main(String[] args){
		int[] test = {1,2,3,1};
		int[] test2 = {1,2};
		int[] test3 = {2,1};
		int[] test4 = {3};

		System.out.println(findPeak(test));
		System.out.println(findPeak(test2));
		System.out.println(findPeak(test3));
		System.out.println(findPeak(test4));
	}

	public static int findPeak(int[] num){
		int start = 0;
		int end = num.length - 1;
		int mid = (start+end)/2;
		if(end == 0){
			return mid;
		}
		while(start <= end) {
			mid = (start+end)/2;

			if(mid == 0){
				if(num[mid] > num[mid + 1]){
					return mid;
				}else{
					start = mid + 1;
				}
			}else if(mid == num.length - 1){
				if(num[mid] > num[mid - 1]){
					return mid;
				}else{
					end = mid - 1;
				}
			}else if(num[mid] > num[mid - 1]&&num[mid] > num[mid + 1]){
				return mid;
			}else if (num[mid] < num[mid - 1]){
				end = mid - 1;
			}else if (num[mid] < num[mid + 1]){
				start = mid + 1;
			}
		}
		return mid;
	}
}
