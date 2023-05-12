package gamma;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	static MainPanel mainpanel;
	static GraphPanel graphpanel;
	Main(){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Gamma rays");
		setLayout(new BorderLayout());
		Dimension d = new Dimension(1200, 770);
		setPreferredSize(d);
		setSize(getPreferredSize());
		mainpanel = new MainPanel();
		graphpanel = new GraphPanel();
		add(mainpanel, BorderLayout.CENTER);
		add(graphpanel, BorderLayout.EAST);
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				 new Runnable(){
				public void run() {
				 Main Myframe = new Main();
		Myframe.setVisible(true);
				}
			});
	}
}
