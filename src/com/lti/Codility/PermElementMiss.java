package com.lti.Codility;
import java.util.Arrays;
import java.util.Collections;

public class PermElementMiss {
	
	public float solution(int[] A)
	{
		int sum=0,count=0,flag=0;
		for(int i=2;i<A.length;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) {
					flag+=1;
					break;
				}
			}
			if(flag==0)
			{
				sum+=A[i];
				count+=1;
			}
			flag=0;
		}
		System.out.println(sum+" "+count);
		return sum/count;
	}
	public int[] Arr(int n)
	{
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=i;
		return arr;
	}
	public int solution1(int[] A)
	{
		int min=100,max=0,ret=0,sum=0,temp=0;
		for(int i=0;i<A.length;i++)
		{
			sum+=A[i];
			if(A[i]>max)
				max=A[i];
			else if(A[i]<min)
				min=A[i];
			if(i==A.length-1)
				ret=((i+2)*(i+3)/2)-sum;
		}
		return ret;
	}
	public int solution3(int[] A)
	{
		if (A.length == 0)
	        return 1;
	    int sumOfAllNumbers = 0;
	    for (int num : A)
	        sumOfAllNumbers += num;
	    long N = A.length;
	    long expectedSumOfAllNumbers = ((N + 1)*(N + 2))/2;
	    long missingNumber = expectedSumOfAllNumbers - sumOfAllNumbers;
	    return (int) missingNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermElementMiss p=new PermElementMiss();
//		int[] A=p.Arr(100000);
//		System.out.println(p.solution(A));
		int[] A=new int[] {2,3,4,6,7,8};
		System.out.println(p.solution3(A));
	}

}
