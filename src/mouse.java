import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class mouse extends Applet implements MouseListener,Runnable{

	int x1,y1;
	platform pp = new platform();
	boolean active = false;
	private int score = 0;
	
	public void init() {
		addMouseListener(this);
	}
	
	public void paint(Graphics gc) {
		gc.drawString("Score", 30, 50);
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent m) {
		x1 = m.getX();
		y1 = m.getY();
		
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
