package com.lti.Codility;

import java.util.Arrays;

public class PermCheck {
	public static int solution(int[] A)
	{
		Arrays.sort(A);
		int flag=1;
		for(int i=0;i<A.length;i++)
		{
			if(flag==A[i])
				flag++;
		}
		if(flag==A.length+1)
			return 1 ;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {1,4,5,2,7,6,3};
		System.out.println(PermCheck.solution(A));
	}

}
