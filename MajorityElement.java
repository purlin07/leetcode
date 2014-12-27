class MajorityElement
{
	public static void main(String[] args){
		int[] test={3,1,2,1,1,2,};
		System.out.println(majorityElement2(test));
	
	}
	public static int majorityElement2(int[] num) {
		if(num == null || num.length == 0)
			return 0;

		// "iter" is the current major element, and "count" is the times that 
		//     this major element appears more than the other ones combined.    
		int count = 1;
		int iter = num[0];

		int N = num.length;

		for(int i=1; i<N; i++){
			if(num[i] != iter){
				if(count == 0){
					// new candidate
					iter = num[i];
					count = 1;
				}else{
					// count should be bigger than 0
					count --;
				}
			}else{
				count ++;
			}
		}

		return iter;
	}

	public static int majorityElement(int num[]){
		int length = num.length;
		if(length == 1){
			return num[0];
		}
		int m = length/2;
		quickSort(num,0,length-1);
		print(num);
		int i=0,j=1;
		int n=1;
		while(j<length){
			if(num[j] == num[i]){
				++j;
				++n;
			}else{
				if(n>m){
					return num[i];
				}else{
					i=j;
					++j;
					n=1;
				}
			}
		}
		if(n>m){
			return num[i];
		}else{
			return 0;	
		}
	}

	public static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public static int partition(int arr[], int left, int right)
	{
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		};

		return i;
	}

	public static void print(int arr[]){
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
