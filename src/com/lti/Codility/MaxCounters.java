package com.lti.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxCounters {
	static int[] solution(int N,int[] A)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=N;i++)
			list.add(0);
		int max=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>N)
				list.replaceAll(e->Collections.max(list));
			else
			{
				int x=list.get(A[i]);
				list.set(A[i], x+1);
			}	
		}
		int[] arr=new int[list.size()-1];
		for(int i=1;i<list.size();i++)
			arr[i-1]=list.get(i);
		return arr;
	}
	
	static int[] newSolution(int N,int[] A)
	{
		int[] arr=new int[N];
		int max=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>N)
			{
				for(int j=0;j<arr.length;j++)
				{
					arr[j]=max;
				}
			}
			else
			{
				arr[A[i]-1]+=1;
				if(arr[A[i]-1]>max)
					max=arr[A[i]-1];
			}
		}
		return arr;
	}
	
	public static int[] nextSolution(int N,int[] A)
	{
		
		 int[] count = new int[N];
	     int max = 0;
	     int lastUpdate = 0;
         for(int i = 0; i < A.length; i++){
            if(A[i] <= N){
	             if(count[A[i]-1] < lastUpdate){
	                    count[A[i]-1] = lastUpdate+1;   
	                }
	                else{
	                    count[A[i]-1]++;
	                }    
	                max = Math.max(max, count[A[i]-1]);
	            }
	         else{
	            lastUpdate = max;   
	            }
	        }  
	        for(int i = 0; i < N; i++){
	            if(count[i] < lastUpdate)
	                count[i] = lastUpdate;
	        }    
	        return count;
	}
public static void main(String[] args) {
	int[] A=new int[] {3,4,4,6,1,4,4};//2-0(2)
	int[] B=MaxCounters.nextSolution(5,A);
	for(int i=0;i<B.length;i++)
		System.out.println(B[i]);
}
}
