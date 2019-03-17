//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random r = new Random();
		int t = r.nextInt(9);

	// 3. Print out this variable
//JOptionPane.showMessageDialog(null, t);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "Input Yes/No Question:");
	// 5. If the random number is 0
		if (t == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		} else if (t == 1) {
			JOptionPane.showMessageDialog(null, "No");
		} else if (t == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		} else if (t == 3) {
			JOptionPane.showMessageDialog(null, "It is certain");
		} else if (t == 4) {
			JOptionPane.showMessageDialog(null, "As I see it, yes");
		} else if (t == 5) {
			JOptionPane.showMessageDialog(null, "Better not tell you now");
		} else if (t == 6) {
			JOptionPane.showMessageDialog(null, "Very doubtful");
		}else {
			JOptionPane.showMessageDialog(null, "Don't count on it");
		}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
	}
}
