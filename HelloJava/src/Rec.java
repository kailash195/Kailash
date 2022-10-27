
public class Rec {

	static int i = 0;
	static String s4="";
	static String s = "VAESO INDIA PVT LTD";
	static String s1[] = s.split(" ");
	
	public static void main(String[] args) {
		
        System.out.println(s1.length);
		printNum(i);
		
		System.out.println(s4.trim());

	}
	public static String printNum(int j)
	{
		if(j < s1.length)
		{
			String s3[] = new String [s1.length];
			s3[j] = s1[s1.length-(j+1)];
	        System.out.println(s3[j]);
	        s4+=s3[j]+" ";
	        System.out.println(s4);
	        System.out.println(s4.length());
	        j = j+1;
	        printNum(j);
		}
		
		return s4;
		
		
        
		
	}

}
