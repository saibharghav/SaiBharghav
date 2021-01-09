package com.lti.Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Third {

	static String[] sortByAge(String[] input)
	{
		String[] pair=new String[2];
		List list=new ArrayList();
		for(int i=0;i<input.length;i++)
		{
			pair=input[i].split("-");
			list.add(Integer.parseInt(pair[1]));
		}
		Collections.sort(list);
		System.out.println(list);
		String[] res=new String[input.length];
		for(int i=0;i<input.length;i++)
		{
			int k=list.indexOf(Integer.parseInt(input[i].split("-")[1]));
			res[i]=input[k];
			list.set(k,0);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		String[] input= {"Ben-32","TIm-18","Nivi-6","Tom-4"};
		String[] result=Third.sortByAge(input);
		for(String i:result)
		{
			System.out.println(i);
		}
		System.out.println("-----------------");
		String[] inputs= {"A-21","B-21","C-23","D-23","E-25"};
		result=Third.sortByAge(inputs);
		for(String i:result)
		{
			System.out.println(i);
		}
		long endTime=System.nanoTime();
		System.out.println((endTime-startTime)/1000000);
	}

}
