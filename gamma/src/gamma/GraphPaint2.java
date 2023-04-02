package gamma;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import org.jfree.chart.ChartFrame;

public class GraphPaint2 extends JPanel implements MouseListener{
	private static BufferedImage Image;
	public GraphPaint2() {
	 super();
	 addMouseListener(this);
	 Image = GraphPanel.chart2.createBufferedImage(400, 300);
	 // Plik umieszczony w podpakiecie "obrazki"
	 Dimension dimension = new Dimension(Image.getWidth(), Image.getHeight());
	 this.setPreferredSize(dimension);
	 }
	 public void paintComponent(Graphics g) {
	 Graphics2D g2d = (Graphics2D) g;
	 g2d.drawImage(Image, 0, 0, this);
	 }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ChartFrame chartframe2 = new ChartFrame("CHart2", GraphPanel.chart2, true);
		chartframe2.setSize(1200, 700);
		chartframe2.setVisible(true);
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
