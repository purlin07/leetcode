class SortColors
{
	public static void main(String[] args){
		int[] test = {0,1,2,0,1,2};	
		print(sortColors(test));
	}

	public static int[] sortColors(int[] A){
		int begin = 0;
		int end = A.length - 1;

		int i = 0;
		int temp;
		while(i <= end){
			if(A[i] == 0){
				temp = A[i];
				A[i] = A[begin];
				A[begin] = temp; 
				++i;
				++begin;
			}else if(A[i] == 2){
				temp = A[i];
				A[i] = A[end];
				A[end] = temp;
				--end;
			}else{
				++i;
			}
		}
		return A;
	}

	public static void print(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
}
