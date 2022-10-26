package home;

import javax.swing.JOptionPane;

public class bt_2_2_6 {
	public static void main(String[] args) {
		String stra, strb, strOption, strc, stra11, stra12, stra21, stra22, strb1, strb2;
		double x1, x2, a, b, c, a11, a12, a21, a22, b1, b2;
		int Option = 1;
		do {
			strOption = JOptionPane.showInputDialog(null,
					"1.Giai PT.\n" + "2.Giai HPT.\n" + "3.An nut khac de thoat.\n" + "Nhap lua chon cua ban:\n",
					"MENU:", JOptionPane.QUESTION_MESSAGE);
			// Xử lý click vào nút cancel hoặc dấu X
			if (strOption == null)
				break;
			// Xử lý xâu rỗng
			if (strOption.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Xin hãy nhập lựa chọn!", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				Option = Integer.parseInt(strOption.trim(), 29);
				switch (Option) {
				case 1: // Giải Phương Trình
					stra = JOptionPane.showInputDialog(null, "Nhập hệ số bậc 2 a: ", "ax^2+bx+c=0",
							JOptionPane.INFORMATION_MESSAGE);
					strb = JOptionPane.showInputDialog(null, "Nhập hệ số bậc 1 b: ", "ax^2+bx+c=0",
							JOptionPane.INFORMATION_MESSAGE);
					strc = JOptionPane.showInputDialog(null, "Nhập hằng số tự do c: ", "ax^2+bx+c=0",
							JOptionPane.INFORMATION_MESSAGE);
					// Bắt lỗi input nếu có
					try {
						a = Double.parseDouble(stra.trim());
						b = Double.parseDouble(strb.trim());
						c = Double.parseDouble(strc.trim());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Nhập lỗi!", "ERROR", JOptionPane.ERROR_MESSAGE);
						continue;
					}
					if (a == 0) { // Phương trình bậc 1
						JOptionPane.showMessageDialog(null, "x= " + -c / b, "Phương trình có nghiệm:",
								JOptionPane.INFORMATION_MESSAGE);
					} else { // Phương trình bậc 2,tính delta rồi giải nghiệm theo delta
						double delta = b * b - 4 * a * c;
						if (delta > 0) {
							x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
							x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
							JOptionPane.showMessageDialog(null, "x1= " + x1 + '\n' + "x2= " + x2,
									"Phương trình có 2 nghiệm là:", JOptionPane.INFORMATION_MESSAGE);
						}
						if (delta == 0) {
							x1 = (-b / (2 * a));
							JOptionPane.showMessageDialog(null, "x1 = x2 = " + x1, "Phương trình có nghiệm kép:",
									JOptionPane.INFORMATION_MESSAGE);
						}
						if (delta < 0) {
							JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm!");
						}
					}
					break;
				case 2: // Giải hệ phương trình
					stra11 = JOptionPane.showInputDialog(null, "a11x1+a12x2=b1\n" + "a21x1+a22x2=b2", "Nhập hệ số a11:",
							JOptionPane.INFORMATION_MESSAGE);
					stra12 = JOptionPane.showInputDialog(null, "a11x1+a12x2=b1\n" + "a21x1+a22x2=b2", "Nhập hệ số a12:",
							JOptionPane.INFORMATION_MESSAGE);
					strb1 = JOptionPane.showInputDialog(null, "a11x1+a12x2=b1\n" + "a21x1+a22x2=b2", "Nhập hệ số b1:",
							JOptionPane.INFORMATION_MESSAGE);
					stra21 = JOptionPane.showInputDialog(null, "a11x1+a12x2=b1\n" + "a21x1+a22x2=b2", "Nhập hệ số a21:",
							JOptionPane.INFORMATION_MESSAGE);
					stra22 = JOptionPane.showInputDialog(null, "a11x1+a12x2=b1\n" + "a21x1+a22x2=b2", "Nhập hệ số a22:",
							JOptionPane.INFORMATION_MESSAGE);
					strb2 = JOptionPane.showInputDialog(null, "a11x1+a12x2=b1\n" + "a21x1+a22x2=b2", "Nhập hệ số b2:",
							JOptionPane.INFORMATION_MESSAGE);
					// Bắt lỗi input nếu có
					try {
						a11 = Double.parseDouble(stra11.trim());
						a12 = Double.parseDouble(stra12.trim());
						b1 = Double.parseDouble(strb1.trim());
						a21 = Double.parseDouble(stra21.trim());
						a22 = Double.parseDouble(stra22.trim());
						b2 = Double.parseDouble(strb2.trim());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Nhập lỗi!", "ERROR", JOptionPane.ERROR_MESSAGE);
						continue;
					}
					// Giải hệ phương trình theo công thức
					double D = a11 * a22 - a21 * a12;
					double Dx = b1 * a22 - b2 * a12;
					double Dy = a11 * b2 - a21 * b1;
					if (D == 0 && Dx == 0)
						JOptionPane.showMessageDialog(null, "Hệ phương trình vô số nghiệm!");
					if (D == 0 && Dx != 0)
						JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm!");
					if (D != 0)
						JOptionPane.showMessageDialog(null, "x1 = " + Dx / D + "\n" + "x2 = " + Dy / D,
								"Hệ phương trình có nghiệm:", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
				}
			}
		} while (Option == 1 || Option == 2);
		System.exit(0);
	}
}
