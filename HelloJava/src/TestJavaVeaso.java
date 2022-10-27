
public class TestJavaVeaso {
	
	static int x = 0 , y = 1;
	static int z ;
	static int startNo = 1 , endNo = 20;

	public static void main(String[] args) {
		
		int fib = 15;
		if((z >=startNo) && (z <= endNo))
		{
			System.out.println(x);
			System.out.println(y);
		}
		
		fibo(fib);
		
		


	}
	
	public static void fibo(int f)
	{
		if (f>0)
		{
			z = x+y;
			x = y;
			y = z;
			if((z >= startNo) && (z <= endNo))
			{
				System.out.println(z);
			}
			
			fibo(f-1);
		}
		
	}
	
	

}
