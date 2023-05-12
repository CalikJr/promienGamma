package gamma;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorButton extends JPanel implements ActionListener{
	static Color color;
	static JLabel label;
	static ImageButton changebutton;
	static String name;
	ColorButton(String nazwa){
		name = nazwa;
		label = new JLabel(name + ": ");
		add(label);
		changebutton = new ImageButton(null ,(Color)GraphPanel.chart1.getXYPlot().getRenderer().getSeriesPaint(0) );
		changebutton.setPreferredSize(new Dimension(30,30));
		changebutton.addActionListener(this);
		add(changebutton);
		setOpaque(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		color = JColorChooser.showDialog(this, name, color);
		if(color == null) {
		color = (Color)GraphPanel.chart1.getXYPlot().getRenderer().getSeriesPaint(0);
		} else {
		GraphPanel.chart1.getXYPlot().getRenderer().setSeriesPaint(0, color);
		changebutton.setBackground(color);
		GraphPanel.graphpaint1 = new GraphPaint1();
		GraphPanel.graphpaint1.revalidate();
		GraphPanel.graphpaint1.repaint();
		Main.graphpanel.revalidate();
		Main.graphpanel.repaint();
		}
	}

}

