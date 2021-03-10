import java.awt.*;
import java.awt.event.*;

class bgcolorbutton extends Frame implements ActionListener
{
	bgcolorbutton()
	{
		this.setLayout(null);
		
        Button b = new Button("red");
        Button b1 = new Button("yellow");
	    Button b2 = new Button("blue");
        
		b.setBounds(40,50,60,30);
        b.setBackground(Color.black);
	    b.setForeground(Color.white);
	    
		b1.setBounds(40,100,60,30);
	    b1.setBackground(Color.black);
        b1.setForeground(Color.white);
	    
		b2.setBounds(40,150,60,30);
	    b2.setBackground(Color.black);
	    b2.setForeground(Color.white);
	   
	    this.add(b);
        this.add(b1);
	    this.add(b2);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
		    }
	    });
    }
	//this method is called when a button is clicked
	public void actionPerformed(ActionEvent ae)
	{
		//to get text/label of button
		String s = ae.getActionCommand();
		if(s.equals("red"))
			this.setBackground(Color.red);
		if(s.equals("yellow"))
			this.setBackground(Color.yellow);
		if(s.equals("blue"))
			this.setBackground(Color.blue);
	}
	
	public static void main(String args[])
	{
		bgcolorbutton m = new bgcolorbutton();
	    m.setSize(400,400);
        m.setVisible(true);
	    m.setTitle("Button with action");
	    m.setLocation(150,150);
	}
}