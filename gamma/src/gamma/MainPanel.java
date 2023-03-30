package gamma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
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
		bottom.setLayout(new BorderLayout());
		bottom.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		top = new JPanel();
		top.setOpaque(false);
		top.setLayout(new BorderLayout());
		top.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		center = new JPanel();
		
		ImageButton settingbutton = new ImageButton("./src/pictures/settings_icon.png");
		settingbutton.setBounds(10, 10, settingbutton.getWidth(), settingbutton.getHeight());
		bottom.add(settingbutton, BorderLayout.LINE_START);
		JPanel speedbuttons = new JPanel();
		speedbuttons.setLayout(new BoxLayout(speedbuttons, BoxLayout.X_AXIS));
		speedbuttons.setOpaque(false);
		
		bottom.add(speedbuttons, BorderLayout.LINE_END);
		ImageButton x1 = new ImageButton("./src/pictures/x1.png");
		speedbuttons.add(x1);
		speedbuttons.add(Box.createHorizontalGlue());
		speedbuttons.add(Box.createRigidArea(new Dimension(10, 0)));
		ImageButton x05 = new ImageButton("./src/pictures/x05.png");
		speedbuttons.add(x05);
		speedbuttons.add(Box.createHorizontalGlue());
		speedbuttons.add(Box.createRigidArea(new Dimension(10, 0)));
		ImageButton x01 = new ImageButton("./src/pictures/x01.png");
		speedbuttons.add(x01);
		
		
		ImageButton infobutton = new ImageButton("./src/pictures/info_icon.png");
		infobutton.setBackground(new Color(11, 139, 255));
		top.add(infobutton, BorderLayout.LINE_START);
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
	}
}
