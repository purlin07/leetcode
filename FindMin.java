class FindMin
{
	public static void main(String[] args){
		int[] test  = {4,5,6,0,1};
		int[] test2 = {0,1,2,3,4,5};
		int[] test3 = {0};
		int[] test4  = {4,5,6,0,1,2,3};

		System.out.println(findMin3(test));
		System.out.println(findMin3(test2));
		System.out.println(findMin3(test3));
		System.out.println(findMin3(test4));
	}
// O(n)
	public static int findMin(int[] num){
		int n = num.length;

		if(n == 1){
			return num[0];
		}

		for(int i = 0; i < n - 1;i++){
			if(num[i] > num[i+1] ){
				return num[i+1];
			}
		}
		return num[0];
	}
// Binary Search  O(log n)
	public static int findMin2(int[] num){
		int start = 0;
		int end = num.length - 1;

		if(end == 0){
			return num[0];
		}

		if(num[start] < num[end]){
			return num[0];
		}

		while(start <= end){
			int mid = (start + end)/2;
			if(num[start] < num[mid]){
				start = mid;
			}else if(num[start] > num[mid]){
				end = mid;
			}else{
				if(num[start] > num[end]){
					return num[end];
				}else{
					return num[start];
				}
			}
		}
		return 0;
	}

// Binary Search O(log n)
	public static int findMin3(int[] num){
		int start = 0;
		int end = num.length - 1;

		while(start < end){
			int mid = (start + end)/2;
			if(num[start] > num[end]){
				if(num[start] > num[mid]){
					end = mid;
				}else if(num[start] < num[mid]){
					start = mid;
				}else{
					return num[end];
				}
			}else{
				return num[start];
			}
		}
		return num[start]; 
	}
}
