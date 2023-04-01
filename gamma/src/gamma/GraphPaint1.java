package gamma;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GraphPaint1 extends JPanel{
	 private static BufferedImage Image;
	public GraphPaint1() {
	 super();
	 Image = GraphPanel.chart1.createBufferedImage(400, 300);
	 // Plik umieszczony w podpakiecie "obrazki"
	 Dimension dimension = new Dimension(Image.getWidth(), Image.getHeight());
	 setPreferredSize(dimension);
	 }
	 public void paintComponent(Graphics g) {
	 Graphics2D g2d = (Graphics2D) g;
	g2d.drawImage(Image, 0, 0, this);
	 }
}
