package onClass;

import javax.swing.JOptionPane;

public class GiaiPt_Hpt {
	public static void main(String[] args) {
		String stra, strb,strOption,strc,stra11,stra22,stra23,strb1,strb2;
		
		strOption = JOptionPane.showInputDialog(null, "MENU:\n"
				+ "1.Giai PT.\n"
				+ "2.Giai HPT.\n"
				+ "3.An nut khac de thoat.\n"
				+ "Nhap lua chon cua ban:\n");
		double Option = Double.parseDouble(strOption);
		if(Option == 1) {
			stra = JOptionPane.showInputDialog(null, "Nhap a: ", "Nhap a",
					JOptionPane.INFORMATION_MESSAGE);
			strb = JOptionPane.showInputDialog(null, "Nhap b: ", "Nhap b",
					JOptionPane.INFORMATION_MESSAGE);
			strc = JOptionPane.showInputDialog(null, "Nhap c: ", "Nhap c",
					JOptionPane.INFORMATION_MESSAGE);
			double a = Double.parseDouble(stra);
			double b = Double.parseDouble(strb);
			double c = Double.parseDouble(strc);
			double denta = b*b-4*a*c;
			
		}else if(Option == 2) {
			
		}else
		System.exit(0);
	}
}
