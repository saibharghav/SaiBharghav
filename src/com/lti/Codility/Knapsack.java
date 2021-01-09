package com.lti.Codility;

public class Knapsack {

	public static int knapsack(int[] values,int[] weight,int weightCapacity)
	{
		int length=values.length;
		int[][] matrix=new int[length+1][weightCapacity+1];
		for(int i=0;i<=length;i++)
		{
			for(int w=0;w<=weightCapacity;w++)
			{
				if(i==0||w==0)
					matrix[i][w]=0;
				else if(weight[i-1]<=w)
				{
					matrix[i][w]=Math.max(values[i-1]+matrix[i-1][w-weight[i-1]], matrix[i-1][w]);
				}
				else
					matrix[i][w]=matrix[i-1][w];
			}
			
		}
		return matrix[length][weightCapacity];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values=new int[] {60,80,100,120};
		int[] weight=new int[] {10,20,35,40};
		int weightCapacity=90;
		System.out.println(Knapsack.knapsack(values,weight,weightCapacity));
		
	}

}
