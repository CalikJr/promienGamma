package gamma;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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
				 WindowListener listener = new WindowAdapter() {
					   public void windowClosing(WindowEvent evt) {
					      Frame frame = (Frame) evt.getSource();
					      System.out.println("Closing = "+frame.getTitle());
					      AnimationButton.IsRunning = false;
					   }
					};
					Myframe.addWindowListener(listener);
					Myframe.setVisible(true);
				}
			});
	}
}
