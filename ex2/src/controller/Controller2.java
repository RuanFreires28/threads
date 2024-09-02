package controller;

public class Controller2 extends Thread
{

	private int[] _vet = new int[5];
	
	
	public Controller2( int[] vet)
	{
		_vet = vet;
	}
	
	
	@Override
	public void run() 
	{
		SomaVet();
	}
	
	private void SomaVet() 
	{
		
		int somavet = 0;
		
		for (int y = 0; y < 5 ; y++)
		{
			somavet = somavet + _vet[y];
		}
	
		int tid = (int) getId();
		System.out.println("#" + tid + " ==> " + somavet);
	}
	
	
}
