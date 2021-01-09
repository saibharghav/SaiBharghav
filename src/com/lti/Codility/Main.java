package com.lti.Codility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Solution123
{
	public int findMaxSum (int[] A)
	{
		int max=0,min=100,j,k;
		for(int i=0;i<A.length;i++)
		{
			j=A[i];
			while(j!=0)
			{
				k=j%10;
				if(k>max)
					max=k;
				if(k<min)
					min=k;
				j=j/10;
			}
		}
		return max+min;
	}
	public int findMaxSum2(int[] A)
	{
		int countMax=0,countMin=0,max=0,min=100,i,j,k;
		for(i=0;i<A.length;i++)
		{
			j=A[i];
			while(j!=0)
			{
				k=j%10;
				if(k>max) {
					max=k;
					countMax=0;
				}
				if(k<min) {
					min=k;
					countMin=0;
				}
				if(k==max)
					countMax+=1;
				if(k==min)
					countMin+=1;
				j=j/10;
			}
		}
		System.out.println(max+" "+min+" "+countMax+" "+countMin);
		return max*countMax+min*countMin;		
	}
}
public class Main {
	static boolean anagram(String a, String b)
	{
		char[] c=a.toLowerCase().toCharArray();
        char[] d=b.toLowerCase().toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<c.length;i++)
        {
            if(map.containsKey(c[i]))
            {
                int j=map.get(c[i]);
                map.put(c[i],j+1);
            }
            else
                map.put(c[i],1);
        }
        System.out.println(map);
        for(int i=0;i<d.length;i++)
        {
            if(map.containsKey(d[i]))
            {
                int j=map.get(d[i]);
                map.put(c[i],j-1);
            }
        }
        Collection c1=map.values();
        ArrayList<Integer> list=new ArrayList<Integer>(c1);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=0)
            {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution123 s=new Solution123();
		int[] A=new int[] {12,34,56,91,45,11,77};
		//System.out.println(s.findMaxSum2(A));
		System.out.println(Main.anagram("hello", "Hello"));
	}

}
