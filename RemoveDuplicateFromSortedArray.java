class RemoveDuplicateFromSortedArray{
	public static void main(String args[]){
		int[] test1={1,1,1,2,2,2};
		int[] test2 = null;
		int[] test3={};
		int[] test4={1,1,1,1,1};
		int[] test5={1,1,2,2,3,4,5};
		int[] test6={1,2,2,3,3,4,4};

		int result1 = removeDuplicateFromSortedArray(test1);
		int result2 = removeDuplicateFromSortedArray(test2);
		int result3 = removeDuplicateFromSortedArray(test3);
		int result4 = removeDuplicateFromSortedArray(test4);
		int result5 = removeDuplicateFromSortedArray(test5);
		int result6 = removeDuplicateFromSortedArray(test6);
		
		System.out.println(result1);
		print(test1);
		System.out.println(result2);
		print(test2);
		System.out.println(result3);
		print(test3);
		System.out.println(result4);
		print(test4);
		System.out.println(result5);
		print(test5);
		System.out.println(result6);
		print(test6);
	}

	public static int removeDuplicateFromSortedArray(int arr[]){
		if(arr == null){
			return 0;
		}
		int length = arr.length;
		if(length < 2){
			return length;
		}
		int newlength = 0;

		int i = 1;

		while (i < length){
			if(arr[i] == arr[newlength]){
				++i;
			}else{
				arr[newlength+1]=arr[i];
				++newlength;
				++i;
			}
		}
		return newlength+1;
	}

	public static void print(int arr[]){
		if(arr==null){
			return;
		}
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
