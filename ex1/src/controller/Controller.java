package controller;

public class Controller extends Thread
{

	public Controller()
	{
		super();
	}
	
	
	@Override
	public void run() 
	{
		int tid = (int) getId();
		System.out.println("#" + tid);
	}
	
	
}
