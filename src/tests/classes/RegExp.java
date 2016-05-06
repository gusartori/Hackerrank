package tests.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	
	public static void main (String noargs[]){
		String pattern = "\\bcat\\b";
		String line = "";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		if (m.find()){
			System.out.println(m.group(0));
		}
	}
}
