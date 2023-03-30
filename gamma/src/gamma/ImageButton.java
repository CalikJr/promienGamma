package gamma;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageButton extends JButton{
	ImageIcon image;
	ImageButton(String url){
		image = new ImageIcon(url);
		Image img = image.getImage();
		Image newimg = img.getScaledInstance(30, 30,  Image.SCALE_SMOOTH);
		image = new ImageIcon(newimg);
		this.setIcon(image);
	}
	
}
