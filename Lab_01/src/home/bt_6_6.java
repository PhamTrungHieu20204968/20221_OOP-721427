package home;

import java.util.Scanner;

public class bt_6_6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int row, column;
		System.out.println("Nhap so hang:");
		row = keyboard.nextInt();
		System.out.println("Nhap so cot:");
		column = keyboard.nextInt();

		int[][] matrice1 = new int[column][row];
		int[][] matrice2 = new int[column][row];
		int[][] sum = new int[column][row];
		
		// Nhap ma tran 1
		System.out.println("Ma tran 1:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Nhap phan tu " + (i + 1) + (j + 1));
				matrice1[j][i] = keyboard.nextInt();
			}
		}

		// Nhap ma tran 2
		System.out.println("Ma tran 2:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Nhap phan tu " + (i + 1) + (j + 1));
				matrice2[j][i] = keyboard.nextInt();
			}
		}

		// Add 2 ma tran
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum[j][i] = matrice2[j][i] +matrice1[j][i];
			}
		}
		
		System.out.println("---------------------------------------");
		//In ra man hinh
		System.out.println("Ma tran 1:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrice1[j][i] +"\t");
			}
			System.out.println("");
		}
		
		System.out.println("Ma tran 2:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrice2[j][i] +"\t");
			}
			System.out.println("");
		}
		
		System.out.println("Ma tran tong:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(sum[j][i] +"\t");
			}
			System.out.println("");
		}
	}
}
