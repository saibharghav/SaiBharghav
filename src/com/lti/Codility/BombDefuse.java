package com.lti.Codility;

public class BombDefuse {
	public int solution(int A)
	{
		int a=0,sum=0,rem,B=A;
		while(A!=0)
		{
			rem=A%10;
			sum+=rem;
			A/=10;
		}
		a=B+sum-1;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] bomb=new int[] {12,5,8,4};
//		int a=2,j;
//		int count=0;
//		int length=bomb.length;
//		int[] result=new int[bomb.length];
//		for(int i=0;i<length;i++)
//		{
//			for(int k=i+1;k<a+i+1;k++)
//			{
//				result[i]+=bomb[k%length];
//			}
//		}
//		for(int i=0;i<length;i++)
//			System.out.println(result[i]);
		System.out.println(new BombDefuse().solution(734));
	}

}
