package home;

import java.util.Scanner;

public class bt_6_3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap n (N):");
		int n = keyboard.nextInt();
		int lastStars = n * 2 - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (lastStars - i * 2 - 1) / 2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2 + 1); k++) {
				System.out.print("*");
			}
			for (int j = 0; j < (lastStars - i * 2 - 1) / 2; j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
