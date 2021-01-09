package com.lti.Codility;

class FrogSolution
{
	public int solution(int X,int Y,int D)
	{
		if((Y-X)%D!=0)
			return (Y-X)/D+1;
		else 
			return (Y-X)/D; 
	}
}

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrogSolution f=new FrogSolution();
		System.out.println(f.solution(10,85,30));
	}

}
