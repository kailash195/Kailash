import java.io.*;
class First extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 20; i+=2) {
			System.out.println("Even Number"+i);
		}
	}
}
class Second extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 20; i+=2) {
			System.out.println("Odd Number"+i);
		}
	}
}
public class MultiThread {
	public static void main(String[] args) {
	try
	{
		
			System.out.println("Thread Start");
			First f = new First();
			Second s = new Second();
			f.start();
			s.start(); 
			
			System.out.println("Thread End");

	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	


}
