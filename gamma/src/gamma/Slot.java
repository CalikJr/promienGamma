package gamma;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Slot extends JPanel implements MouseListener{
	Image image;
	boolean IsChoosen;
	int IntKomora;
	
	Slot(int n, String url){
		image = (new ImageIcon(url)).getImage();
		setSize(image.getWidth(null), image.getHeight(null));
		IntKomora = n;
		IsChoosen = false;
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 //g2d.fillRect(0, 0, image.getWidth(null), image.getHeight(null));
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
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(SimulationThread.iteration<1 || SimulationThread.iteration>999) {
		switch(IntKomora) {
		case 1:
			{AnimationPanel.komora1 = (new ImageIcon("./src/pictures/komora1_opened.png")).getImage();
			if(AnimationPanel.Cs.isChoosen)
				AnimationPanel.Cs.setVisible(true);
			if(AnimationPanel.Co.isChoosen)
				AnimationPanel.Co.setVisible(true);
			break;}
		case 2:
			{AnimationPanel.komora2 = (new ImageIcon("./src/pictures/komora2_opened.png")).getImage();
			if(AnimationPanel.Al.isChoosen)
				AnimationPanel.Al.setVisible(true);
			if(AnimationPanel.Pb.isChoosen)
				AnimationPanel.Pb.setVisible(true);
			break;}
		case 3:
			{AnimationPanel.komora3 = (new ImageIcon("./src/pictures/komora3_opened.png")).getImage();
			
			break;}
		case 0:
			{MainPanel.animationpanel.revalidate();
			MainPanel.animationpanel.repaint();
			break;}
		}
		MainPanel.animationpanel.revalidate();
		MainPanel.animationpanel.repaint();
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(SimulationThread.iteration<1 || SimulationThread.iteration>999) {
		switch(IntKomora) {
		case 1:
			{AnimationPanel.komora1 = (new ImageIcon("./src/pictures/komora1_closed.png")).getImage();
			if(AnimationPanel.Cs.isChoosen==true)
				AnimationPanel.Cs.setVisible(false);
			if(AnimationPanel.Co.isChoosen==true)
				AnimationPanel.Co.setVisible(false);
			break;}
		case 2:
			{AnimationPanel.komora2 = (new ImageIcon("./src/pictures/komora2_closed.png")).getImage();
			if(AnimationPanel.Al.isChoosen==true)
				AnimationPanel.Al.setVisible(false);
			if(AnimationPanel.Pb.isChoosen==true)
				AnimationPanel.Pb.setVisible(false);
			break;}
		case 3:
			{AnimationPanel.komora3 = (new ImageIcon("./src/pictures/komora3_closed.png")).getImage();
			break;}
		case 0:
			MainPanel.animationpanel.revalidate();
			MainPanel.animationpanel.repaint();
			break;
		}
		MainPanel.animationpanel.revalidate();
		MainPanel.animationpanel.repaint();
	}
	}
}
