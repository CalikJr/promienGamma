package gamma;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.ui.RectangleInsets;

public class GraphPaint1 extends JPanel implements MouseListener{
	 private static BufferedImage Image;
	public GraphPaint1() {
	 super();
	 addMouseListener(this);
	 Image = GraphPanel.chart1.createBufferedImage(400, 300);
	 // Plik umieszczony w podpakiecie "obrazki"
	 Dimension dimension = new Dimension(Image.getWidth(), Image.getHeight());
	 setPreferredSize(dimension);
	 }
	 public void paintComponent(Graphics g) {
	 Graphics2D g2d = (Graphics2D) g;
	g2d.drawImage(Image, 0, 0, this);
	 }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ChartFrame chartframe1 = new ChartFrame("CHart1", GraphPanel.chart1, true);
		chartframe1.setSize(1200, 700);
		chartframe1.setVisible(true);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
