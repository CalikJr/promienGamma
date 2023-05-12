package gamma;

import java.awt.BorderLayout;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import com.orsoncharts.util.Orientation;

public class SettingsFrame implements ActionListener{
	static JRadioButton darkmode, whitemode;
	static JDialog frame;
	static Color color1, color2;
	static JPanel panel1, panel2, panel3;
	static JTabbedPane tabbedpane;
	static JSlider voiceslider;
	static JLabel glos, label1, label2;
	static ColorButton barcolorbutton;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame = new JDialog();
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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
	    UIManager.put("TabbedPane.selected", new Color(150, 150, 150));
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
	    	color1 = new Color(80,80,80);
	    	color2 = new Color(255,255,255);
	    	darkmode.setSelected(true);
	    	
	    } else  {
	    	color1 = new Color(255,255,255);
	    	color2 = new Color(80,80,80);
	    	whitemode.setSelected(true);
	    }
	    darkmode.setForeground(color2);
		whitemode.setForeground(color2);
		panel1.setBackground(color1);
		panel2.setBackground(color1);
		panel3.setBackground(color1);
		tabbedpane.setBackground(color1);
		tabbedpane.setForeground(color2);
		darkmode.setForeground(color2);
		whitemode.setForeground(color2);
	    darkmode.addActionListener(new ColorModeListener());
	    whitemode.addActionListener(new ColorModeListener());
	    ButtonGroup colorgroup = new ButtonGroup();
	    colorgroup.add(darkmode);
	    colorgroup.add(whitemode);
	    panel1.add(darkmode);
	    panel1.add(whitemode);
	    
	    glos = new JLabel("Głośność");
	    glos.setBackground(color1);
	    glos.setForeground(color2);
	    panel2.add(glos);
	    voiceslider = new JSlider();
	    voiceslider.setBackground(color1);
	    voiceslider.setForeground(color2);
	    panel2.add(voiceslider);
	    
	    panel3.setLayout(new BorderLayout());
	    label1 = new JLabel("Wykres 1:");
	    panel3.add(label1, BorderLayout.WEST);
	    barcolorbutton = new ColorButton("kolor słupków na wykresie");
	    panel3.add(barcolorbutton);
	    
	    frame.getContentPane().setBackground(color1);
	    tabbedpane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	    frame.add(tabbedpane);
	    frame.setVisible(true);
		
		};
	}
