package home;

import java.util.Scanner;

public class bt_6_4 {
	public static void main(String[] args) {
		String strYear, strMonth;
		String[] monthArr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int year = 0, month = -1;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Enter the year (yyyy):");
			strYear = keyboard.nextLine();
			if (strYear.trim().length() != 4)
				continue;
			try {
				year = Integer.parseInt(strYear.trim());
			} catch (Exception e) {
				System.out.println("ERROR");
				continue;
			}
		} while (year == 0);
		do {
			System.out.println("Enter the month:");
			strMonth = keyboard.nextLine();
			try {
				month = Integer.parseInt(strMonth.trim());
				if (month < 0 || month > 11)
					continue;
				break;
			} catch (Exception e) {
				for (int i = 0; i < 12; i++) {
					if (monthArr[i].trim().contains(strMonth)) {
						month = i + 1;
						break;
					}
				}
				continue;
			}
		} while (month == -1);
		System.out.print("Days of the month: ");
		if (month == 2) {
			System.out.println((year % 4 == 0 && (year % 100 == 0 && year % 400 == 0)) ? 29 : 28);
		} else {
			System.out.println(year % 2 == 0 ? 30 : 31);
		}
	}
}
