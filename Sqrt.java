class Sqrt
{
	public static void main(String[] args){
		System.out.println(sqrt(16));
		System.out.println(sqrt(10));
		System.out.println(sqrt(1));
		System.out.println(sqrt(2147483647));
	}

	public static int sqrt(int x){
		if(x == 0){
			return 0;
		}
		int end = x/2 + 1;
		int start = 1;
		int result;
		int mid = (start + end)/2;
		while(start <= end){
			 mid = (start + end)/2;
			 if(mid == x/mid){
			 	return mid;
			 }else if(mid > x/mid){
			 	end = mid - 1;
			 }else{
			 	start = mid + 1;
			 }
		}
		result = mid > x/mid? mid-1:mid;
		return result;
		
	}	

}
