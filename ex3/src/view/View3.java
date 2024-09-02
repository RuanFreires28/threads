package view;

import controller.Controller3;

public class View3 
{
	public static void main(String[] args) 
	{
		int[] vet = new int[1000]; 
		
		for (int i = 0; i < 1000; i++)
		{
			vet[i] = (int)((Math.random() * 100) + 1);
		}
		
		Controller3 t1 = new Controller3(2, vet);
		t1.run();
		
		Controller3 t2 = new Controller3(1, vet);
		t2.run();
			
	}
}
