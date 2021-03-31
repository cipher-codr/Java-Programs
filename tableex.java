import javax.swing.*;

class tableex
{
	tableex()
	{
		JFrame f=new JFrame();
		String data[][]={
			{"1","Ajay","23"},
			{"2","Armaan","35"},
			{"3","Ashish","48"},
			{"4","Dipti","30"},
			{"5","Faizan","25"},
			{"6","Govind","46"},
			{"7","Jay","13"},
			{"8","Kavita","27"},
			{"9","Manisha","32"},
			{"10","Neeraj","38"}
		};
		
		String column[]={"Enroll","Name","Marks Out of 50"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,100,100);
		//jt.
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(400,300);
		f.setLocation(800,100);
		f.setVisible(true);
		f.setTitle("JTable Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new tableex();
	}
}
