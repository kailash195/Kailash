
public class Hello {		
	public static String[] dhin()
	{
		String s3[] = new String [21];				
		for(int i=0;i<=20;i++)
		{
			
			s3[i]= Integer.toString(i);
		}
	      return s3;	
	}
	
	public static void main(String[] args) 
	{
		String s1[] = dhin();
		System.out.println(s1.length);
		for(int j=0;j<=s1.length-1;j++)
		{
			if(s1[j]!=null)
			{
			System.out.println(s1[j]);
			}
		}
		Collection collect = new Collection();
		collect.dhinManda();
	}

}

//logger
//try catch

