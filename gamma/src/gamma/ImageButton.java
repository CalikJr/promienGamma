package gamma;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ImageButton extends JButton{
	ImageIcon image;
	ImageButton(String url){
		this.setForeground(Color.BLACK);
		this.setBackground(Color.WHITE);
		Border line = new LineBorder(Color.LIGHT_GRAY);
		  Border margin = new EmptyBorder(5, 15, 5, 15);
		  Border compound = new CompoundBorder(line, margin);
		  this.setBorder(compound);
		  this.setPreferredSize(new Dimension(40, 40));
		image = new ImageIcon(url);
		Image img = image.getImage();
		Image newimg = img.getScaledInstance(40, 40,  Image.SCALE_SMOOTH);
		image = new ImageIcon(newimg);
		this.setIcon(image);
	}
	
}
