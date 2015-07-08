import java.awt.Color;
import java.awt.Graphics;

public class down extends item{

	public down(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	public void performAction(ball b) {
		if (b.getAgility() >= 2) {
		b.setAgility(b.getAgility() - 1);
		}
	}
	@Override
	public void paint(Graphics gc) {
		// TODO Auto-generated method stub
		gc.setColor(Color.cyan);
		super.paint(gc);
	}

}
