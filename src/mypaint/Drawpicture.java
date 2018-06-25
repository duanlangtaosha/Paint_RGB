package mypaint;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class Drawpicture extends JFrame {
	
	public Drawpicture() {
		setSize(800,600);
		setVisible(true);
	}
	public void paint(Graphics g) {
//		g.setColor(Color.BLUE);
		Color c = new Color(255, 255, 0);
		
		g.setColor(c);
		g.fillRect(0, 0, 640, 480);
	}
	
	public static void main(String[] args) {
		new Drawpicture();
	}
}
