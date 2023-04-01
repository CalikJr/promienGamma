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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class SettingsFrame implements ActionListener{
	static JRadioButton darkmode, whitemode;
	static JDialog frame;
	static Color color;
	static JPanel panel1, panel2, panel3;
	static JTabbedPane tabbedpane;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame = new JDialog();
		frame.setLayout(null);
		frame.setLocation((int)Main.mainpanel.getSize().getWidth()/2 - 250, (int)Main.mainpanel.getSize().getHeight()/2 - 200);
		frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.setTitle("Ustawienia");
	    frame.setSize(500, 400);
	    frame.setModal(true);
	    frame.setResizable(false);
	    ImageIcon icon = new ImageIcon("./src/pictures/settings_icon.png");
	    frame.setIconImage(icon.getImage());
	    tabbedpane = new JTabbedPane();
	    UIManager.put("TabbedPane.selected", new Color(200, 200, 200));
	    tabbedpane.setSize(frame.getSize());
	    panel1 = new JPanel();
	    panel1.setSize(500, 300);
		tabbedpane.addTab("Tryb coloru", panel1);
		panel2 = new JPanel();
		tabbedpane.addTab("Głośność", panel2);
		panel3 = new JPanel();
		tabbedpane.addTab("Wykresy", panel3);
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
	    panel1.add(darkmode);
	    panel1.add(whitemode);
	    frame.getContentPane().setBackground(color);
	    tabbedpane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	    frame.add(tabbedpane);
	    frame.setVisible(true);
		
		};
	}
