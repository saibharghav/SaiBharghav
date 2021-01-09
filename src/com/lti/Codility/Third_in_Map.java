package com.lti.Codility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Third_in_Map {
	
	static String[] sortByAge(String[] input)
	{
		String[] res=new String[input.length];
		String[] pile=new String[2];
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<input.length;i++)
		{
			pile=input[i].split("-");
			map.put(pile[0],Integer.parseInt(pile[1]));
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		String[] input= {"Ben-32","TIm-18","Tom-4"};
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
