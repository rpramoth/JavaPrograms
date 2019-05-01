package strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="This class is to explain about strings";
		//To find the index positions
		System.out.println(s.indexOf("s"));
		System.out.println(s.indexOf("s", s.indexOf("s", s.indexOf("s"))+1));
		System.out.println(s.indexOf("s", s.indexOf("s",s.indexOf("s", s.indexOf("s", s.indexOf("s"))+1)+1)));
		
		//To find the character at the given index
		System.out.println(s.charAt(5));
		
		
		//Reverse a string using inbuilt function
		StringBuilder strBd=new StringBuilder();
		strBd.append(s);
		System.out.println(strBd.reverse());
		
		//Reverse using for loop
		String rev="";		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
	}

}
