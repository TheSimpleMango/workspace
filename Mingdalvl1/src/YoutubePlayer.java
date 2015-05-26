import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.*;


public class YoutubePlayer implements ActionListener{
	public static void main(String[] args) {
		new YoutubePlayer().createUI();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton ducks = new JButton("ducks");
	JButton frogs = new JButton("PEPE");
	JButton fluff = new JButton("UNCRNZZZZ");
	
	private void createUI(){
		frame.setName("VidPlayer");
		frame.add(panel);
		frame.setVisible(true);
		
		panel.add(ducks);
		panel.add(frogs);
		panel.add(fluff);
		
		ducks.addActionListener(this);
		frogs.addActionListener(this);
		fluff.addActionListener(this);
		
		frame.pack();
	}
	
	public void actionPerformed(ActionEvent arg0){
		JButton x = (JButton)arg0.getSource();
		if (x.equals(ducks)) {
			showDucks();
		}
		else if (x.equals(frogs)) {
			showFrog();
		}
		else if (x.equals(fluff)) {
			showFluffyUnicorns();
		}
	}
	
	void showDucks(){
		playVideo("T0Rne4KbZSE");
	}

	void showFrog(){
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns(){
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID){
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
