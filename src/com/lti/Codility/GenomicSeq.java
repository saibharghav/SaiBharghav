package com.lti.Codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenomicSeq {
	public static int[] solution(String S,int[] P,int[] Q)
	{
		int a,b;
		int[] R=new int[P.length];
		String s;
		for(int i=0;i<P.length;i++)
		{
			s=S.substring(P[i],Q[i]+1);
			if(s.indexOf('A')!=-1)
				R[i]=1;
			else if(s.indexOf('C')!=-1)
				R[i]=2;
			else if(s.indexOf('G')!=-1)
				R[i]=3;
			else
				R[i]=4;
		}
		return R;
	}
	
	public static int[] solution1(String S,int[] P,int[] Q)
	{
        int[][] genoms = new int[3][S.length()+1];
        short a, c, g;
        for (int i=0; i<S.length(); i++) {
            a = 0; c = 0; g = 0;
            if ('A' == (S.charAt(i))) {
                a=1;
            }
            if ('C' == (S.charAt(i))) {
                c=1;
            }
            if ('G' == (S.charAt(i))) {
                g=1;
            }
            genoms[0][i+1] = genoms[0][i] + a;
            genoms[1][i+1] = genoms[1][i] + c;
            genoms[2][i+1] = genoms[2][i] + g;
        }

//        for(int i=0;i<genoms.length;i++) {
//        	for(int j=0;j<genoms[0].length;j++)
//        	{
//        		System.out.print(genoms[i][j]+" ");
//        	}
//        	System.out.println();
//        }
        int[] result = new int[P.length];
        for (int i=0; i<P.length; i++) {
            int fromIndex = P[i]+1;
            int toIndex = Q[i]+1;
            if (genoms[0][toIndex] - genoms[0][fromIndex-1] > 0) {
                result[i] = 1;
            } else if (genoms[1][toIndex] - genoms[1][fromIndex-1] > 0) {
                result[i] = 2;
            } else if (genoms[2][toIndex] - genoms[2][fromIndex-1] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="CAGCCTA";
		int[] P=new int[] {2,5,0};
		int[] Q=new int[] {4,5,6};
		int[] a=GenomicSeq.solution1(s, P, Q);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
