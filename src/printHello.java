
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class printHello implements ActionListener {
	
	private Label label;
	private TextField textfield;
	
	public printHello(Label l, TextField t) {
		label = l;
		textfield = t;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String name = textfield.getText();
		
		if (name != null && !(name.equals(""))) {
			label.setText("Hello ," + name);
		}
		
		
		
	}
	
}
