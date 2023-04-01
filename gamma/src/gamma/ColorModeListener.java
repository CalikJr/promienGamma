package gamma;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorModeListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(SettingsFrame.whitemode.isSelected()==true) {
			Main.graphpanel.setBackground(new Color(255, 255, 255));
			GraphPanel.graphpaint1.setBackground(new Color(255, 255, 255));
			GraphPanel.chart1.setBackgroundPaint(new Color(255, 255, 255));
			GraphPanel.chart1.getTitle().setPaint(new Color(0, 0, 0));
			GraphPanel.graphpaint1 = new GraphPaint1();
			GraphPanel.graphpaint1.revalidate();
			GraphPanel.graphpaint1.repaint();
			GraphPanel.graphpaint2.setBackground(new Color(255, 255, 255));
			GraphPanel.chart2.setBackgroundPaint(new Color(255, 255, 255));
			GraphPanel.chart2.getTitle().setPaint(new Color(0, 0, 0));
			GraphPanel.graphpaint2 = new GraphPaint2();
			GraphPanel.graphpaint2.revalidate();
			GraphPanel.graphpaint2.repaint();
			GraphPanel.loadbutton.setBackground(new Color(255, 255, 255));
			GraphPanel.savebutton.setBackground(new Color(255, 255, 255));
			GraphPanel.savebutton2.setBackground(new Color(255, 255, 255));
			GraphPanel.graphbuttons1.setBackground(new Color(255, 255, 255));
			GraphPanel.graphbuttons2.setBackground(new Color(255, 255, 255));
			MainPanel.settingbutton.setBackground(new Color(255, 255, 255));
			MainPanel.x1.setBackground(new Color(255, 255, 255));
			MainPanel.x05.setBackground(new Color(255, 255, 255));
			MainPanel.x01.setBackground(new Color(255, 255, 255));
			SettingsFrame.frame.getContentPane().setBackground(new Color(255, 255, 255));
			SettingsFrame.panel1.setBackground(new Color(255, 255, 255));
			SettingsFrame.panel2.setBackground(new Color(255, 255, 255));
			SettingsFrame.panel3.setBackground(new Color(255, 255, 255));
			SettingsFrame.tabbedpane.setBackground(new Color(255, 255, 255));
			SettingsFrame.tabbedpane.setForeground(new Color(80, 80, 80));
			SettingsFrame.darkmode.setForeground(new Color(80, 80, 80));
			SettingsFrame.whitemode.setForeground(new Color(80, 80, 80));
			}
		if(SettingsFrame.darkmode.isSelected()==true) {
			Main.graphpanel.setBackground(new Color(80, 80, 80));
			GraphPanel.graphpaint1.setBackground(new Color(80, 80, 80));
			GraphPanel.chart1.setBackgroundPaint(new Color(80, 80, 80));
			GraphPanel.chart1.getTitle().setPaint(new Color(255, 255, 255));
			GraphPanel.graphpaint1 = new GraphPaint1();
			GraphPanel.graphpaint1.revalidate();
			GraphPanel.graphpaint1.repaint();
			GraphPanel.graphpaint2.setBackground(new Color(80, 80, 80));
			GraphPanel.chart2.setBackgroundPaint(new Color(80, 80, 80));
			GraphPanel.chart2.getTitle().setPaint(new Color(255, 255, 255));
			GraphPanel.graphpaint2 = new GraphPaint2();
			GraphPanel.graphpaint2.revalidate();
			GraphPanel.graphpaint2.repaint();
			GraphPanel.loadbutton.setBackground(new Color(80, 80, 80));
			GraphPanel.savebutton.setBackground(new Color(80, 80, 80));
			GraphPanel.savebutton2.setBackground(new Color(80, 80, 80));
			GraphPanel.graphbuttons1.setBackground(new Color(80, 80, 80));
			GraphPanel.graphbuttons2.setBackground(new Color(80, 80, 80));
			MainPanel.settingbutton.setBackground(new Color(80, 80, 80));
			MainPanel.x1.setBackground(new Color(80, 80, 80));
			MainPanel.x05.setBackground(new Color(80, 80, 80));
			MainPanel.x01.setBackground(new Color(80, 80, 80));
			SettingsFrame.frame.getContentPane().setBackground(new Color(80, 80, 80));
			SettingsFrame.panel1.setBackground(new Color(80, 80, 80));
			SettingsFrame.panel2.setBackground(new Color(80, 80, 80));
			SettingsFrame.panel3.setBackground(new Color(80, 80, 80));
			SettingsFrame.tabbedpane.setBackground(new Color(80, 80, 80));
			SettingsFrame.tabbedpane.setForeground(new Color(255, 255, 255));
			SettingsFrame.darkmode.setForeground(new Color(255, 255, 255));
			SettingsFrame.whitemode.setForeground(new Color(255, 255, 255));
		}
	}
	
}
