package com.lti.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class First {
	public int[] swap(int[] input)
	{
		for (int i=0;i<input.length;i++)
		{
			String s;
			s=Integer.toString(input[i]);
			StringBuffer sb=new StringBuffer(s);
			sb=sb.reverse();
			input[i]=Integer.parseInt(sb.toString());
		}
		java.util.Arrays.sort(input);
		return input;
	}
	public static int solution(int[] A)
	{
		List<int[]> set=Arrays.asList(A);
		//for(int i=0;i<A.length;i++)
			//set.add(A[i]);
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		return set.size();
	}
	
	public static void main(String[] args) {
		int[] A=new int[] {6,3,2,4,12,1,2,2,2,24,4,4,5,6,7,5,5,6,7};
		System.out.println(First.solution(A));
	}

}
