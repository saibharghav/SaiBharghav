package com.lti.Codility;
import java.util.Arrays;
public class DiscInteractions {
	public static int solution(int[] A)
	{
		int[] start=new int[A.length];
		int[] end=new int[A.length];
		for(int i=0;i<A.length;i++)
		{
			start[i]=i-A[i];
			end[i]=i+A[i];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int number=0,j=0;
		
		for(int i=0;i<A.length;i++)
		{
			while(j<A.length&&start[j]<=end[i])
			{
				number=number+j;
				number=number-i;
				j++;
			}
			System.out.println(j);
		}
		if(number>10000000)
			return -1;
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {1,5,2,1,4,0};
		System.out.println(DiscInteractions.solution(A));
	}

}
