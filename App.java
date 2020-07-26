package TAA.TAA;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        if(s1.charAt(0)=='A' && s1.charAt(1)=='A') {
        	System.out.println(s1.substring(2,s1.length()));
        }
        else if(s1.charAt(0)=='A') {
        	System.out.println(s1.substring(1,s1.length()));
        }
        else if(s1.charAt(1)=='A') {
        	System.out.println(s1.charAt(0)+s1.substring(2,s1.length()));
        }
        else {
        	System.out.println(s1);
        }
        
    }
}
