package onClass;

import javax.swing.JOptionPane;

public class CaculatorTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;

		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		JOptionPane.showMessageDialog(null, num1 + num2, "Tong 2 so la", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 - num2, "Hieu 2 so la", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 * num2, "Tich 2 so la", JOptionPane.INFORMATION_MESSAGE);
		if (num2 == 0)
			JOptionPane.showMessageDialog(null, "Khong the tinh duoc");
		else
			JOptionPane.showMessageDialog(null, num1 / num2, "Thuong 2 so la", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
