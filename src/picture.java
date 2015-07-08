import java.applet.AudioClip;
import java.awt.Image;
import java.net.URL;


public class picture {
	
		static Image platform1,ball,platform2,platform3;
		URL url;
		static game1 g; 
		static AudioClip music,clip;
		static int level = 1;
		
	public picture(game1 g) {
		try {
			url = g.getDocumentBase();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		music = g.getAudioClip(url, "hello.wav");
	    platform2 = g.getImage(url, "cutie1.png");
	   
		this.g = g;
		
		
	}
}
