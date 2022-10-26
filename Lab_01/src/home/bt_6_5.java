package home;

import java.util.Scanner;

public class bt_6_5 {
	public static void main(String[] args) {
		int sum = 0;
		double TB;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap do dai cua mang:");
		int length = keyboard.nextInt();
		int[] numArr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1));
			numArr[i] = keyboard.nextInt();
			sum = sum + numArr[i];
		}
		TB = (double) sum / length;
		// Sort array
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (numArr[j] < numArr[i]) {
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}

		// Print sorted array
		System.out.println("Sorted array");
		for (int i = 0; i < length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println("\nTong cac phan tu la: " + sum);
		System.out.println("Gia tri TB cua mang la: " + TB);
	}
}
