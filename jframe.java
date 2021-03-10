//prg to implement java swing's Jframe
import javax.swing.*;

class jframe
{
	public static void main(String args[])
	{
		JFrame ob1=new JFrame("First Frame using Swing");
		ob1.setSize(400,400);
		ob1.setVisible(true);
		ob1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}