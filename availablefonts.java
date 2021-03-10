//prg to get list of fonts available in local system

import java.awt.GraphicsEnvironment;

class availablefonts
{
	//Driver Function
	public static void main(String[] args)
	{
		//Get the local graphics environment
		GraphicsEnvironment local_env; 
        local_env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		//Get available font names
		String allfonts[] = local_env.getAvailableFontFamilyNames();
		//Display the list of fonts
		for(int i=0;i<allfonts.length;i++)
	    System.out.println(allfonts[i]);
	}
}
