import java.awt.*;
import java.applet.*;

public class worldclassapplet extends Applet{
	private Button go;
	private TextField name;
	private Label hello;
	
	public void init() {
		go = new Button("Go");
		name = new TextField();
		hello = new Label("",Label.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(name,BorderLayout.NORTH);
		
		Panel centre = new Panel();
		centre.add(go);
		this.add(centre,BorderLayout.CENTER);
		this.add(hello,BorderLayout.SOUTH);
		
		printHello listener = new printHello(hello,name);
		go.addActionListener(listener);
		
	}
	
	
}
