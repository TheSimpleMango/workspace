import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FartMachine implements ActionListener {
	public static void main(String[] args) {
		FartMachine x = new FartMachine();
		x.setup();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	public void setup(){
		frame.setVisible(true);
		frame.add(panel);

		button1.setText("fart 1");
		panel.add(button1);
		button1.addActionListener(this);
		
		button2.setText("fart 2");
		panel.add(button2);
		button1.addActionListener(this);
		
		button3.setText("fart 3");
		panel.add(button3);
		button1.addActionListener(this);
		
		button4.setText("fart 4");
		panel.add(button4);
		button1.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if (buttonPressed.equals(button1)) {
			playSound("bass drum.wav");
		}
		else if (buttonPressed.equals(button2)) {
			playSound("FloorTom.wav");
		}
		else if (buttonPressed.equals(button3)) {
			playSound("hi hat.wav");
		}
		else if (buttonPressed.equals(button4)) {
			playSound("mid tom.wav");
		}
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
