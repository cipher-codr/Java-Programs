import java.awt.*;
import javax.swing.*;

class borderlyt
{
	borderlyt()
	{
		JFrame f = new JFrame();
		
		JButton b1 = new JButton("north btn");
		JButton b2 = new JButton("south btn");
		JButton b3 = new JButton("east btn");
		JButton b4 = new JButton("west btn");
		JButton b5 = new JButton("center btn");
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(400,400);
		f.setLocation(600,100);
		f.setVisible(true);
		f.setTitle("Border Layout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new borderlyt();
	}
}