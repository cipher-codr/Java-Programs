import java.awt.*;
import javax.swing.*;

public class Boxlyt extends Frame
{
	Button buttons[];
	Boxlyt()
	{
		buttons = new Button[5];
		for (int i=0;i<5;i++)
		{
			buttons[i] = new Button("BTN"+(i+1));
			add(buttons[i]);
		}

		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setSize(400,400);
		setLocation(800,100);
		setVisible(true);
		setTitle("Box Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		Boxlyt ob = new Boxlyt();
	}
}
