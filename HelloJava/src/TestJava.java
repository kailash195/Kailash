
public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "VAESO INDIA PVT LTD";
		
		System.out.println(printNum(s));
	}
	
	public static String printNum(String s)
	{
		
		
		
		
		
		  if(s == null || s.length() <= 1)
		  { 
			  System.out.println(s); 
			  //printNum(s); 
			  return s; 
			  
		  }
		  
		 
		
			
			//System.out.println(n);
			//System.out.println(s.substring(1));
			
			//AESO INDIA PVT LTDv
			
			System.out.println(s);
			return printNum(s.substring(1))+s.charAt(0);
			//return n;
		
	}

}
