package com.lti.Codility;

public class TapeEqullibirum {

	public int solution(int[] A) {
	    
	    long sumright = 0;
	    long sumleft = 0;
	    long ans;
	    for (int i =1;i<A.length;i++)
	        sumright += A[i];
	    sumleft = A[0];
	    ans =Math.abs( sumleft - sumright );
	    for (int P=1; P<A.length; P++)
	    {
	        if (Math.abs(sumleft-sumright)<ans)
	            ans = Math.abs(sumleft-sumright);
	        sumleft += A[P];
	        sumright -=A[P];
	    }
	    return (int) ans;  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {3,1,2,5,6,9};
		System.out.println(new TapeEqullibirum().solution(A));
		
	}
}
