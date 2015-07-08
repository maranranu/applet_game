import java.awt.Color;
import java.awt.Graphics;

public class up extends item{

	public up(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	public void performAction(ball b) {
		if (b.getAgility() < 8) {
		b.setAgility(b.getAgility() + 1);
		}
	}
	@Override
	public void paint(Graphics gc) {
		// TODO Auto-generated method stub
		gc.setColor(Color.red);
		super.paint(gc);
	}

}
