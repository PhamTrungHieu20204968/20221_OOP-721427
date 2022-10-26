package home;

import javax.swing.JOptionPane;

public class bt_6_1 {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option == JOptionPane.YES_OPTION ? "Yes" : option == JOptionPane.NO_OPTION ? "No" : ""));
		System.exit(0);
	}
}
