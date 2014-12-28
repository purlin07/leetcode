class MergeSortedArray
{
	public static void main(String[] args){
		int[] testA = new int[10];
		for(int i =0;i<5;i++){
			testA[i]=i+2;
		}
		int[] testB={2,4,6,8};
		print(testA);
		print(testB);
		merge(testA,5,testB,4);
		print(testA);
	}

	public static void merge(int A[],int m, int B[], int n){
		int k = n+m-1;
		int i=m-1,j=n-1;
		while(i>=0&j>=0){
			if(A[i]>=B[j]){
				A[k--]=A[i--];
			}else{
				A[k--]=B[j--];
			}
		}

		while(j>=0){
			A[k--]=B[j--];
		}
	}

	public static void print(int arr[]){
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
