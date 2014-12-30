import java.util.HashMap;
class TwoSum
{
	public static void main(String[] args){
		int[] test = {3,2,7};
		int[] result = twoSum2(test,9);
		print(result);
		
	}

	public static int[] twoSum(int[] numbers,int target){
		int length=numbers.length;
		if(length < 2){
			return null;
		}
		int[] result = new int[2];
		boolean end = false;
		int index1=0,index2=1;
		for(index1=0;index1<length-1;index1++){
			int tem = target-numbers[index1];
			for(index2=index1+1;index2<length;index2++){
				if(numbers[index2] == tem){
					end = true;
					break;
				}
			}
			if(end == true){
				break;
			}
		}

		if(index1 <= index2){
			result[0]=index1+1;
			result[1]=index2+1;
		}else{
			result[0]=index2+1;
			result[1]=index1+1;
		}
		return result;
	}

	public static int[] twoSum2(int[] numbers,int target){
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		int[] result = new int[2];
		int length = numbers.length;
		for(int index1=0;index1<length;index1++){
			int tem = target - numbers[index1];
			if(hmap.containsKey(numbers[index1])){
				int index2=hmap.get(numbers[index1]);
				if(numbers[index1]<=numbers[index2]){
					result[0]=index1+1;
					result[1]=index2+1;
				}else{
					result[0]=index2+1;
					result[1]=index1+1;
				}
				break;
			}else{
				hmap.put(tem,index1);
			}
		}
		return result;
	}

	public static void print(int[] arr){
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
