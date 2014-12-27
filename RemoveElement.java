class RemoveElement
{
	public static void main(String[] args){
		int[] test=null;
		int value=3;
		int[] test1={1,2,3,4,5,6};
		int[] test2={1,2,4,5,6,7};
		int[] test3={3,3,3,3,3,3};
		int[] test4={};
		int[] test5={1,2,3,3,3};
		
		System.out.println(removeElement(test1,value));
		print(test1);
		System.out.println(removeElement(test2,value));
		print(test2);
		System.out.println(removeElement(test3,value));
		print(test3);
		System.out.println(removeElement(test4,value));
		print(test4);
		System.out.println(removeElement(test5,value));
		print(test5);
	}

	public static int removeElement(int arr[],int value){
		if(arr == null){
			return 0;
		}
		int length = arr.length;
		if(length<1){
			return 0;
		}
		int j=0;
		for(int i=0;i<length;++i){
			if(arr[i]!=value){
				arr[j]=arr[i];
				++j;
			}
		}
		return j;
	}

	public static void print(int arr[]){
		if(arr == null){
			return;
		}
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
