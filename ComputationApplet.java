import java.awt.Graphics;
import javax.swing.*;
public class ComputationApplet extends JApplet {
	int n;
	long s = 1;

	public void init() {
		String nStr = JOptionPane.showInputDialog("输入一个正整数:");
		n = Integer.parseInt(nStr);
		for (int i = 1; i <= n; i++)
			s = s * i;
	}

	public void paint(Graphics g) {
		g.drawRect(40, 30, 150, 55);
		g.drawString(n + " != " + s, 60, 50);
	}
}