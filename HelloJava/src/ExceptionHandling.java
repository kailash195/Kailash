
public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int data=100/1;  
			String S = null;
			//System.out.println(S.length());
			
			String s1="abc";  
			int i=Integer.parseInt(s1);
			
			int a[]=new int[5];  
			a[10]=50;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		} 
		catch(NullPointerException e1)
		{
			System.out.println(e1);
		}
		catch(NumberFormatException e3)
		{
			System.out.println(e3);
		}
		
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println(e4);
		}

	}

}
