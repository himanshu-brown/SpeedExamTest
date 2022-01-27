
import java.util.regex.Pattern;

public class Solution_4 {
    public static void main(String[] args) {
       System.out.println(isValidUrl("https://himanshu.sharma@bigohtech.com")); 
    }
    public static boolean isValidUrl(String url)
    {
        String regex = "((http|https)://)(www.)?"
              + "[a-zA-Z0-9@:%._\\+~#?&//=]"
              + "{2,256}\\.[a-z]"
              + "{2,6}\\b([-a-zA-Z0-9@:%"
              + "._\\+~#?&//=]*)";
        Pattern pattern = Pattern.compile(regex);

        if (url == null) {
            return false;
        }
        java.util.regex.Matcher m = pattern.matcher(url);
        return m.matches();
    }
}