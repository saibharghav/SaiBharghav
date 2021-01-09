package com.lti.Codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dominator {
	public static int solution(int[] A)
	{
		if(A.length==1)
			return 0;
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
			set.add(A[i]);
		int dom=0,d=0,num = 0;
		int[] B=A.clone();
		for(int i=0;i<A.length-1;i++)
		{
			if(set.contains(A[i])&&A[i]==A[i+1])
			{
				dom+=1;
			}
			if(dom>d) {
				d=dom;
				num=A[i];
			}
		}
		if(dom>(A.length/2)-1)
			return -1;
		for(int i=0;i<A.length-1;i++)
		{
			if(num==B[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {3,4,3,2,3,-1,3,3};
		System.out.println(Dominator.solution(A));
	}

}
