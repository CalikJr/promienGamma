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
	static int number;
	int type;
	boolean isChoosen;
	MovableObject(String url, int t){
		number++;
		type=t;
		image = (new ImageIcon(url)).getImage();
		setSize(image.getWidth(null), image.getHeight(null));
		if(type == 1)
		{
			this.setLocation(50, number*(image.getHeight(null)+50));
		}
		else if(type == 2)
		{
			this.setLocation(0, number*(image.getHeight(null)+50));
		}
		location = new Point(this.getLocation());
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
		if(SimulationThread.iteration<1 || SimulationThread.iteration>999) {
		if(type==1) {
			if((int)MouseInfo.getPointerInfo().getLocation().getX()-35>AnimationPanel.okno1.getX()-AnimationPanel.okno1.getWidth() && (int)MouseInfo.getPointerInfo().getLocation().getX()-35<AnimationPanel.okno1.getX() && (int)MouseInfo.getPointerInfo().getLocation().getY()-120>AnimationPanel.okno1.getY()-AnimationPanel.okno1.getHeight() && (int)MouseInfo.getPointerInfo().getLocation().getY()-120<AnimationPanel.okno1.getY()) {
				this.setLocation(AnimationPanel.okno1.getLocation());
				if(AnimationPanel.okno1.IsChoosen == true) {
					if(AnimationPanel.Cs == this) {
						if(AnimationPanel.Co.isChoosen==true) {
							AnimationPanel.Co.setLocation(AnimationPanel.Co.location);
							System.out.println("location set");
							AnimationPanel.Co.isChoosen=false;
							AnimationPanel.Co.setVisible(true);
							AnimationPanel.Co.repaint();
						}}
					else if(AnimationPanel.Cs.isChoosen==true) {
							AnimationPanel.Cs.setLocation(AnimationPanel.Cs.location);
							AnimationPanel.Cs.isChoosen=false;
							AnimationPanel.Cs.setVisible(true);
							AnimationPanel.Cs.repaint();
						} 
				}
				AnimationPanel.okno1.IsChoosen = true;
				isChoosen = true;
			} else
			{
				this.setLocation(location);
				this.repaint();
			}
		}
		if(type==2) {
			if((int)MouseInfo.getPointerInfo().getLocation().getX()-35>AnimationPanel.okno2.getX()-AnimationPanel.okno2.getWidth() && (int)MouseInfo.getPointerInfo().getLocation().getX()-35<AnimationPanel.okno2.getX() && (int)MouseInfo.getPointerInfo().getLocation().getY()-120>AnimationPanel.okno2.getY()-AnimationPanel.okno2.getHeight() && (int)MouseInfo.getPointerInfo().getLocation().getY()-120<AnimationPanel.okno2.getY()) {
				this.setLocation(AnimationPanel.okno2.getLocation());
				if(AnimationPanel.okno2.IsChoosen == true) {
					System.out.println("location set");
					if(AnimationPanel.Al == this) {
						if(AnimationPanel.Pb.isChoosen==true) {
							AnimationPanel.Pb.setLocation(AnimationPanel.Pb.location);
							System.out.println("location set");
							AnimationPanel.Pb.isChoosen=false;
							AnimationPanel.Pb.setVisible(true);
							AnimationPanel.Pb.repaint();
						}}
					else if(AnimationPanel.Al.isChoosen==true) {
						AnimationPanel.Al.setLocation(AnimationPanel.Al.location);
						System.out.println("location set");
						AnimationPanel.Al.isChoosen=false;
						AnimationPanel.Al.setVisible(true);
						AnimationPanel.Al.repaint();
						} 
				}
				AnimationPanel.okno2.IsChoosen = true;
				isChoosen = true;
			} else
			{
				this.setLocation(location);
				this.repaint();
			}
		}}
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
