import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class scoreplus extends item{
	
	private game1 appletinfo;
	
	public scoreplus(int x, game1 appletinfo) {
		super(x);
		// TODO Auto-generated constructor stub
		this.appletinfo = appletinfo;
	}
	public void performAction() {
		Random r = new Random();
		appletinfo.setTime(appletinfo.getTime() + 500 + r.nextInt(2000));	
		appletinfo.setScore(appletinfo.getScore() + 500 + r.nextInt(2000));
	}
	
	public void paint(Graphics gc) {
		// TODO Auto-generated method stub
		
		gc.setFont(null);
		gc.setColor(Color.pink);
		super.paint(gc);
	}

}
