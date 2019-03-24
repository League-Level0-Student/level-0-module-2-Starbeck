package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String g = JOptionPane.showInputDialog(null, "How old are you?");
		int a = Integer.parseInt(g);
		if(a>=18){
		JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
		}
		else{
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
			}
}