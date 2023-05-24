package gamma;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AnimationPanel extends JPanel{
	static boolean IsRunning;
	static Image komora1, komora2, komora3;
	static Slot okno1, okno2, okno3;
	static MovableObject Cs, Co;
	AnimationPanel(){
		this.setLayout(null);
		this.setOpaque(false);
		IsRunning = false;
		komora1 =(new ImageIcon("./src/pictures/komora1_closed.png")).getImage();
		komora2 =(new ImageIcon("./src/pictures/komora2_closed.png")).getImage();
		komora3 =(new ImageIcon("./src/pictures/komora3_closed.png")).getImage();
		
		
		okno1 = new Slot(null, 1);
		okno1.setLocation(370, 420);
		okno2 = new Slot(null, 2);
		okno2.setLocation(370, 330);
		okno3 = new Slot(null, 3);
		okno3.setLocation(370, 260);
		this.add(okno1);
		this.add(okno2);
		this.add(okno3);
		
		Cs = new MovableObject("./src/pictures/Cs.png", 100, 400);
		Co = new MovableObject("./src/pictures/Co.png", 100, 350);
		this.add(Cs);
		this.add(Co);
	}
	
	public void paintComponent(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 if(IsRunning==false)
		 	g2d.drawImage(komora1, (this.getWidth()-komora1.getWidth(null))/2, this.getHeight()*7/10, this);
		 	g2d.drawImage(komora2, (this.getWidth()-komora2.getWidth(null))/2, this.getHeight()*7/10-komora1.getHeight(null)+37, this);
		 	g2d.drawImage(komora3, (this.getWidth()-komora3.getWidth(null))/2, this.getHeight()*7/10-komora1.getHeight(null)-komora2.getHeight(null)+59, this);
		}
}
