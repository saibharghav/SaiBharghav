package com.lti.Codility;

import java.util.Arrays;

public class SmallestMisi {
	public static int solution(int[] A)
	{
		int min=1;
		boolean bool=false;
		Arrays.sort(A);
		for(int i=0;i<A.length;i++)
		{
			if(A[i]<=0)
				continue;
			else if(A[i]==min)
				min+=1;
		}
		return min;
	}
	public static void main(String[] args) {
		int[] A=new int[] {1,3,6,4,1,2};
		System.out.println(SmallestMisi.solution(A));
	}

}
