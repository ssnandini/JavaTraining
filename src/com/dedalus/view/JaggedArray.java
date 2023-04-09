package com.dedalus.view;

public class JaggedArray {

	public static void main(String[] args) {

		int[][] A = new int[3][];

		A[0] = new int[5];
		A[1] = new int[3];
		A[2] = new int[2];

		for (int i[] : A)

		{
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		// TODO Auto-generated method stub

	}

}
