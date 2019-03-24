package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		//String close = JOptionPane.showInputDialog(null, "Do ");
		String h = JOptionPane.showInputDialog(null, "Which animal do you want?");
		if(h.matches("cow")) {
			JOptionPane.showMessageDialog(null, "Moo");
			playMoo();
		}else if(h.matches("duck")) {
			JOptionPane.showMessageDialog(null, "Quack");
			playQuack();
		}else if(h.matches("dog")) {
			JOptionPane.showMessageDialog(null, "Woof");
			playWoof();
		}else if(h.matches("cat")) {
			JOptionPane.showMessageDialog(null, "Meow");
			playMeow();
		}else if(h.matches("llama")) {
			JOptionPane.showMessageDialog(null, "Llama");
			playLlama();
		}else{
			JOptionPane.showMessageDialog(null, "We don't have that animal.");
		}
		/* 2. Make it so that the user can keep entering new animals. */
		//if(h "close"){
		//	System.exit(0);
		//}else {
			
		//}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}
	
	void playLlama() {
		playNoise(llamaFile);
	}
	
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
