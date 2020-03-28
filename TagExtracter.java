import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.regex.Pattern;


public class TagExtracter{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			boolean match = false;
          	Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = pattern.matcher(line);
            while(m.find()){
                System.out.println(m.group(2));
                match = true;
            }
            if(!match){
                System.out.println("None");     
            }
			testCases--;
		}
	}
}


