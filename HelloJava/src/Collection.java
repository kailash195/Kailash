import java.util.*;

import java.util.stream.*;
//class Product{
//	int id;
//	String name;
//	float price;
//	public Product (int id,String name,float price)
//	{
//		this.id= id;
//		this.name = name;
//		this.price = price;
//	}
//}

/*
 * public class Collection {
 * 
 * public static void main(String[] args) { System.out.println("Hellow World");
 * 
 * 
 * // List<Product> pd = new ArrayList<Product>(); // pd.add(new
 * Product(1,"Ram",2500f)); // pd.add(new Product (1,"Jagan",3500f)); // List
 * <String> priceName = pd.stream().filter(p->p.price>3000).map(pm
 * ->pm.name).collect(Collectors.toList()); //
 * System.out.println("priceName"+priceName);
 * 
 * 
 * ArrayList<Integer> a1 = new ArrayList<Integer>(); for (int i = 0; i <= 10;
 * i++) { a1.add(i); } System.out.println(a1); a1.add(2);
 * System.out.println(a1); Collections.sort(a1); System.out.println(a1);
 * System.out.println(a1.size());
 * 
 * ArrayList<Integer> a2 = new ArrayList<Integer>(); for (int i = 11; i <= 20;
 * i++) { a2.add(i); } System.out.println(a2); a1.addAll(a2);
 * System.out.println(a1); a1.clear(); System.out.println(a1);
 * 
 * //LinkedList LinkedList<String> l1=new LinkedList<String>(); l1.add("Ravi");
 * l1.add("Vijay"); l1.add("Ravi"); l1.add("Ajay");
 * 
 * System.out.println(l1);
 * 
 * l1.add(1, "Gaurav");
 * 
 * System.out.println(l1);
 * 
 * 
 * LinkedList<String> l2=new LinkedList<String>(); l2.add("Sonoo");
 * l2.add("Hanumat");
 * 
 * l1.addAll(l2); System.out.println(l1); LinkedList<String> l3=new
 * LinkedList<String>(); l3.add("John"); l3.add("Rahul");
 * 
 * l1.addAll(1, l3); System.out.println(l1);
 * 
 * l1.addFirst("Lokesh"); System.out.println(l1);
 * 
 * l1.addLast("Harsh"); System.out.println(l1);
 * 
 * 
 * HashMap hm=new HashMap();
 * 
 * System.out.println("Initial list of elements: "+hm); hm.put(100,10);
 * hm.put(101,20); hm.put(102,30); hm.put(103,null); hm.put(104,null);
 * System.out.println(hm); System.out.println(hm.get(104));
 * 
 * if (hm.containsKey(100)) {
 * System.out.println("Initial list of elements: "+hm.get(100)); }
 * System.out.println(hm.size()); hm.put(104,40); System.out.println(hm);
 * hm.remove(104); System.out.println(hm);
 * 
 * System.out.println(hm.hashCode()); hm.clear(); System.out.println(hm);
 * 
 * }
 * 
 * }
 */


public class Collection
{
	public static void dhinManda()
	{
		System.out.println("The quick brown fox jumps over the lazy do");
		String s = "The quick brown fox jumps over the lazy do";
        String s1[] = s.split(" ");
        String s3[] = new String [50];
        System.out.println(s3.length);
        String s4="";
        for(int i = 0;i<s1.length;i++)
        {
            
            s3[i] = s1[s1.length-(i+1)];
            System.out.println(s3[i]);
            s4+=s3[i]+" ";
        }
        System.out.println(s4);
        StringBuilder s5 = new StringBuilder();
        s5.append(s4);
        System.out.println(s5.reverse());
        String s6[] = s4.split(" ");
        StringBuilder s7 = new StringBuilder();
        StringBuilder s8 = new StringBuilder();
        for(int j = 0;j<s6.length;j++)
        {
            s7.append(s6[j]);
            s7.reverse();
            s8.append(s7.toString()+" ");
            s7.setLength(0);
        }
        System.out.println(s8);
	}
	public static void dhinManda(String[] args)
	{
		System.out.println("The quick brown fox jumps over the lazy doooooooo");
		String s = "The quick brown fox jumps over the lazy do";
        String s1[] = s.split(" ");
        String s3[] = new String [50];
        System.out.println(s3.length);
        String s4="";
        for(int i = 0;i<s1.length;i++)
        {
            
            s3[i] = s1[s1.length-(i+1)];
            System.out.println(s3[i]);
            s4+=s3[i]+" ";
        }
        System.out.println(s4);
        StringBuilder s5 = new StringBuilder();
        s5.append(s4);
        System.out.println(s5.reverse());
        String s6[] = s4.split(" ");
        StringBuilder s7 = new StringBuilder();
        StringBuilder s8 = new StringBuilder();
        for(int j = 0;j<s6.length;j++)
        {
            s7.append(s6[j]);
            s7.reverse();
            s8.append(s7.toString()+" ");
            s7.setLength(0);
        }
        System.out.println(s8);
	}
	public static void main(String[] args) {
		dhinManda();
		
	}
}
