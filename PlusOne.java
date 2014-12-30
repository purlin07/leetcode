class PlusOne
{
	public static void main(String[] args){
		int[] test1 = {1,2,3};
		int[] test2 = {1,1,9};
		int[] test4 = {9,9,9};


		int[] result=plusOne(test2);
		print(result);
	}

	public static int[] plusOne(int[] digits){
		if(digits == null){
			return null;
		}
		
		int length=digits.length;

		if(length<1){
			return null;
		}
		digits[length-1] += 1;
		for(int i=length-1;i>=0;i--){
			if(digits[i] > 9){
				if(i == 0){
					int[] result =  new int[length+1];
					result[length]=1;
					return result;
				}else{
					digits[i-1] += (digits[i]/10);	
					digits[i] = (digits[i]%10);
				}
				
			}else{
				break;
			}
		}
		return digits;
	}

	public static void print(int[] arr){
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
