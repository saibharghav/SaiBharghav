package com.lti.Codility;

import java.util.Stack;

public class Fish {
	public static int solution(int[] A,int[] B)
	{
		int alive=A.length,i;
		Stack<Integer> stack=new Stack<Integer>();
		for(i=0;i<A.length;i++)
		{
			if(B[i]==1)
				stack.push(A[i]);
			if(B[i]==0)
			{
				while(!stack.isEmpty())
				{
					if(stack.peek()>A[i])
					{
						alive--;
						break;
					}
					else if(stack.peek()<A[i])
					{
						alive--;
						stack.pop();
					}
	
				}
			}
		}
		return alive;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {4,3,2,0,5};
		int[] B=new int[] {0,1,0,0,0};
		System.out.println(Fish.solution(A, B));
		int[] C=new int[] {4,3,2,1,5};
		int[] D=new int[] {1,0,1,0,1};
		System.out.println(Fish.solution(C, D));
	}

}
