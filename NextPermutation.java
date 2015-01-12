class NextPermutation
{
	public static void main(String[] args){
		int[] test = {1,2,3,4};
		int[] test2 = {4,3,2,1};
		int[] test4 = {3,2,1};
		int[] test3 = {1,2,4,3};

		print(nextPermutation(test));
		print(nextPermutation(test2));
		print(nextPermutation(test3));
		print(nextPermutation(test4));
	}

	public static int[] nextPermutation(int[] num){
		int n = num.length - 1;
		
		int i = n;
		int j = n;
		int temp;
		if(n <= 0){
			return num;
		}

		if(num[n] > num[n - 1]){
			num[n] = num[n-1] - num[n];
			num[n-1] = num[n-1] - num[n];
			num[n] = num[n-1]+num[n];
			return num;
		}

		while (num[i] <= num[i - 1]){
			--i;
			if(i == 0){
				for(int k = 0;k < (n+1)/2; k++){
					num[k] = num[n-k] - num[k];
					num[n-k] = num[n-k] - num[k];
					num[k] = num[n-k] + num[k];
				}
				return num;
			}
		}
		i = i -1;	
		print(num);
		while(num[i] >=  num[j]){
			--j;
		}
		System.out.println("i="+i+"j="+j);
		num[i] = num[j] - num[i];
		num[j] = num[j] - num[i];
		num[i] = num[j] + num[i];
		print(num);
		for(int k = 0; k < (n -i)/2; ++k ){
			num[i+1+k] = num[n-k] - num[i+1+k];
			num[n-k] = num[n-k] - num[i+1+k];
			num[i+1+k]=num[n-k]+num[i+1+k];
		}

		return num;

	}
	public static void print(int[] arr){
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}

}
