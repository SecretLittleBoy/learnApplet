import java.awt.Graphics;
import javax.swing.JApplet;
public class DrawingApplet extends JApplet{
	public void paint(Graphics g) {
	    g.drawLine(40,30, 200,30);
	    g.drawRect(40,50,160,150);
	    g.drawOval(45,55,150,140);
	    g.drawLine(40,220, 200,220);
	    g.drawString("Drawing!",100,130);         
	   }
}
