package chapter2.swingexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args) {
		new SwingObserverExample().go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("Anonymous inner class");
			}
		});
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setSize(100, 100);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, Do it!");
		}
	}
	

}
