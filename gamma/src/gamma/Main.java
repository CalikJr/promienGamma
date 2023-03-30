package gamma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Main extends JFrame{
	Main(){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Gamma rays");
		setLayout(new BorderLayout());
		Dimension d = new Dimension(1200, 800);
		setPreferredSize(d);
		setSize(getPreferredSize());
		MainPanel mainpanel = new MainPanel();
		GraphPanel graphpanel = new GraphPanel();
		add(mainpanel, BorderLayout.CENTER);
		add(graphpanel, BorderLayout.EAST);
	}
	public static void main(String[] args) {
		Main Myframe = new Main();
		Myframe.setVisible(true);
	}
}
