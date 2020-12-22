package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener(e ->{ e.getSource();
			String n1 = JOptionPane.showInputDialog("number 1");
			String n2 = JOptionPane.showInputDialog("number 2");
			int nn1 = Integer.parseInt(n1);
			int nn2 = Integer.parseInt(n2);
			JOptionPane.showMessageDialog(null, nn1 + " + " + nn2 + " = " + (nn1+nn2) + " quick maths" );
		});
		randNumber.addActionListener(e ->{ e.getSource();
			int rand = new Random().nextInt(1111);
			JOptionPane.showMessageDialog(null, "Your random number is: " + rand);
		});
		tellAJoke.addActionListener(e ->{ e.getSource();
			JOptionPane.showMessageDialog(null, "Is your name google?");
			JOptionPane.showMessageDialog(null, "Because you have everything ive been searching for");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
