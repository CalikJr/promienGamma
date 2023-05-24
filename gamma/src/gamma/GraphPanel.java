package gamma;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.StandardXYBarPainter;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.DefaultXYDataset;

public class GraphPanel extends JPanel{
	static ImageButton savebutton, loadbutton, savebutton2;
	static JPanel graphbuttons1, graphbuttons2;
	static GraphPaint1 graphpaint1;
	static GraphPaint2 graphpaint2;
	static JFreeChart chart1;
	static StandardChartTheme theme1;
	static HistogramDataset dataset1;
	static JFreeChart chart2;
	static DefaultXYDataset dataset2;
	static double[] values1;
	static int graphint;
	GraphPanel(){
		List<double[][]> list = new ArrayList<double[][]>();
		setSize(400, 700);
		setBackground(new Color(255, 255, 255));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		values1 = new double[1000];
		dataset1 = new HistogramDataset();
		//dataset1.addSeries("key", values1, 100);
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
	    rend.setShadowXOffset(0);
	    rend.setShadowYOffset(0);
	    rend.setBarPainter(new StandardXYBarPainter());
	    
		graphpaint1 = new GraphPaint1();
		add(graphpaint1);
		graphint = 0;
		//double[] values2 = {0, 10, 60, 50, 70, 60, 30, 25, 26, 17, 95, 37, 26, 20, 57, 47, 46, 39, 68, 31, 53};
		loadbutton = new ImageButton("./src/pictures/load_icon.png",new Color(255, 255, 255));
		loadbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(AnimationButton.IsRunning == false && SimulationThread.iteration != 1000){
					JOptionPane.showMessageDialog(Main.mainpanel, "Nie dokończyłeś symulacji! Chcesz zgrać dane. \n Naciśnij przycisk START i dokończ symulacje.");
				} else if(AnimationButton.IsRunning == true && SimulationThread.iteration != 1000) {
					JOptionPane.showMessageDialog(Main.mainpanel, "Symulacja dalej jest przeprowadzana, poczekaj aż zbierze wszystkie dane.");
				} else {
				double[][] values2 = new double[2][100];
				for(int i = 0; i<100; i++)
				{
					values2[0][i] = (double) dataset1.getX(0, i);
					values2[1][i] = (double) dataset1.getY(0, i);
				}
				
				boolean isequal = false;
				for(int i=0;i<graphint;i++) {
					if(list.get(i).equals(values2)) {
						isequal = true;
					} else {
						isequal = false;
					}
				}
				if(isequal == false) {
				list.add(values2);
				graphint++;
				dataset2.addSeries("key"+graphint, values2);
				chart2.getXYPlot().setDataset(dataset2);
				graphpaint2.setBackground(graphpaint2.getBackground());
				graphpaint2 = new GraphPaint2();
				graphpaint2.revalidate();
				graphpaint2.repaint();
				Main.graphpanel.repaint();}
				else {
					JOptionPane.showMessageDialog(Main.mainpanel, "Chcesz wstawić istniejący już w bazie wykres.");
				}
				}
			}
		});
		savebutton = new ImageButton("./src/pictures/save_icon.png", new Color(255, 255, 255));
		savebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser filechooser = new JFileChooser();
				int returnVal = filechooser.showOpenDialog(Main.graphpanel);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
				try {
					File directory = new File(filechooser.getSelectedFile().getPath());
					ImageIO.write(chart1.createBufferedImage(1200, 900), "png", directory);
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
		
		
		dataset2 = new DefaultXYDataset();
		//dataset2.addSeries("keys", values2, 20);
		chart2 = ChartFactory.createXYLineChart("Baza wykresów w jednym", "Grubość absorbenta [mm]", "N-liczba zliczeń", dataset2, PlotOrientation.VERTICAL, true, false, false);
		chart2.setBackgroundPaint(new Color(255, 255, 255));
	    chart2.getXYPlot().setOutlineVisible(false);
	    chart2.getXYPlot().getRangeAxis().setAxisLineVisible( false );
	    chart2.getXYPlot().getRangeAxis().setTickMarksVisible( false );
	    chart2.getXYPlot().getRangeAxis().setTickLabelPaint(new Color(0,0,0));
	    chart2.getXYPlot().getDomainAxis().setTickLabelPaint(new Color(0,0,0));
	    chart2.getXYPlot().setBackgroundPaint(new Color(230, 230, 230));
	    chart2.getXYPlot().setRangeGridlinePaint(new Color(50,50,50));
	    chart2.getXYPlot().setDomainGridlinePaint(new Color(50,50,50));
	    chart2.getXYPlot().getRenderer().setSeriesPaint( 0, Color.decode( "#4572a7" ));
	    
		graphpaint2 = new GraphPaint2();
		add(graphpaint2);
		
		
		savebutton2 = new ImageButton("./src/pictures/save_icon.png", new Color(255, 255, 255));
		savebutton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser filechooser = new JFileChooser();
				int returnVal = filechooser.showOpenDialog(Main.graphpanel);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
				try { 
					File directory = new File(filechooser.getSelectedFile().getPath());
					ImageIO.write(chart2.createBufferedImage(1200, 900), "png", directory);
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
