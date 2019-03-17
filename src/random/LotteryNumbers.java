package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
Random r = new Random();
		int h = r.nextInt(49)+1;
		for(int i=0; i<=4; i++) {
			h = r.nextInt(49)+1;
			JOptionPane.showMessageDialog(null,h);
		}
	}
}
