import java.applet.Applet;
import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.Random;

public class game1 extends Applet implements Runnable,MouseMotionListener,MouseListener {
	private Image i;
	private Graphics gr;
	platform p[] = new platform[10];
	public int time = 0;
	double cityX = 0;
	double cityDx = 3;
	URL url;
	Image city;
	platform pp;
	Image plat2;
	int levelcheck = 0;
	int score;
	boolean mousein = false;
	int a[] = new int[20];
	int b[] = new int[20];
	int mx;
	int my;
	boolean gameover = false;
	Button playButton;
	
	boolean ismousepressed = false;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public void init() {
		
		setSize(900,600);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		try {
			url = getDocumentBase();
			
		} catch (Exception e) {
		   }
		
		city = getImage(url, "Forest_background_by_whitewolf16.png");
		new picture(this);
		picture.music.play();
		picture.music.loop();
	}

	public void start()
	{
		   score = 0;
		   time = 0;
		   
		   for (int i = 0; i < p.length; i++) {
			   Random r = new Random();
			  p[i] = new platform(getWidth() + 200 * i,getHeight() - 100* i);  //200*i is for giving space between platforms
			   a[i] = getWidth() + 200 * i;
			   b[i] = getHeight() - 100 * i;
		   }

		 Thread thread = new Thread(this) ; //define a thread for runnable
		 thread.start();  //thread used to perform a same task again and again
	}
	
	
	public void run() {
    	 while(true) {    		 
    		 if (levelcheck > 500) {
    			 picture.level++;
    			 levelcheck = 0;
    		 } else {
    			 levelcheck++;
    		 }
    		 
    			 time++;
			   for (int i = 0; i < p.length; i++) { 
				   p[i].update(this);
			   }
			   
    		  repaint(); 
    		  try {
				Thread.sleep(17);
			  } catch (InterruptedException e) {
				e.printStackTrace();
			    } 
    	 }
  }
     
    
	public int[] getA() {
		return a;
	}
	public int[] getB() {
		return b;
	}
	
	@Override
	public void stop()
	{}
	
	@Override
	public void destroy() {}
	 	
	@Override
	public void update(Graphics g) { 
		if (i == null) {
			i = createImage(this.getSize().width,this.getSize().height); 
			gr = i.getGraphics();
		}
		
		gr.setColor(getBackground());
		gr.setColor(getForeground());
		paint(gr);
		g.drawImage(i, 0, 0, this);
	}

	public void paint(Graphics gc) {			
		gc.setColor(new Color(15,77,147));
		gc.drawImage(city,(int) cityX, 0, this);
			 for (int i = 0; i < p.length; i++) {
				 p[i].paint(gc);
			 }
			
			 String s = Integer.toString(time);
			 String ss = "Time";
			 Font myFont = new Font(s, Font.CENTER_BASELINE, 30);
			 gc.setColor(Color.pink);
			 gc.drawString(ss, getWidth() - 100, 50);
			 gc.drawString(s, getWidth() - 100, 85);
			 gc.drawString("Score", 50, 50);
			 String st = Integer.toString(score);
			 gc.drawString(st, 50, 80); 
			 gc.setFont(myFont);
			 
			 if (score < 1000 && time > 5000) {
				 gc.drawString("Game over",300,300);
			 } 
			 
			 if (score > 1000 && time <= 5000) {
				gc.drawString("congratulation you won",350,300); 
			 }
			 showStatus("fast and furious game !!!!!");
			 
			 
			 
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
	
		for (int i = 0; i < p.length; i++) {
			if (mx >= p[i].x && mx <= p[i].x + p[i].plat2.getWidth(this) && my >= p[i].y && my <= p[i].y + p[i].getHeight2()) {
				mousein = true;
				break;
		    } 
		    else {
			 mousein = false;
		    }
		}
		 if (mousein == true) {
			 picture.music.play();
			score += 25;
		 }
		
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		repaint();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	
	}

	

}