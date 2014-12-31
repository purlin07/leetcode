import java.util.Arrays;
class SumClosest
{
	public static void main(String[] args){
		int[] test={1,2,4,8,16,32,64,128};
		System.out.println(sumClosest(test,82));
	}

	public static int sumClosest(int[] num,int target){
		int length=num.length;
		
		Arrays.sort(num);
		int i=0;
		int j=1;
		int k=length-1;
		int min = Math.abs(num[i]+num[j]+num[k]-target);
		int diff;
		int result = num[i]+num[j]+num[k];
		for(i=0; i<length; i++){
			j=i+1;
			k=length-1;
			while(j<k){
				int sum = num[i]+num[j]+num[k];
				diff = Math.abs(sum - target);
				if(diff==0) return sum;

				if(diff<min){
					min    = diff;
					result = sum;
				}

				if(sum>=target){
					k--;
				}else{
					j++;
				}
			}
		}
		return result;
	}
}
		
		
