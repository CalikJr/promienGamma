package gamma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

public class GraphPanel extends JPanel{
	JFreeChart chart1, chart2;
	GraphPanel(){
		setSize(400, 800);
		setBackground(Color.white);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel graphpanel1 = new JPanel();
		graphpanel1.setSize(200, 150);
		double[] values1 = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67, 12, 58, 28, 63, 14, 9, 31, 17, 94, 71, 49, 64, 73, 97, 15, 63, 10, 12, 31, 62, 93, 49, 74, 90, 59, 14, 15, 88, 26, 57, 77, 44, 58, 91, 10, 67, 57, 19, 88, 84 };
		HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values1, 20);
		chart1 = ChartFactory.createHistogram("Wykres typu histogram", "Opis osi X", "Opis osi Y", dataset, PlotOrientation.VERTICAL, false, false, false);
		GraphPaint graphpaint1 = new GraphPaint(chart1.createBufferedImage(400, 300));
		graphpanel1.add(graphpaint1);
		add(graphpanel1);
		
		ImageButton loadbutton = new ImageButton("./src/pictures/load_icon.png");
		ImageButton savebutton = new ImageButton("./src/pictures/save_icon.png");
		
		JPanel graphbuttons1 = new JPanel();
		graphbuttons1.setBackground(this.getBackground());
		graphbuttons1.setLayout(new BoxLayout(graphbuttons1, BoxLayout.X_AXIS));
		graphbuttons1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		graphbuttons1.add(Box.createHorizontalGlue());
		graphbuttons1.add(loadbutton);
		graphbuttons1.add(Box.createRigidArea(new Dimension(300, 0)));
		graphbuttons1.add(savebutton);
		add(graphbuttons1);
		
		JPanel graphpanel2 = new JPanel();
		graphpanel2.setSize(100, 50);
		double[] values2 = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67, 12, 58, 28, 63, 14, 9, 31, 17, 94, 71, 49, 64, 73, 97, 15, 63, 10, 12, 31, 62, 93, 49, 74, 90, 59, 14, 15, 88, 26, 57, 77, 44, 58, 91, 10, 67, 57, 19, 88, 84 };
		HistogramDataset dataset2 = new HistogramDataset();
        dataset.addSeries("keys", values2, 20);
		chart2 = ChartFactory.createHistogram("Wykres typu histogram", "Opis osi X", "Opis osi Y", dataset2, PlotOrientation.VERTICAL, false, false, false);
		GraphPaint graphpaint2 = new GraphPaint(chart2.createBufferedImage(400, 300));
		graphpanel2.add(graphpaint2);
		add(graphpanel2);
		
		ImageButton savebutton2 = new ImageButton("./src/pictures/save_icon.png");
		
		
		JPanel graphbuttons2 = new JPanel();
		graphbuttons2.setBackground(this.getBackground());
		graphbuttons2.setLayout(new BoxLayout(graphbuttons2, BoxLayout.X_AXIS));
		graphbuttons2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		graphbuttons2.add(Box.createHorizontalGlue());
		graphbuttons2.add(Box.createRigidArea(new Dimension(10, 0)));
		graphbuttons2.add(savebutton2);
		add(graphbuttons2);
	}
}
