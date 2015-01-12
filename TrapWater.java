class TrapWater
{
	public static void main(String[] args){
		int[] test = {0,1,0,2,1,0,1,3,2,1,2,1};
		int[] test2 = {0,0,0};
		int[] test3 = {2,0,2};
		int[] test4 = {5,4,1,2};
		int[] test5 = {0,7,1,4,6};
		int[] test6 = {2,8,5,5,6,1,7,4,5};
		System.out.println(trap(test));
		System.out.println(trap(test2));
		System.out.println(trap(test3));
		System.out.println(trap(test4));
		System.out.println(trap(test5));
		System.out.println(trap(test6));
	}

	public static int trap(int[] A){
		int result = 0;

		if(A == null){
			return 0;
		}

		int n = A.length;

		if(n <= 2){
			return 0;
		}

		int start = 0;
		int end = 0;

		while(start < n-1){
			//find start
			while(A[start] <= A[start+1]){
				++start;
				if(start >= n -1){
					return result;
				}
			}
			System.out.println("start = " + start);
			//find end
			end = start + 2;
			if(end > n-1){
				return result;
			}else{

				int e = start + 2;
				if(e > n-1) return result;
				//find the first element bigger then A[start]
				while(A[start] > A[e]){
					++e;
					if(e > n-1) break;
				}

				if(e <= n - 1) {
					end = e;
				}else{
					System.out.println("end = "+ end);
					while(A[end] <= A[end - 1]){
						++end;
						System.out.println("end = "+ end);
						if(end > n -1) return result;
					}
					System.out.println("end = "+ end);
					if(end < n-1){
						int max = end;
						for(int i = end; i < n;i++){
							if(A[i] >= A[max]){
								max = i;
							}
						}
						end = max;
					}

				}

			}


			int edge = A[start]>A[end]?A[end]:A[start];
			System.out.println("edge = " + edge);
			for(int i = start+1;i<= end - 1;i++){
				if((edge - A[i]) > 0){
					result += (edge - A[i]);	
				}
				System.out.println("result = " + result);
			}
			start = end;
		}
		return result;

	}
}


