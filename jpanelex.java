import java.awt.*;
import javax.swing.*;

public class jpanelex {
	jpanelex()
	{
		JFrame f = new JFrame("JPanel Example");
		
        JPanel p1 = new JPanel();
        p1.setBounds(40,30,400,200);
        p1.setBackground(Color.gray);
		
		JPanel p2 = new JPanel();
        p2.setBounds(40,250,400,150);
        p2.setBackground(Color.gray);
		
		JTextArea ta = new JTextArea("Write Text Here!",10,20);
		ta.setBounds(60,50,100,100);
		
		JSlider s = new JSlider(JSlider.HORIZONTAL,0,50,25);
		s.setMinorTickSpacing(2);
		s.setMajorTickSpacing(10);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		
		JButton b1=new JButton("OK");
        b1.setBounds(210,310,60,20);
        b1.setBackground(Color.yellow);
    
		p1.add(ta);
		p2.add(s);

        f.add(b1);
		f.add(p1);
		f.add(p2);
        f.setSize(500,500);
		f.setLocation(780,100);
        f.setLayout(null);
        f.setVisible(true);
	 	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public static void main(String args[])
	{
		new jpanelex();
    }
}
