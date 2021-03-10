import java.awt.*;
import java.awt.event.*;

class Firstframe
{
	public static void main(String args[])
	{
		Frame f1=new Frame("My First");
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setTitle("My First Frame");//priority title
		f1.addWindowListener(new Close());
	}
}

class Close implements WindowListener
{
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e) //it closes window
	{
		System.exit(0);
	}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
/*
class Close extends WindowAdapter  //using window adapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
*/