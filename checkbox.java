import java.awt.*;
import java.awt.event.*;

class checkbox extends Frame implements ItemListener
{
	Checkbox c1,c2;
	checkbox()
	{
		setLayout(new FlowLayout());
		
		c1=new Checkbox("Option1",true);
		c2=new Checkbox("Option2");
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
		
		//to close window
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	//method when user click the checkbox
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	//show current state
	public void paint(Graphics g)
	{
		g.drawString("Status:",15,100);
		String msg1= "Option1:"+c1.getState();
		g.drawString(msg1,15,130);
		String msg2= "Option2:"+c2.getState();
		g.drawString(msg2,15,150);
	}
	
	public static void main(String args[])
	{
		checkbox ch=new checkbox();
		ch.setSize(450,400);
		ch.setVisible(true);
		ch.setTitle("Checkbox Status");
	}
}
