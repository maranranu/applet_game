import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class item {
	
	private int x,y,dx,radius;
	private game1 g;
	private boolean createnew = false;
	
	public item(int x) {
		this.x = x;
		Random r = new Random();
		y = r.nextInt(400) + radius;
		dx = -2;
		radius = 20;
	}
	
	
	public boolean isCreatenew() {
		return createnew;
	}


	public void setCreatenew(boolean createnew) {
		this.createnew = createnew;
	}


	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void update(game1 g, ball b) {
		x += dx;
		this.g = g;
	checkForCollision(b);	
	if (x < 0 - radius) {
		createnew = true;
		//Random r = new Random();//reusing of platforms
		//y = g.getHeight() - 40 - r.nextInt(400);
		//x = g.getWidth() + 2000 +  r.nextInt(300);
	}
		
		
	}
	private void checkForCollision(ball b) {
		// TODO Auto-generated method stub
		int ballX = b.getX();
		int ballY = b.getY();
		int ballRadius = b.getRadius();
		
		int a = x - ballX;
		int d = y - ballY;
		int collide = radius + ballX;
		//distance between object centres
		double c = Math.sqrt((double) (a*a) + (double) (d*d));
		
		if (c < collide) {
			performAction(b);
			createnew = true;
		}
	}
	protected void performAction(ball b) {
		// TODO Auto-generated method stub
		
	}
	private void performAction() {
		// TODO Auto-generated method stub
		
	}
	public void paint(Graphics gc) {
		gc.setColor(Color.pink);
		gc.fillOval(x-radius, y, radius, radius);
		
	}
	
	
	
	
}
