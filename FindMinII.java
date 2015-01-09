class FindMinII
{
	public static void main(String args[]){
		int[] test = {1,2,3,1,1,1,1};
		int[] test1 = {1,1,1,1,1,1};
		int[] test2 = {1,1,1,1,1,2,3,0,1,1,1};

		System.out.println(findMin(test));
		System.out.println(findMin(test1));
		System.out.println(findMin(test2));
	}

	public static int findMin(int[] num){
		int start = 0;
		int end = num.length -1;

		while(!(start == end || end - start == 1)){
			if(num[start] < num[end]){
				return num[start];
			}
			int mid = (start + end)/2;

			if(num[start] > num[mid]){
				end = mid;
			}else if(num[start] < num[mid]){
				start = mid;
			}else {
				while(start < mid &&num[start] == num[mid]){
					++start;
				}
			}
		}
		if(num[start] <= num[end]){
			return num[start];
		}else{
			return num[end];
		}


	}

}
