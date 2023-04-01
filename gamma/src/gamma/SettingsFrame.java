package gamma;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;

public class SettingsFrame implements ActionListener{
	static JRadioButton darkmode, whitemode;
	static JDialog frame;
	static Color color;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame = new JDialog();
		frame.setLayout(new FlowLayout());
		frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.setTitle("Ustawienia");
	    frame.setSize(500, 400);
	    frame.setLocation(400, 400);
	    
	    ImageIcon icon = new ImageIcon("./src/pictures/settings_icon.png");
	    frame.setIconImage(icon.getImage());
	    darkmode = new JRadioButton("Dark mode");
	    whitemode = new JRadioButton("Light mode");
	    darkmode.setOpaque(false);
	    whitemode.setOpaque(false);
	    if((new Color(80,80,80)).getRGB() == Main.graphpanel.getBackground().getRGB()) {
	    	color = new Color(80,80,80);
	    	darkmode.setSelected(true);
	    	darkmode.setForeground(new Color(255,255,255));
			whitemode.setForeground(new Color(255,255,255));
	    } else  {
	    	color = new Color(255,255,255);
	    	whitemode.setSelected(true);
	    	darkmode.setForeground(new Color(80, 80, 80));
			whitemode.setForeground(new Color(80, 80, 80));
	    }
	    darkmode.addActionListener(new ColorModeListener());
	    whitemode.addActionListener(new ColorModeListener());
	    ButtonGroup colorgroup = new ButtonGroup();
	    colorgroup.add(darkmode);
	    colorgroup.add(whitemode);
	    frame.add(darkmode);
	    frame.add(whitemode);
	    frame.getContentPane().setBackground(color);
	    frame.setVisible(true);
		
		};
	}
