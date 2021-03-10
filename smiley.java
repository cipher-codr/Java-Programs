import java.awt.*;
import java.awt.event.*;

class smiley extends Frame
{
	smiley()
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
	g.setColor(Color.blue);
	//g.drawRect(125,125,150,150);
	g.fillRect(125,125,150,150);
	
	g.setColor(Color.red);
	g.fillOval(160,160,80,80);
	//g.drawOval(160,160,80,80);//face
	
	g.setColor(Color.black);
	g.fillOval(182,175,10,10);
	//g.drawOval(182,175,10,10);//eye
	g.fillOval(210,175,10,10);
	//g.drawOval(210,175,10,10);//eye
	
	g.setColor(Color.orange);
	g.fillRect(198,180,5,30);
	//g.drawRect(198,180,5,30);//nose
	
	g.setColor(Color.pink);
	g.fillArc(182,205,35,20,0,-180);
	//g.drawArc(182,205,35,20,0,-180);//smile
}

public static void main(String args[])
{
	smiley s=new smiley();
	s.setSize(400,400);
	s.setTitle("Smiley");
	s.setVisible(true);
}
}