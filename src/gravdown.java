import java.awt.Color;
import java.awt.Graphics;

public class gravdown extends item{

	public gravdown(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	public void performAction(ball b) {
		if (b.getGravity() > 3) {
			b.setGravity(b.getGravity() - 3);
			if (b.getGravity() < 3) {
				b.setGravity(3);
			}
		}
	}
	@Override
	public void paint(Graphics gc) {
		// TODO Auto-generated method stub
		gc.setColor(Color.red);
		super.paint(gc);
	}

}
