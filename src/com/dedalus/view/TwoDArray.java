package com.dedalus.view;

public class TwoDArray {

	public static void main(String[] args) {
		
		//int[][] A = new int[3][4];
		
		int A[][] = {{1,2,3,4},{5,6,7,8},{9,2,4,8}};
		
		for (int i=0; i<A.length; i++)
		{
			System.out.print("[");
			for (int j=0; j<A[0].length;j++)
			{
				System.out.print(A[i][j]+" ");
				
			}
			System.out.println("]");
		}
		
		// TODO Auto-generated method stub

	}

}
