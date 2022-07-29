package day1;

interface Parser 
{
	String parse(String str);
	
}

//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
class StringParser 
{
	public static String convert(String s)
	{
		if(s.length()<=3)
			s = s.toUpperCase();
		
		else 
			s = s.toLowerCase();
		return s;
	}
}



class MyPrinter
{
	public void print(String str,Parser p)
	{
		str = p.parse(str);
		System.out.println(str);
	}
}
public class Demo {
	
	public static void main(String args[])
	{
//		List<String> names = Arrays.asList("Chauhan","prasad","anthony");
		
//		
		
		
				

		String str = "Chauhan";
		MyPrinter mp = new MyPrinter();
		mp.print(str,(StringParser::convert));
	}

}
