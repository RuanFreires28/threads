package view;

import controller.Controller;

public class Main 
{
	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 5 ; i++)
		{
			Controller c = new Controller();
			c.start();
		}
	}
}
