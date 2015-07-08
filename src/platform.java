import java.awt.Color; 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.util.Random;


public class platform {
	
	int dx;
	int state;
	public int x, y, width1, height1,width2,height2;
	Image plat2;
	int width,height;
	URL url;
	double frame = 0;

	public platform() {
		dx = -1;
		x = 300;
	    y = 300;
	    width = 120;
	    height = 40;	   
	}
	
	public platform(int x, int y) {
		this.x = x;
		this.y = y;

		width2 = 90;
		height2 = 60;
		dx = -1;
		state = 1;
		plat2 = picture.platform2;
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
	
	public int getWidth2() {
		return width2;
	}

	public void setWidth2(int width2) {
		this.width2 = width2;
	}

	public int getHeight2() {
		return height2;
	}

	public void setHeight2(int height2) {
		this.height2 = height2;
	}
	public void update(game1 g) {
		int tester = (int)(frame + .1);
		
		if (tester < 3) {
			frame += .1;
		} else {
			frame = 0;
		}
	 x += -(picture.level);
	 if (x < 0 - width) {
		//Random r = new Random();                           //reusing of platforms
		x = g.getWidth() + 200;
		
	}
	}


	public void paint(Graphics gc) {
		
		gc.setColor(Color.blue);
		gc.drawImage(plat2, x, y, width2, height2, picture.g);
	
		
	}	
}
