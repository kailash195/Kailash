
class MyClass {

	
		int a,b;
		MyClass()
		{
			
		}
		MyClass(int i , int j)
		{
			a = i;
			b = j;
			
		}
		
		MyClass addNum (MyClass num1 ,MyClass num2)
		{
			MyClass temp = new MyClass();
			temp.a = num1.a + num2.a;
			temp.b = num1.b + num2.b;
			System.out.println("("+temp.a+"+"+temp.b+"i)");
			return temp;
		}
}

public class SampleJava
{
	public static void main(String[] args)
	{
		MyClass m1 =new MyClass(1,2);
		MyClass m2 =new MyClass(2,4);
		MyClass m3 =new MyClass();
		m3 = m3.addNum(m1,m2);
	}
}