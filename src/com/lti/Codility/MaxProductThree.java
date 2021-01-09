package com.lti.Codility;

public class MaxProductThree {

	public static int solution(int[] A) {
		int j,v;
		for(int i=1;i<A.length;i++)
		{
			v=A[i];
			j=i;
			while(j>=1&&A[j-1]>v)
			{
				A[j]=A[j-1];
				j--;
			}
			A[j]=v;
		}
		int a1=A[A.length-1]*A[A.length-2]*A[A.length-3];
		int a2=A[0]*A[1]*A[A.length-1];
		return Math.max(a1, a2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {-12,1,2,3,4,5,-1,-2,-3};
		System.out.println(MaxProductThree.solution(A));
	}

}
