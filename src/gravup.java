import java.awt.Color;

import java.awt.Graphics;


public class gravup extends item{
 
	public gravup(int x) {
		super(x);
	}
	public void performAction(ball b) {
		b.setGravity(b.getGravity() + 3);
	}
	@Override
	public void paint(Graphics gc) {
		// TODO Auto-generated method stub
		gc.setColor(Color.red);
		super.paint(gc);
	}
	
}
