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
	Slot(String url, int n){
		setSize(50, 50);
		IntKomora = n;
		if(url!=null)
		image = (new ImageIcon(url)).getImage();
		else
		IsChoosen = false;
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 if(IsChoosen==true){
			 g2d.drawImage(image, 0, 0, this);
		 }
		 
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
		switch(IntKomora) {
		case 1:
			{AnimationPanel.komora1 = (new ImageIcon("./src/pictures/komora1_opened.png")).getImage();
			break;}
		case 2:
			{AnimationPanel.komora2 = (new ImageIcon("./src/pictures/komora2_opened.png")).getImage();
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
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		switch(IntKomora) {
		case 1:
			{AnimationPanel.komora1 = (new ImageIcon("./src/pictures/komora1_closed.png")).getImage();
			break;}
		case 2:
			{AnimationPanel.komora2 = (new ImageIcon("./src/pictures/komora2_closed.png")).getImage();
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
