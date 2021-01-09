package com.lti.Codility;

public class Fourth {
	 
	public static int countNotes(int money)
	{
		int notes500=money/500,notes100=(money-500*(notes500))/100,notes20=(money-500*(notes500)-100*(notes100))/20,notes10=(money-500*(notes500)-100*(notes100)-20*(notes20))/10;		
		return notes500+notes100+notes20+notes10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fourth.countNotes(1130));
	}

}
