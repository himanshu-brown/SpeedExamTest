
import java.net.URL;

class Solution_4 {

	
	public static boolean isValid(String url)
	{
		
			new URL(url).toURI();
			return true;
		
			return false;
	}
	
	public static void main(String[] args)
	{
		String url1 = "https://www.facebook.org/";
		if (isValid(url1))
			System.out.println("Yes");
		else
			System.out.println("No");	
			
	}
}
