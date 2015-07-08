import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.net.*;

public class audio extends Applet{
	private AudioClip clip;
	private AppletContext context;
	
	public void init() {
		context = this.getAppletContext();
		String audioURL = this.getParameter("audio");
		
		if (audioURL == null) {
			audioURL = "01.ESCAPE.mp3";
		}
		try {
			URL url = new URL(this.getDocumentBase(),audioURL);
			clip = context.getAudioClip(url);
		}catch (Exception e) {
			e.printStackTrace();
			context.showStatus("could not load a file");
		}
	}
	public void start() {
		if (clip != null) {
			clip.loop();
		}
	}
	public void stop() {
		if (clip != null) {
		clip.stop();	
		}
	}
}
