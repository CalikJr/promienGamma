package gamma;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	JPanel bottom, top, center;
	MainPanel(){
		setSize(800, 800);
		setLayout(new BorderLayout());
		setBackground(Color.GRAY);
		bottom = new JPanel();
		bottom.setOpaque(false);
		top = new JPanel();
		top.setOpaque(false);
		center = new JPanel();
		
		JButton settingbutton = new JButton("ustawienia");
		settingbutton.setBounds(10, 10, settingbutton.getWidth(), settingbutton.getHeight());
		bottom.add(settingbutton);
		JButton x1 = new JButton("x1");
		bottom.add(x1);
		JButton x01 = new JButton("x0.1");
		bottom.add(x01);
		JButton x001 = new JButton("x0.01");
		bottom.add(x001);
		
		
		JButton infobutton = new JButton("info");
		top.add(infobutton);
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
	}
}
