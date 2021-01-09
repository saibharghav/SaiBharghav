package com.lti.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FrogRiverOne {
	public static int anagram(String a, String b)
	{
		int[] A=new int[26];
		int[] B=new int[26];
		int min=0,j=0;
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			j=(int)c-97;
			A[j]+=1;
		}
		for(int i=0;i<b.length();i++)
		{
			char c=b.charAt(i);
			j=(int)c-97;
			B[j]+=1;
		}
		for(int i=0;i<26;i++)
		{
			int c=Math.abs(A[i]-B[i]);
			min+=c;
		}
		return min;
	}
	public static int largest(int[] input,int MaxIndex)
	{
//		HashSet<Integer> list=new HashSet<Integer>();
//		for(int i=0;i<input.length;i++) {
//				list.add(input[i]);
//		}
		ArrayList<Integer> lis=new ArrayList<Integer>();
		for(int i=0;i<input.length;i++)
		{
			if(lis.contains(input[i])==false)
			{
				lis.add(input[i]);
			}
		}
		Collections.sort(lis);;
		return (int) lis.get(lis.size()-MaxIndex);
	}
	
	public static int largest1(int[] input,int time)
	{
		int g,min=0;
		for(int i=0;i<input.length;i++)
		{
			min=i;
			for(int j=i+1;j<input.length;j++)
			{
				if(input[j]<input[min])
				{
					min=j;
				}
				
			}
			int temp=input[i];
			input[i]=input[min];
			input[min]=temp;
		}
		return input[input.length-time];
	}
	public static int solution(int x,int[] A)
	{
		int C=0;
		int[] B=new int[x+1];
		for(int i=0;i<A.length;i++)
		{
			if(B[A[i]]==0)
				C+=1;
			if(C==x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(FrogRiverOne.anagram("apple", "appollo"));
		int[] A=new int[] {1,3,1,4,2,3,5,4};
		int x=5;
		System.out.println(FrogRiverOne.solution(x,A));
		boolean[] bool=new boolean[2];
		System.out.println(bool[0]);
		
	}

}
