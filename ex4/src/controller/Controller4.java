package controller;

public class Controller4 extends Thread
{
	private int _distancia;
	
	public Controller4(int distancia)
	{
		_distancia = distancia;
	}
	
	
	@Override
	public void run() 
	{
		int tid = (int) getId();
		salto(tid);
	}
	
	private void salto(int id) 
	{
		
		
		double somasalto = 0;
	
		while (somasalto<_distancia)
		{
			double salto = (Math.random()*1.25);
			somasalto = somasalto + salto;	
			System.out.println("o sapo " + id + " saltou " + salto + " metros ");			
		}
		System.out.println("\no sapo " + id + " terminou a corrida");
	}
			
			
}
