package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String h = JOptionPane.showInputDialog(null, "How tall are you in inches?");
		int a = Integer.parseInt(h);
		if(a>=48) {
			JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You need to grow more first.");
		}
	}
}
