import java.awt.*;
import java.awt.event.*;

class message extends Frame
{
	message()
	{
		//closing the frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
	        }
		});
	}
	
	//to referesh the frame content
	public void paint(Graphics g)
	{
		this.setBackground(new Color(100,20,20));
		Font f=new Font("Arial",Font.BOLD+Font.ITALIC,28);
		g.setFont(f);	
		
		g.setColor(Color.yellow);
		g.drawString("Hello Everyboby",100,200);
	}
	
	public static void main(String args[])
	{
		message m = new message();
		m.setSize(400,400);
		m.setTitle("Method to display text");
		m.setVisible(true);
	}
}