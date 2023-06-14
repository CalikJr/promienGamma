package gamma;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AnimationPanel extends JPanel implements ComponentListener{
	static boolean IsRunning;
	static Image komora1, komora2, komora3;
	static Slot okno1, okno2, okno3;
	static MovableObject Cs, Co, Al, Pb;
	AnimationPanel(){
		this.setLayout(null);
		this.setOpaque(false);
		IsRunning = false;
		komora1 =(new ImageIcon("./src/pictures/komora1_closed.png")).getImage();
		komora2 =(new ImageIcon("./src/pictures/komora2_closed.png")).getImage();
		komora3 =(new ImageIcon("./src/pictures/komora3_closed.png")).getImage();
		
		
		okno1 = new Slot(1, "./src/pictures/Cs.png");
		okno2 = new Slot(2, "./src/pictures/Al.png");
		okno3 = new Slot(3, "./src/pictures/Cs.png");
		this.add(okno1);
		this.add(okno2);
		this.add(okno3);
		
		Cs = new MovableObject("./src/pictures/Cs.png", 1);
		Co = new MovableObject("./src/pictures/Co.png", 1);
		this.add(Cs);
		this.add(Co);
		
		Al = new MovableObject("./src/pictures/Al.png", 2);
		Pb = new MovableObject("./src/pictures/Pb.png", 2);
		this.add(Al);
		this.add(Pb);
		this.addComponentListener(this);
	}
	
	
	
	public void paintComponent(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 if(IsRunning==false)
		 {
			g2d.drawImage(komora1, (this.getWidth()-komora1.getWidth(null))/2, this.getHeight()*7/10, this);
		 	g2d.drawImage(komora2, (this.getWidth()-komora2.getWidth(null))/2, this.getHeight()*7/10-komora1.getHeight(null)+37, this);
		 	g2d.drawImage(komora3, (this.getWidth()-komora3.getWidth(null))/2, this.getHeight()*7/10-komora1.getHeight(null)-komora2.getHeight(null)+59, this);
		 }
		 if(IsRunning==true)
		 {
			 g2d.drawImage((new ImageIcon("./src/pictures/Gamma_beam.png")).getImage(), 0, 0, this);
		 }
		 }



	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		okno1.setLocation((MainPanel.animationpanel.getWidth()-okno1.getWidth())/2, MainPanel.animationpanel.getHeight()*7/10+komora1.getHeight(null)*3/7);
		okno2.setLocation((MainPanel.animationpanel.getWidth()-okno2.getWidth())/2, MainPanel.animationpanel.getHeight()*7/10+komora1.getHeight(null)*2/7-komora2.getHeight(null)*6/7);
		okno3.setLocation((MainPanel.animationpanel.getWidth()-okno3.getWidth())/2, MainPanel.animationpanel.getHeight()*7/10+komora1.getHeight(null)*2/7-komora2.getHeight(null)*6/7-komora3.getHeight(null)*2/3);
		
		if(Al.isChoosen == false) {
		Al.setLocation(this.getWidth()-Al.image.getWidth(null)-50, Al.image.getHeight(null)+50);
		Al.location = Al.getLocation();
		} else {
			Al.setLocation(okno2.getLocation());
		}
		if(Pb.isChoosen == false) {
		Pb.setLocation(this.getWidth()-Pb.image.getWidth(null)-50, 2*(Pb.image.getHeight(null)+50));
		Pb.location = Pb.getLocation();
		} else {
			Pb.setLocation(okno2.getLocation());
		}
		if(Co.isChoosen == false) {
			Co.setLocation(Co.image.getWidth(null)+50, Co.image.getHeight(null)+50);
			Co.location = Co.getLocation();
			} else {
				Co.setLocation(okno1.getLocation());
			}
			if(Cs.isChoosen == false) {
			Cs.setLocation(Cs.image.getWidth(null)+50, 2*(Cs.image.getHeight(null)+50));
			Cs.location = Cs.getLocation();
			} else {
				Cs.setLocation(okno1.getLocation());
			}
		SimulationThread.beam.setLocation((int)AnimationPanel.okno1.getLocation().getX(), (int) (AnimationPanel.okno1.getLocation().getY()-150+AnimationPanel.okno1.getHeight()));
	}



	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
