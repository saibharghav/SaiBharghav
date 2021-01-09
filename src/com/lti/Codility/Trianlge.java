package com.lti.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trianlge {
	public static int solution(int[] A)
	{
		int j;
		ArrayList list=(ArrayList) Arrays.asList(A);
		Arrays.sort(A);
		if(A.length<3)
			return 0;
		for(int i=0;i<A.length-2;i++)
		{
			if(A[i+2]>A[i+1]+A[i])
			{
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {10,2,5,1,8,20};
		System.out.println(Trianlge.solution(A));
	}

}
