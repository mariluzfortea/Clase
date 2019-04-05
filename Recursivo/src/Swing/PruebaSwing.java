package Swing;

import javax.swing.*;
import java.awt.*;

public class PruebaSwing {

	public static void main(String[] args) {

		Marco marco1 = new Marco();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class Marco extends JFrame {
	public Marco () {
		setVisible(true);
		setBounds(100,100,200,200);
		Lamina lamina = new Lamina();
		add(lamina);
	}
	
}

class Lamina extends JPanel {
	
}
