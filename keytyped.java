import java.awt.*;
import java.awt.event.*;

public class keytyped extends Frame implements KeyListener
{
	Label l;
	TextArea ta;
	
	keytyped()
	{
		//to close window
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		Frame f = new Frame("key presseed example");
		
		l = new Label();
		l.setBounds(20,50,100,20);
		
		ta = new TextArea();
		ta.setBounds(20,80,300,300);
		ta.addKeyListener(this);
		
		f.add(l);
		f.add(ta);
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
	}
	
	public void keyPressed(KeyEvent e)
	{
		l.setText("Key Pressed");
		char ch = e.getKeyChar();
		System.out.println(e.getKeyChar());
	}
	
	public void keyReleased(KeyEvent e)
	{
		//l.setText("Key Released");
	}
	
	public void keyTyped(KeyEvent e)
	{
		//l.setText("Key Typed");
	}
	
	public static void main(String args[])
	{
		new keytyped();
	}
}
