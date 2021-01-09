package com.lti.Codility;

public class Hapynumber {
	public static int isHappyNumber(int num)
	{
		int rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		int res=num;
		while(res!=1)
		{
		res=Hapynumber.isHappyNumber(res);
		System.out.println(res);
		if(res==num||res==4)
			break;
		}
		if(res==1)
			System.out.println("Happy Number "+num);
		else
			System.out.println("Not a happy number");
	}

}
