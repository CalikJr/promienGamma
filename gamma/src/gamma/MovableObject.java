package gamma;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MovableObject extends JPanel implements MouseListener,MouseMotionListener{
	Image image;
	Point location;
	MovableObject(String url, int x, int y){
		image = (new ImageIcon(url)).getImage();
		setSize(image.getWidth(null), image.getHeight(null));
		this.setLocation(x, y);
		location = new Point(x, y);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, 0, 0, this);
		 }
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if((int)MouseInfo.getPointerInfo().getLocation().getX()-35>AnimationPanel.okno1.getX()-AnimationPanel.okno1.getWidth() && (int)MouseInfo.getPointerInfo().getLocation().getX()-35<AnimationPanel.okno1.getX() && (int)MouseInfo.getPointerInfo().getLocation().getY()-120>AnimationPanel.okno1.getY()-AnimationPanel.okno1.getHeight() && (int)MouseInfo.getPointerInfo().getLocation().getY()-120<AnimationPanel.okno1.getY() && AnimationPanel.okno1.IsChoosen == false) {
			this.setLocation((int)AnimationPanel.okno1.getLocation().getX(), (int)AnimationPanel.okno1.getLocation().getY()+15);
			AnimationPanel.okno1.IsChoosen = true;
		} else 
		this.setLocation(location);
		this.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setLocation((int)MouseInfo.getPointerInfo().getLocation().getX()-35,(int)MouseInfo.getPointerInfo().getLocation().getY()-120);
		this.revalidate();
		this.repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
