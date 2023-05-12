package gamma;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.StandardXYBarPainter;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;

public class GraphPanel extends JPanel{
	static ImageButton savebutton, loadbutton, savebutton2;
	static JPanel graphbuttons1, graphbuttons2;
	static GraphPaint1 graphpaint1;
	static GraphPaint2 graphpaint2;
	static JFreeChart chart1;
	static StandardChartTheme theme1;
	static HistogramDataset dataset1;
	static JFreeChart chart2;
	static HistogramDataset dataset2;
	GraphPanel(){
		setSize(400, 700);
		setBackground(new Color(255, 255, 255));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		double[] values1 = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67, 12, 58, 28, 63, 14, 9, 31, 17, 94, 71, 49, 64, 73, 97, 15, 63, 10, 12, 31, 62, 93, 49, 74, 90, 59, 14, 15, 88, 26, 57, 77, 44, 58, 91, 10, 67, 57, 19, 88, 84 };
		dataset1 = new HistogramDataset();
		dataset1.addSeries("key", values1, 20);
	 	chart1 = ChartFactory.createHistogram("Wykres aktualnego pomiaru", "Grubość absorbenta [mm]", "N-liczba zliczeń", dataset1, PlotOrientation.VERTICAL, false, false, false);
		chart1.setBackgroundPaint(new Color(255, 255, 255));
	    chart1.getXYPlot().setOutlineVisible(false);
	    chart1.getXYPlot().getRangeAxis().setAxisLineVisible( false );
	    chart1.getXYPlot().getRangeAxis().setTickMarksVisible( false );
	    chart1.getXYPlot().getRangeAxis().setTickLabelPaint(new Color(0,0,0));
	    chart1.getXYPlot().getDomainAxis().setTickLabelPaint(new Color(0,0,0));
	    chart1.getXYPlot().setBackgroundPaint(new Color(230, 230, 230));
	    chart1.getXYPlot().setRangeGridlinePaint(new Color(50,50,50));
	    chart1.getXYPlot().setDomainGridlinePaint(new Color(50,50,50));
	    chart1.getXYPlot().getRenderer().setSeriesPaint( 0, Color.decode( "#4572a7" ));
	    XYBarRenderer rend = (XYBarRenderer) chart1.getXYPlot().getRenderer();
	    rend.setShadowVisible( true );
	    rend.setShadowXOffset(1);
	    rend.setShadowYOffset(0);
	    rend.setBarPainter(new StandardXYBarPainter());
	    
		graphpaint1 = new GraphPaint1();
		add(graphpaint1);
		
		loadbutton = new ImageButton("./src/pictures/load_icon.png",new Color(255, 255, 255));
		savebutton = new ImageButton("./src/pictures/save_icon.png", new Color(255, 255, 255));
		savebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser filechooser = new JFileChooser();
				filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = filechooser.showOpenDialog(Main.graphpanel);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
				try {
					File directory = new File(filechooser.getSelectedFile().getPath()+"/chart1.png");
					ImageIO.write(chart1.createBufferedImage(1200, 900), "png", directory);
					System.out.println(filechooser.getSelectedFile().getPath());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}}
		});
		
		graphbuttons1 = new JPanel();
		graphbuttons1.setBackground(this.getBackground());
		graphbuttons1.setLayout(new BoxLayout(graphbuttons1, BoxLayout.X_AXIS));
		graphbuttons1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		graphbuttons1.add(Box.createHorizontalGlue());
		graphbuttons1.add(loadbutton);
		graphbuttons1.add(Box.createRigidArea(new Dimension(300, 0)));
		graphbuttons1.add(savebutton);
		add(graphbuttons1);
		
		double[] values2 = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67, 12, 58, 28, 63, 14, 9, 31, 17, 94, 71, 49, 64, 73, 97, 15, 63, 10, 12, 31, 62, 93, 49, 74, 90, 59, 14, 15, 88, 26, 57, 77, 44, 58, 91, 10, 67, 57, 19, 88, 84 };
		dataset2 = new HistogramDataset();
		dataset2.addSeries("keys", values2, 20);
		chart2 = ChartFactory.createHistogram("Baza wykresów w jednym", "Grubość absorbenta [mm]", "N-liczba zliczeń", dataset2, PlotOrientation.VERTICAL, false, false, false);
		chart2.setBackgroundPaint(new Color(255, 255, 255));
		graphpaint2 = new GraphPaint2();
		add(graphpaint2);
		
		
		savebutton2 = new ImageButton("./src/pictures/save_icon.png", new Color(255, 255, 255));
		savebutton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser filechooser = new JFileChooser();
				filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = filechooser.showOpenDialog(Main.graphpanel);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
				try { 
					File directory = new File(filechooser.getSelectedFile().getPath()+"/chart2.png");
					ImageIO.write(chart2.createBufferedImage(1200, 900), "png", directory);
					System.out.println(filechooser.getSelectedFile().getPath());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}}
		});
		
		graphbuttons2 = new JPanel();
		graphbuttons2.setBackground(this.getBackground());
		graphbuttons2.setLayout(new BoxLayout(graphbuttons2, BoxLayout.X_AXIS));
		graphbuttons2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		graphbuttons2.add(Box.createHorizontalGlue());
		graphbuttons2.add(Box.createRigidArea(new Dimension(10, 0)));
		graphbuttons2.add(savebutton2);
		add(graphbuttons2);
	}
}
