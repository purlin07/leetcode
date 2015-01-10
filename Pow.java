class Pow
{
	public static void main(String[] args){
		System.out.println(pow2(2.0,5));	
		System.out.println(pow2(2.0,123));	
		System.out.println(pow2(2.0,-5));	
	}

	public static double pow(double x, int n){
		double result = 1;
		if(n == 0) return 1;

		if(n > 0){
			double half = pow(x,n/2);

			if(n%2 == 0){
				result = half * half;
			}else{
				result = half*half*x;
			}
		} else {
			if(n == Integer.MIN_VALUE){
				result = pow(x,Integer.MAX_VALUE)*x;
			}else{
				result = pow(x,-n);
			}
		}

		result = (n>0)?result:1/result;
		return result;

	}

	public static double pow2(double x, int n){
		double result = 1;
		if(n == 0) return 1;
		if(n < 0){
			if(n == Integer.MIN_VALUE) {
				return 1/pow2(x,Integer.MAX_VALUE)*x;
			}else{
			 	return 1/pow2(x, -n);		
			}
		} 
		
		while(n > 0){
			if(n%2 != 0){
				result = result * x;
			}
			x *= x;
			n = n/2;
		}
		return result;
	}
}
