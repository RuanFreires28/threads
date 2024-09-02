package controller;

public class Controller3 extends Thread
{
	
	private int _n = 0;
	private int[] _vet = new int[1000];
	
	public Controller3(int n, int[] vet) 
	{
		_n = n;
		_vet = vet;
	}
	
	@Override
	public void run() 
	{
		
		ThreadVetor();
	}
	
	private void ThreadVetor() 
	{
		
		double tempoinicial = 0;
		double tempofinal = 0;
		
		if (_n % 2==0)
		{
			tempoinicial = (System.nanoTime() * Math.pow(10, 9));
			
			for (int i = 0 ; i < _vet.length; i++)
			{
				System.out.print(_vet[i] + " ");
			}
			
			tempofinal = (System.nanoTime() * Math.pow(10, 9));
		}
		else if(_n % 2 == 1)
		{
			tempoinicial = (System.nanoTime() * Math.pow(10, 9));
			
			for (int i : _vet)
			{
				System.out.print(i + " ");
			}
			
			tempofinal = (System.nanoTime() * Math.pow(10, 9));
		}
		
		System.out.println("\na operação: " + _n + " demorou " + (tempofinal - tempoinicial) + " ns.");
	}
}
