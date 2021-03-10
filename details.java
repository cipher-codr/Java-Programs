import java.awt.*;
import java.awt.event.*;

class details extends Frame
{
	details()
	{
	addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
	        }
		});
	}
	
	public void paint(Graphics g)
	{
		this.setBackground(new Color(10,20,20));
		Font f=new Font("Arial",Font.BOLD+Font.ITALIC,28);
		g.setFont(f);	
		g.setColor(Color.pink);
		g.drawString("Name: Yash Patidar",30,150);
		g.drawString("Enroll: 19100BTIT06641",30,200);
		g.drawString("Branch/Course: IT/B.Tech",30,250);
		g.drawString("Session: 2020-21",30,300);
	}
	
	public static void main(String args[])
	{
		details m = new details();
		m.setSize(400,400);
		m.setTitle("Detail");
		m.setVisible(true);
	}
}