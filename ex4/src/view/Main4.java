package view;


import controller.Controller4;

public class Main4 
{
	public static void main(String[] args) 
	{
		
		int distancia = 50;
		
	
		for (int i = 0; i < 5 ; i++)
		{
			Controller4 c = new Controller4(distancia);
			c.start();
		}
	
		
	}
}
