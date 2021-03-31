import java.awt.*;
import javax.swing.*;

class mymenu extends JFrame
{
	JMenuBar mbr;
	JMenu file, edit, search, view, tools, font;
	JMenuItem New, open, save, saveAs, close, print, cut, copy, paste, find, replace, f1, f2;
	
	mymenu()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		mbr=new JMenuBar();
		c.add(mbr, BorderLayout.NORTH);
		
		//create menu's file & edit
		file=new JMenu("File");
		edit=new JMenu("Edit");
		search=new JMenu("Search");
		view=new JMenu("View");
		tools=new JMenu("Tools");
		
		mbr.add(file);		mbr.add(edit);		mbr.add(search);		mbr.add(view);		mbr.add(tools);
		
		//create items in menu
		New =new JMenuItem("New");
		open =new JMenuItem("Open");
		save =new JMenuItem("Save");
		saveAs =new JMenuItem("SaveAs");
		close =new JMenuItem("Close");
		print =new JMenuItem("Print");
		cut =new JMenuItem("Cut");
		copy =new JMenuItem("Copy");
		paste =new JMenuItem("Paste");
		find =new JMenuItem("Find");
		replace =new JMenuItem("Replace");
		
		//add menu items
		file.add(New);		file.add(open);		file.add(save);		file.add(saveAs);		file.add(close);		file.add(print);
		edit.add(cut);		edit.add(copy);		edit.add(paste);
		search.add(find);		search.add(replace);
		
		//line as separator
		file.addSeparator();
		
		//create sub menu items
		font =new JMenu("Font");
		file.add(font);
		
		//items for submenu font
		f1 =new JMenuItem("F1");		f2 =new JMenuItem("F2");
		
		font.add(f1);		font.add(f2);
	}
	
	public static void main(String args[])
	{
		mymenu ob=new mymenu();
		ob.setTitle("Menu Example");
		ob.setSize(400,400);
		ob.setLocation(800,100);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}