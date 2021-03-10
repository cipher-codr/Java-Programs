import java.awt.*;
import java.awt.event.*;

class button extends Frame
{
	public static void main(String args[])
	{
		button f = new button();
	    f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
	    f.setTitle("Button in Frame");
	    f.setLocation(150,150);
	   
        Button b = new Button("Show");
        Button b1 = new Button("Hide");
	    Button b2 = new Button();
		
        b.setBounds(40,50,60,30);
        b.setBackground(Color.yellow);
	    b.setForeground(Color.green);
	    
		b1.setBounds(40,100,60,30);
	    b1.setBackground(Color.red);
        b1.setForeground(Color.green);
	    
		b2.setBounds(40,150,60,30);
	    b2.setBackground(Color.blue);
	    b2.setForeground(Color.green);
	   
	    f.add(b);
        f.add(b1);
	    f.add(b2);
	}
	
	button()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
		    }
	    });
    }
}