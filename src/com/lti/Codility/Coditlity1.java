package com.lti.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution
{
	public int solution(int N)
	{
		int a=0,b=0;
		String s = Integer.toBinaryString(N);
		char check;
		char[] a1=s.toCharArray();
		for(int i=0;i<a1.length;i++)
		{
			check=a1[i];
			if(check=='0')
			{
				a+=1;
			}
			if(check=='1')
			{
				if(a>b)
				{
					b=a;
				}
				a=0;
			}
		}
		return b;
	}
	public int myMethod(String s)
	{
		int i=Integer.parseInt(s, 2);
		int j=0;
		while(i!=1)
		{
			if(i%2==0) {
				i= i/2;
				j+=1;
			}
			else if(i%2==1) {
				i=i+1;
				j+=1;
				}
		}
		return j;
	}
}

class Solution1
{
	public int[] solution(int[] A,int K)
	{
		int[] b=new int[A.length];
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) 
			a1.add(A[i]);
		Collections.rotate(a1, K);
		for(int i=0;i<a1.size();i++)
			b[i]=a1.get(i);
		return b;
	}
}


class Solution2
{
	public int solution(int[] A)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
	       int b = 0;
	       if(A.length > 0 && A.length < 1_000_000) {
	         for(int i=0; i < A.length; i++){
	           if(map.containsKey(A[i]))
	               map.put(A[i],map.get(A[i]) + 1);
	            else 
	               map.put(A[i], 1);
	         }
	         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	             if(entry.getValue()%2==0){
	                 b = entry.getKey();
	                 break;
	             }
	         }
	       }
	     return b;
	}
}
	
public class Coditlity1 {
	
public static void main(String[] args) {
	int[]n= new int[]{1,1,3,3,5,5,6,7,7};
	Solution2 s2=new Solution2();
	int a=s2.solution(n);
	System.out.println(a);
}
}
