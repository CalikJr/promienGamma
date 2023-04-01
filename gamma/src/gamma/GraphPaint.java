package gamma;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GraphPaint extends JPanel{
	 static BufferedImage image;
	 public GraphPaint(BufferedImage Img) {
	 super();
	 // Plik umieszczony w podpakiecie "obrazki"
	 image = Img;
	 Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
	 setPreferredSize(dimension);
	 }
	 public void paintComponent(Graphics g) {
	 Graphics2D g2d = (Graphics2D) g;
	 g2d.drawImage(image, 0, 0, this);
	 }
}
