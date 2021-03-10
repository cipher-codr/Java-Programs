import java.awt.*;
import java.awt.event.*;

class langbutton extends Frame
{
	public static void main(String args[])
	{
		langbutton f = new langbutton();
	    f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
	    f.setTitle("Button in Frame");
	    f.setLocation(150,150);
	   
	    f.setBackground(new Color(10,20,20));
	    
        Button b = new Button("Hindi");
        Button b1 = new Button("English");
	    Button b2 = new Button("Hindi & English");
        Button b3= new Button("Not Any");
		
		b.setBounds(40,100,100,30);
        b.setBackground(Color.black);
	    b.setForeground(Color.green);
	    
		b1.setBounds(40,150,100,30);
	    b1.setBackground(Color.black);
        b1.setForeground(Color.green);
	    
		b2.setBounds(40,200,100,30);
	    b2.setBackground(Color.black);
	    b2.setForeground(Color.green);
		
		b3.setBounds(40,250,100,30);
	    b3.setBackground(Color.black);
	    b3.setForeground(Color.green);
		
	    f.add(b);
        f.add(b1);
	    f.add(b2);
		f.add(b3);
	}
	
	langbutton()
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