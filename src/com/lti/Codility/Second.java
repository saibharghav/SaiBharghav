package com.lti.Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second {
	static char[] moveVowels(String input)
	{
		int i,j,k=0;
		char[] arr=input.toCharArray();
		char[] res=new char[arr.length];
		List<Character> list=new ArrayList<Character>();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
				list.add(arr[i]);
		}
		Collections.sort(list);
		for(i=0;i<arr.length;i++)
		{
			if(!list.contains(arr[i]))
				list.add(arr[i]);
			res[i]=list.get(i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		String inputs="cosmopolitan";
		char[] res=Second.moveVowels(inputs);
		for(char C: res)
		{
			System.out.println(C);
		}
		long endTime=System.nanoTime();
		System.out.println((endTime-startTime)/1000000);
	}

}
