import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SlotMachine implements ActionListener {
	public static void main(String[] args) {
		SlotMachine x = new SlotMachine();
		x.setup();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(new GridLayout(2, 3));
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton button = new JButton();
	JLabel win = new JLabel();
	JLabel bet = new JLabel();
	
	int totalWon=0;
	
	public void setup(){
		frame.setVisible(true);
		frame.add(panel);

		label1.setText("");
		panel.add(label1);

		label2.setText("");
		panel.add(label2);

		label3.setText("");
		panel.add(label3);
		
		button.setText("spin");
		button.addActionListener(this);
		panel.add(button);
		
		panel.add(win);
		win.setText("win/lose");
		
		panel.add(bet);
		bet.setText("$0");
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int betAmount = Integer.parseInt(JOptionPane.showInputDialog("input a bet"));
		int x = new Random().nextInt(9)+1;
		int y = new Random().nextInt(9)+1;
		int z = new Random().nextInt(9)+1;
		label1.setText(String.valueOf(x));
		label2.setText(String.valueOf(y));
		label3.setText(String.valueOf(z));
		if (x==y&&y==z) {
			win.setText("You win!");
			totalWon+=betAmount;
		}
		else if (x==y||y==z||x==z) {
			win.setText("idk man");
		}
		else {
			win.setText("You Lose!");
			totalWon-=betAmount;
		}
		bet.setText("$"+String.valueOf(totalWon));
	}
}
