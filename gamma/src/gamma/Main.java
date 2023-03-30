package gamma;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Main extends JFrame{
	Main(){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Gamma rays");
		setSize(1200, 800);
		MainPanel mainpanel = new MainPanel();
		GraphPanel graphpanel = new GraphPanel();
		setLayout(new FlowLayout());
		this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		add(mainpanel);
		
		add(graphpanel);
	}
	public static void main(String[] args) {
		Main Myframe = new Main();
		Myframe.setVisible(true);
	}
}
