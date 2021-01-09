package com.lti.Codility;
import java.util.HashMap;
import java.util.Map;
class Odd
{
	public int solution(int[] A)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
	       int b = 0;
	       if(A.length > 0 && A.length < 1_000_000) {
	         for(int i=0; i < A.length; i++){
	           if(map.containsKey(A[i]))
	               map.put(A[i],map.get(A[i]) + 1);
	            else 
	               map.put(A[i], 1);
	         }
	         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	             if(entry.getValue()%2!=0){
	                 b = entry.getKey();
	                 break;
	             }
	         }
	       }
	     return b;
	}
}	
public class OddOccurences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]n= new int[]{1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9};
		Odd s2=new Odd();
		int a=s2.solution(n);
		System.out.println(a);
	}

}
