import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculzator implements ActionListener {
	public static void main(String[] args) {
		Calculzator calc = new Calculzator();
		calc.setup();
	}
	JFrame frame;
	JPanel panel;
	JTextField text1;
	JTextField text2;
	JLabel answer = new JLabel();
	String[] operations = { "Divide", "Multiply", "Add", "Subtract"};
	JButton button;
	JComboBox combo;
	
	public void setup(){
		frame = new JFrame();
		frame.setVisible(true);
		
		panel = new JPanel();
		frame.add(panel);
		
		text1 = new JTextField();
		text1.setColumns(10);
		panel.add(text1);
		
		combo = new JComboBox(operations);
		panel.add(combo);
		combo.setSelectedIndex(3);
		
		text2 = new JTextField();
		text2.setColumns(10);
		panel.add(text2);
		
		button = new JButton("enter");
		panel.add(button);
		button.addActionListener(this);
		
		panel.add(answer);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int int1 = Integer.parseInt(text1.getText());
		int int2 = Integer.parseInt(text2.getText());
		if (combo.getSelectedItem().equals("Divide")) {
			answer.setText(String.valueOf(int1/int2));
		}
		if (combo.getSelectedItem().equals("Multiply")) {
			answer.setText(String.valueOf(int1*int2));
		}
		if (combo.getSelectedItem().equals("Add")) {
			answer.setText(String.valueOf(int1+int2));
		}
		if (combo.getSelectedItem().equals("Subtract")) {
			answer.setText(String.valueOf(int1-int2));
		}
		frame.pack();
	}
}
