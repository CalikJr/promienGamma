package gamma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	static JPanel bottom, top, center, speedbuttons, buttonpanel;
	static AnimationPanel animationpanel;
	static AnimationButton startstopbutton;
	static ImageButton x1, x05, x01, settingbutton, infobutton;
	static int delaytime;
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
		center.setOpaque(false);
		
		settingbutton = new ImageButton("./src/pictures/settings_icon.png",new Color(255, 255, 255));
		settingbutton.setBounds(10, 10, settingbutton.getWidth(), settingbutton.getHeight());
		bottom.add(settingbutton, BorderLayout.LINE_START);
		settingbutton.addActionListener(new SettingsFrame());
		
		
		speedbuttons = new JPanel();
		speedbuttons.setLayout(new BoxLayout(speedbuttons, BoxLayout.X_AXIS));
		speedbuttons.setOpaque(false);
		
		delaytime = 1;
		bottom.add(speedbuttons, BorderLayout.LINE_END);
		x01 = new ImageButton("./src/pictures/x01.png", new Color(255, 255, 255));
		speedbuttons.add(x01);
		speedbuttons.add(Box.createHorizontalGlue());
		speedbuttons.add(Box.createRigidArea(new Dimension(10, 0)));
		x05 = new ImageButton("./src/pictures/x05.png", new Color(255, 255, 255));
		speedbuttons.add(x05);
		speedbuttons.add(Box.createHorizontalGlue());
		speedbuttons.add(Box.createRigidArea(new Dimension(10, 0)));
		x1 = new ImageButton("./src/pictures/x1.png", new Color(255, 255, 255));
		speedbuttons.add(x1);
		x1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				delaytime = 1;
			}
		});
		x05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				delaytime = 5;
			}
		});
		x01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				delaytime = 10;
			}
		});
		
		animationpanel = new AnimationPanel();
		buttonpanel = new JPanel();
		buttonpanel.setOpaque(false);
		startstopbutton = new AnimationButton();
		buttonpanel.add(startstopbutton);
		center.setLayout(new BorderLayout());
		center.add(animationpanel, BorderLayout.CENTER);
		center.add(buttonpanel, BorderLayout.SOUTH);
		
		
		infobutton = new ImageButton("./src/pictures/info_icon.png", new Color(255, 255, 255));
		infobutton.setBackground(new Color(11, 139, 255));
		top.add(infobutton, BorderLayout.LINE_START);
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
		add(center, BorderLayout.CENTER);
	}

}
