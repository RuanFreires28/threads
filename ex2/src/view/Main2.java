package view;


import controller.Controller2;

public class Main2 
{
	public static void main(String[] args) 
	{
		
		int[][] matriz = new int[3][5];
		
		for (int x = 0; x < 3 ; x++)
		{
			for (int y = 0; y < 5 ; y++)
			{
				matriz[x][y] = (int)((Math.random() * 10) + 1);
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println("");
		}
		
		
		for (int x = 0; x < 3 ; x++)
		{
			int[] vet = new int[5];
			for (int y = 0; y < 5 ; y++)
			{
				vet[y] = matriz[x][y];
			}
			
			Controller2 c = new Controller2(vet);
			c.start();
		}
	}
}
