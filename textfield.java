import java.awt.*;
import java.awt.event.*;

class textfield extends Frame
{
    textfield()
	{
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
			{
				System.exit(0);
            }
        });
    }
    public static void main(String args[])
	{
        textfield t = new textfield();
        t.setSize(400,400);
        t.setVisible(true);
        t.setTitle("Text Field");
        t.setLayout(null);
		
        TextField t1 = new TextField("Text1",12);
        t1.setBounds(30,60,130,30);
        
        TextField t2= new TextField("Text2",12);
        t2.setBounds(30,120,130,30);
        
        t.add(t1);
        t.add(t2);
    }
}