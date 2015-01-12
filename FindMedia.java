class FindMedian
{
	public static void main(String [] args){
		int[] test1 = {2,4,6,8};
		int[] test2 = {1,3,5,7,9};
		
//		System.out.println(findKth(test1,0,3,test2,0,4,4));
//		System.out.println(findKth(test1,0,3,test2,0,4,1));
//		System.out.println(findKth(test1,0,3,test2,0,4,5));
//		System.out.println(findKth(test1,0,3,test2,0,4,0));
//		
//		System.out.println(findMedian(test1,test2));

		int[] test3 = {1,3};
		int[] test4 = {2,4};

		System.out.println(findKth(test3,0,1,test4,0,1,2));
		System.out.println(findKth(test3,0,1,test4,0,1,3));
		System.out.println(findMedian(test3,test4));
		
	}

	public static double findMedian(int A[], int B[]){
		int m = A.length;
		int n = B.length;
		if((m+n) % 2 != 0){
			int mid = (m+n)/2 + 1;
			System.out.println("==="+mid);
			return findKth(A,0,m-1,B,0,n-1,mid);
		}else{
			double a = findKth(A,0,m-1,B,0,n-1,(m+n)/2);
			double b = findKth(A,0,m-1,B,0,n-1,(m+n)/2 + 1);
			return (a+b)/2;
		}
	}

	public static double findKth(int A[],int startA,int endA,int B[],int startB, int endB,int k){
		System.out.println("endA =" +  endA + "startA = "+startA);
		System.out.println("endB =" + endB + "startB = "+startB);
		int m = endA - startA + 1;
		int n = endB - startB + 1;
		System.out.println("m = " + m + "n = "+ n);
		if(k == 0){
			return 0 ;
		}
		if (m > n){
			return findKth(B,startB,endB,A,startA,endA,k);
		}	
		if(m <= 0){
			return B[startB + k - 1];
		}
		if(n <= 0){
			return A[startA + k - 1];
		}
		
		if(k == 1){
			return A[startA] > B[startB]?B[startB]:A[startA];
		}
		int pa = k/2<m ? k/2 : m;
		int pb = k - pa;
System.out.println("pa = "+pa+" pb= "+pb);
		if(A[startA+pa - 1] < B[startB+pb - 1]){
			return findKth(A,startA+pa,endA,B,startB,endB-pb+1,k-pa);
		}else if(A[startA+pa - 1] > B[startB+pb - 1]){
			return findKth(A,startA,endA-pa+1,B,startB+pb,endB,k-pb);
		}else{
			return A[startA+pa - 1];
		}


	}
}
