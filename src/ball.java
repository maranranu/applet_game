import java.awt.Color;
import java.awt.Graphics;


public class ball {

	private int x = 400;
	private int y = 25;
	private int radius = 20;
	private double dx = 0;
	private double dy = 0;
	private double gravity = 15;
	private double energyloss = 1;
	private double dt = .2;
	private double friction  = .9;
	private double gameDy = -75;
	private int agility = 3;
	private int maxspeed = 20;
	
	public ball() {
		// TODO Auto-generated constructor stub
	}
	public ball(int i, int j) {
		x = i;
		y = j;
		// TODO Auto-generated constructor stub
	}
	
	public double getGameDy() {
		return gameDy;
	}
	public void setGameDy(double gameDy) {
		this.gameDy = gameDy;
	}
	
	public int getRadius() {
		return radius;
	}
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public double getDx() {
		return dx;
	}
	public void setDx(double dx) {
		this.dx = dx;
	}
	
	public double getDy() {
		return dy;
	}
	
	public double getGravity() {
		return gravity;
	}
	
	public void setDy(double dy) {
		this.dy = dy;
	}
	
	
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public void setGravity(double gravity) {
		this.gravity = gravity;
	}
	public void moveRight() {
		if ( dx + agility < maxspeed) {   //move faster to the right
			dx += agility;
		}
	}
	public void moveLeft() {
		if (dx + agility > -maxspeed) {   //move faster to the left
			dx -= agility;
		}
	}
	
	public void update(game1 g) {
		 if (x + dx > g.getWidth() - radius) {      //condition for collision with wall
			 x = g.getWidth() - radius - 1;    //by subtracting 1 to avoid losing 1 pixel
			 dx = -dx;                             //by reversing back
			 
		 } 
		 if (x + dx < 0 + radius) {
			 x = 0 + radius;
			 dx = -dx;
		 }
		 else {
			 x += dx;
		  }
		 
		 if (y == g.getHeight() - radius - 1) {     //if condition for friction
			 dx *= friction;                         
			 if (Math.abs(dx) < .8) {                   //taking in both direction
				 dx = 0;
			 }
		 }
		 if (y + dy > g.getHeight() - radius - 1) {
			 y = g.getHeight() - radius - 1;
			 dy *= energyloss;    //stop a ball from some time
			 dy = gameDy;
			// dy = -dy;
		 } else {
			 //velocity formula
			 dy += gravity*dt;
			 //position formula
			 y += dy*dt + .5*gravity*dt*dt;
		 }
	}
	public void paint(Graphics gc) {
		gc.setColor(Color.orange);
		gc.fillOval(x-radius, y, radius*2, radius*2);
		
	}
	
	
}
