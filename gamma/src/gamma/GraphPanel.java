package gamma;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

public class GraphPanel extends JPanel{
	JFreeChart chart1, chart2;
	GraphPanel(){
		setSize(400, 800);
		setLayout(new GridLayout(4,1));
		
		JPanel graphpanel1 = new JPanel();
		graphpanel1.setSize(200, 150);
		double[] values1 = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67, 12, 58, 28, 63, 14, 9, 31, 17, 94, 71, 49, 64, 73, 97, 15, 63, 10, 12, 31, 62, 93, 49, 74, 90, 59, 14, 15, 88, 26, 57, 77, 44, 58, 91, 10, 67, 57, 19, 88, 84 };
		HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values1, 20);
		chart1 = ChartFactory.createHistogram("Wykres typu histogram", "Opis osi X", "Opis osi Y", dataset, PlotOrientation.VERTICAL, false, false, false);
		GraphPaint graphpaint1 = new GraphPaint(chart1.createBufferedImage(400, 300));
		graphpanel1.add(graphpaint1);
		add(graphpanel1);
		
		JButton loadbutton = new JButton("loadbutton");
		JButton savebutton = new JButton("savebutton");
		
		JPanel graphbuttons1 = new JPanel();
		graphbuttons1.setLayout(new BoxLayout(graphbuttons1, BoxLayout.X_AXIS));
		graphbuttons1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		graphbuttons1.add(Box.createHorizontalGlue());
		graphbuttons1.add(loadbutton);
		graphbuttons1.add(Box.createRigidArea(new Dimension(10, 0)));
		graphbuttons1.add(savebutton);
		
		JPanel graphpanel2 = new JPanel();
		graphpanel2.setSize(100, 50);
		double[] values2 = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67, 12, 58, 28, 63, 14, 9, 31, 17, 94, 71, 49, 64, 73, 97, 15, 63, 10, 12, 31, 62, 93, 49, 74, 90, 59, 14, 15, 88, 26, 57, 77, 44, 58, 91, 10, 67, 57, 19, 88, 84 };
		HistogramDataset dataset2 = new HistogramDataset();
        dataset.addSeries("keys", values2, 20);
		chart2 = ChartFactory.createHistogram("Wykres typu histogram", "Opis osi X", "Opis osi Y", dataset2, PlotOrientation.VERTICAL, false, false, false);
		GraphPaint graphpaint2 = new GraphPaint(chart2.createBufferedImage(400, 300));
		graphpanel2.add(graphpaint2);
		add(graphpanel2);
		
		Button savebutton2 = new Button("savebutton");
		
		JPanel graphbuttons2 = new JPanel();
		graphbuttons2.setLayout(new BoxLayout(graphbuttons2, BoxLayout.X_AXIS));
		graphbuttons2.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		graphbuttons2.add(Box.createHorizontalGlue());
		graphbuttons2.add(Box.createRigidArea(new Dimension(10, 0)));
		graphbuttons2.add(savebutton2);
	}
}
