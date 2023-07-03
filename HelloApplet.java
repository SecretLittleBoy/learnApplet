import java.awt.Graphics;
import javax.swing.JApplet;

public class HelloApplet extends JApplet {
	int initCount = 0, stopCount = 0, startCount = 0, paintCount = 0, destroyCount = 0;

	public void init() {
		initCount++;
	}

	public void stop() {
		stopCount++;
	}

	public void start() {
		startCount++;
	}

	public void destroy() {
		destroyCount++;
	}

	public void paint(Graphics g) {
		paintCount++;
		String outString = "init: " + initCount + "  start:" + startCount
				+ " paint:" + paintCount + "  stop:" + stopCount + "  destroy:"
				+ destroyCount;
		g.drawString(outString, 50, 50);
	}
}
