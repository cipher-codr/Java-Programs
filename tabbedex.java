//create content pane
import java.awt.*;
import javax.swing.*;

class tabbedex extends JFrame
{
	tabbedex()
	{
		Container c = getContentPane();
		
		JTabbedPane jt = new JTabbedPane();
		
		jt.addTab("Capitals",new Capital());
		jt.addTab("Country",new Country());
		
		c.add(jt);
	}
	
	public static void main(String args[])
	{
		tabbedex ob = new tabbedex();
		ob.setSize(450,400);
		ob.setLocation(600,100);
		ob.setVisible(true);
		ob.setTitle("JTabbed Pane");
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	
class Capital extends JPanel
{
	Capital()
	{
		JButton b1 = new JButton("BTN1");
		add(b1);
	}
}
	
class Country extends JPanel
{
	Country()
	{
		JButton b2 = new JButton("BTN2");
		add(b2);
	}
}
	
