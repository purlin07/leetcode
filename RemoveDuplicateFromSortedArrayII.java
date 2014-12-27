class RemoveDuplicateFromSortedArrayII{
	public static void main(String[] args){
		int[] test = {1,1,1,2,2,3};
		int[] test1 = {1,2,3,4,5,6};
		int[] test2 = {1,1};
		int[] test3 = {1,1,1,1,1,1};
		int[] test4 = {};
		int[] test5 = {1,1,1};
		int[] test6 = {2};
		int[] test7 = {1,1,2,2,3,3,4,4};
//		System.out.println(removeDuplicatesFromSortedArrayII(test));
//		print(test);
//		System.out.println(removeDuplicatesFromSortedArrayII(test1));
//		print(test1);
//		System.out.println(removeDuplicatesFromSortedArrayII(test2));
//		print(test2);
//		System.out.println(removeDuplicatesFromSortedArrayII(test3));
//		print(test3);
//		System.out.println(removeDuplicatesFromSortedArrayII(test4));
//		print(test4);
//		System.out.println(removeDuplicatesFromSortedArrayII(test5));
//		print(test5);
//		System.out.println(removeDuplicatesFromSortedArrayII(test6));
//		print(test6);
//		System.out.println(removeDuplicatesFromSortedArrayII(test7));
//		print(test7);

		System.out.println(removeDuplicatesFromSortedArrayII2(test));
		print(test);
		System.out.println(removeDuplicatesFromSortedArrayII2(test1));
		print(test1);
		System.out.println(removeDuplicatesFromSortedArrayII2(test2));
		print(test2);
		System.out.println(removeDuplicatesFromSortedArrayII2(test3));
		print(test3);
		System.out.println(removeDuplicatesFromSortedArrayII2(test4));
		print(test4);
		System.out.println(removeDuplicatesFromSortedArrayII2(test5));
		print(test5);
		System.out.println(removeDuplicatesFromSortedArrayII2(test6));
		print(test6);
		System.out.println(removeDuplicatesFromSortedArrayII2(test7));
		print(test7);
	}

	public static int removeDuplicatesFromSortedArrayII(int arr[]){
		if(arr == null){
			return 0;
		}
		int length = arr.length;
		if(length < 3){
			return length;
		}
		int newlength = 1;
		int i=0;
		int j=1;
		boolean flag = false;

		while(j<length){
			if(arr[j] == arr[i]){
				if(!flag){
					arr[newlength++]=arr[j];
					flag=true;
				}
			}else{
				i=j;
				arr[newlength++]=arr[j];
				flag = false;
			}
			++j;
		}
		return newlength;
	}
	
	public static int removeDuplicatesFromSortedArrayII2(int arr[]){
		if (arr == null){
			return 0;
		}
		int length = arr.length;
		if(length<3){
			return length;
		}
		int newlength=2;
		int i = 2;
		while(i<length){
			if(arr[i] != arr[newlength-2]){
				arr[newlength++] = arr[i];
			}
			++i;
		}
		return newlength;
	}

	public static void print(int arr[]){
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}

}
