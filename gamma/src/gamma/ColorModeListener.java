package gamma;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jfree.chart.StandardChartTheme;

public class ColorModeListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(SettingsFrame.whitemode.isSelected()==true) {
			Main.graphpanel.setBackground(new Color(255, 255, 255));
			GraphPanel.graphpaint1.setBackground(new Color(255, 255, 255));
			GraphPanel.chart1.setBackgroundPaint(new Color(255, 255, 255));
			GraphPanel.chart1.getTitle().setPaint(new Color(0, 0, 0));
			GraphPanel.chart1.getXYPlot().getRangeAxis().setTickLabelPaint(new Color(0,0,0));
		    GraphPanel.chart1.getXYPlot().getDomainAxis().setTickLabelPaint(new Color(0,0,0));
		    GraphPanel.chart1.getXYPlot().getRangeAxis().setLabelPaint(new Color(0, 0, 0));
		    GraphPanel.chart1.getXYPlot().getDomainAxis().setLabelPaint(new Color(0, 0, 0));
		    GraphPanel.chart1.getXYPlot().setBackgroundPaint(new Color(230, 230, 230));
		    GraphPanel.chart1.getXYPlot().setRangeGridlinePaint(new Color(50,50,50));
		    GraphPanel.chart1.getXYPlot().setDomainGridlinePaint(new Color(50,50,50));
		    
			GraphPanel.graphpaint1 = new GraphPaint1();
			GraphPanel.graphpaint1.revalidate();
			GraphPanel.graphpaint1.repaint();
			GraphPanel.graphpaint2.setBackground(new Color(255, 255, 255));
			GraphPanel.chart2.setBackgroundPaint(new Color(255, 255, 255));
			GraphPanel.chart2.getTitle().setPaint(new Color(0, 0, 0));
			GraphPanel.chart2.getXYPlot().getRangeAxis().setTickLabelPaint(new Color(0,0,0));
		    GraphPanel.chart2.getXYPlot().getDomainAxis().setTickLabelPaint(new Color(0,0,0));
		    GraphPanel.chart2.getXYPlot().getRangeAxis().setLabelPaint(new Color(0,0,0));
		    GraphPanel.chart2.getXYPlot().getDomainAxis().setLabelPaint(new Color(0,0,0));
		    GraphPanel.chart2.getXYPlot().setBackgroundPaint(new Color(230, 230, 230));
		    GraphPanel.chart2.getXYPlot().setRangeGridlinePaint(new Color(50,50,50));
		    GraphPanel.chart2.getXYPlot().setDomainGridlinePaint(new Color(50,50,50));
			
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
			SettingsFrame.tabbedpane.setBackground(new Color(255, 255, 255));
			SettingsFrame.tabbedpane.setForeground(new Color(0, 0, 0));
			SettingsFrame.darkmode.setForeground(new Color(0, 0, 0));
			SettingsFrame.whitemode.setForeground(new Color(0, 0, 0));
			
			SettingsFrame.panel2.setBackground(new Color(255, 255, 255));
			SettingsFrame.glos.setBackground(new Color(255, 255, 255));
		    SettingsFrame.glos.setForeground(new Color(0, 0, 0));
		    SettingsFrame.voiceslider.setBackground(new Color(255, 255, 255));
		    SettingsFrame.voiceslider.setForeground(new Color(0, 0, 0));
			
			SettingsFrame.panel3.setBackground(new Color(255, 255, 255));
			
			
			
			}
		if(SettingsFrame.darkmode.isSelected()==true) {
			Main.graphpanel.setBackground(new Color(80, 80, 80));
			
			GraphPanel.graphpaint1.setBackground(new Color(80, 80, 80));
			GraphPanel.chart1.setBackgroundPaint(new Color(80, 80, 80));
			GraphPanel.chart1.getTitle().setPaint(new Color(255, 255, 255));
			GraphPanel.chart1.getXYPlot().getRangeAxis().setTickLabelPaint(new Color(255,255,255));
		    GraphPanel.chart1.getXYPlot().getDomainAxis().setTickLabelPaint(new Color(255,255,255));
		    GraphPanel.chart1.getXYPlot().getRangeAxis().setLabelPaint(new Color(255,255,255));
		    GraphPanel.chart1.getXYPlot().getDomainAxis().setLabelPaint(new Color(255,255,255));
		    GraphPanel.chart1.getXYPlot().setBackgroundPaint(new Color(50, 50, 50));
		    GraphPanel.chart1.getXYPlot().setRangeGridlinePaint(new Color(255,255,255));
		    GraphPanel.chart1.getXYPlot().setDomainGridlinePaint(new Color(255,255,255));
		    
			GraphPanel.graphpaint1 = new GraphPaint1();
			GraphPanel.graphpaint1.revalidate();
			GraphPanel.graphpaint1.repaint();
			GraphPanel.graphpaint2.setBackground(new Color(80, 80, 80));
			GraphPanel.chart2.setBackgroundPaint(new Color(80, 80, 80));
			GraphPanel.chart2.getTitle().setPaint(new Color(255, 255, 255));
			GraphPanel.chart2.getXYPlot().getRangeAxis().setTickLabelPaint(new Color(255,255,255));
		    GraphPanel.chart2.getXYPlot().getDomainAxis().setTickLabelPaint(new Color(255,255,255));
		    GraphPanel.chart2.getXYPlot().getRangeAxis().setLabelPaint(new Color(255,255,255));
		    GraphPanel.chart2.getXYPlot().getDomainAxis().setLabelPaint(new Color(255,255,255));
		    GraphPanel.chart2.getXYPlot().setBackgroundPaint(new Color(50, 50, 50));
		    GraphPanel.chart2.getXYPlot().setRangeGridlinePaint(new Color(255,255,255));
		    GraphPanel.chart2.getXYPlot().setDomainGridlinePaint(new Color(255,255,255));
		    
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
			SettingsFrame.tabbedpane.setBackground(new Color(80, 80, 80));
			SettingsFrame.tabbedpane.setForeground(new Color(255, 255, 255));
			SettingsFrame.darkmode.setForeground(new Color(255, 255, 255));
			SettingsFrame.whitemode.setForeground(new Color(255, 255, 255));
			
			SettingsFrame.panel2.setBackground(new Color(80, 80, 80));
			SettingsFrame.glos.setBackground(new Color(80, 80, 80));
		    SettingsFrame.glos.setForeground(new Color(255, 255, 255));
		    SettingsFrame.voiceslider.setBackground(new Color(80, 80, 80));
		    SettingsFrame.voiceslider.setForeground(new Color(255, 255, 255));
			
			
			SettingsFrame.panel3.setBackground(new Color(80, 80, 80));
			
			
		}
	}
	
}
