package com.lti.Codility;

import java.util.Stack;

public class Brackets {
	public static int solution(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			switch(c)
			{
			case '}':
				if(!stack.isEmpty()&&stack.peek()=='{')
				{
					stack.pop();
				}
				else
					return 0;
				break;
			case ')':
				if(!stack.isEmpty()&&stack.peek()=='(')
					stack.pop();
				else 
					return 0;
				break;
			case ']':
				if(!stack.isEmpty()&&stack.peek()=='[')
					stack.pop();
				else
					return 0;
				break;
			default:
				stack.push(c);
			}
			System.out.println(stack);
		}
		return stack.size()==0? 1:0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{[()()]}";
		//System.out.println(Brackets.solution(s));
		System.out.println(Brackets.solution("}}}}]]]"));
		
	}

}
