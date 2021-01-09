package com.lti.Codility;

import java.util.Arrays;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=10;
		int[] coins=new int[] {1,2,5};
		int count=0;
		Arrays.sort(coins);
		int[][] combinations=new int[coins.length+1][amount+1];
		for(int i=0;i<coins.length+1;i++)
			combinations[i][0]=0;
		for(int i=0;i<amount+1;i++)
		{
			combinations[0][i]=0;
		}
		for(int i=1;i<coins.length+1;i++)
		{
			for(int j=1;j<amount+1;j++)
			{
				if(j>=coins[i-1])
				{
					if(j%coins[i-1]==0)
						combinations[i][j]+=j/coins[i-1];
					if(j%coins[i-1]!=0)
					{
						combinations[i][j]+=combinations[i-1][j-j/coins[i-1]];
					}
				}
			}
		}
		for(int i=0;i<coins.length+1;i++)
		{
			for(int j=0;j<amount+1;j++)
			{
				System.out.print(combinations[i][j]+" ");
			}
			System.out.println();
		}
	}
}




