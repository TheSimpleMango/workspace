import javax.swing.JOptionPane;

public class AscIIConverter {
	public static void main(String[] args) {
		String binary = JOptionPane.showInputDialog("Input binary code");
		
		String[] splitBinary = binary.split(" ");
		
		for (int i = 0; i < splitBinary.length; i++) {
			int letter = convert(splitBinary[i]);
			System.out.print(letter);
		}
	}

	static char convert(String binary) {
		int number = Integer.parseInt(binary, 2);
		char asciiValue = (char) number;
		return asciiValue;
	}
}