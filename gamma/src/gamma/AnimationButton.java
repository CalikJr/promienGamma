package gamma;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.jfree.data.statistics.HistogramDataset;

public class AnimationButton extends JButton implements ActionListener{
	static boolean IsRunning;
	static Random random;
	static SimulationThread simulation;
	static List<Double> list;
	AnimationButton(){
		list = new ArrayList<>(Arrays.asList());
		random = new Random();
		setText("START");
		setBackground(Color.RED);
		setForeground(Color.WHITE);
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 30);
		setFont(font);
		Border line = new LineBorder(Color.LIGHT_GRAY);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		this.setBorder(compound);
		this.setPreferredSize(new Dimension(200, 60));
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(this.getText().compareTo("START")==0) {
			if(AnimationPanel.Al.isChoosen == true) {
				if(AnimationPanel.Co.isChoosen == true) {
					SimulationThread.mi = 0.1404;
					this.setText("STOP");
					IsRunning = true;
					simulation = new SimulationThread(); 
				}
				else if(AnimationPanel.Cs.isChoosen == true) {
					SimulationThread.mi = 0.1539;
					this.setText("STOP");
					IsRunning = true;
					simulation = new SimulationThread();
				}
			} else if(AnimationPanel.Pb .isChoosen == true) {
				if(AnimationPanel.Co.isChoosen == true) {
					SimulationThread.mi = 0.61236;
					this.setText("STOP");
					IsRunning = true;
					simulation = new SimulationThread();
				}
				else if(AnimationPanel.Cs.isChoosen == true) {
					SimulationThread.mi = 1.0206;
					this.setText("STOP");
					IsRunning = true;
					simulation = new SimulationThread();
				}
			} else {
				JOptionPane.showMessageDialog(Main.mainpanel, "Nie wybrałeś absorbenta lub zródła!");
			}
		}
		else {
			this.setText("START");
			IsRunning = false;
			simulation.stop();
		}
	}

}
