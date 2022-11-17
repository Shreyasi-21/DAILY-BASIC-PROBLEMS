import java.util.*;

class ReverseString
{
	public static void main(String args[])
	{
		
		String str="",revStr="";
		
		Scanner in = new Scanner(System.in);
		
		 
		System.out.print("Enter a string :");
		str= in.nextLine();
		
		
		int len= str.length();

		
		for ( int i = len- 1 ; i >= 0 ; i-- )
			revStr= revStr+ str.charAt(i);

		ss
		System.out.println("Reverse String is: "+revStr);
	}
}
