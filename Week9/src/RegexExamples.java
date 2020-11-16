import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A demo of Java regular expressions.
 * @author campbell
 * 
 * Some Resources:
 * Regex QuickRef.png in this folder
 * https://regex101.com [regex101.com]
 * https://regexone.com [regexone.com]
 * https://regexcrossword.com [regexcrossword.com]
 * https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
 * https://docs.oracle.com/javase/tutorial/essential/regex/
 */
public class RegexExamples {

	   public static void main(String[] args) {

	        // You can do an individual match in one easy line:
	        System.out.println(Pattern.matches("a*b", "aaaaab"));
	        
	        // Notice that it automatically anchors
	        // That is, it is equivalent to ^a*b$
	        System.out.println(Pattern.matches("a*b", "baaaaab"));
	        System.out.println();
	        
	        // If you never reuse the same pattern, this is fine.
	        // But if you plan to reuse a pattern, it's more efficient
	        // to let Java build the matching infrastructure once and 
	        // reuse it for each match against that pattern.
	        Pattern p = Pattern.compile("CSC[0-9][0-9][0-9]H5(F|S)");
	        Matcher m = p.matcher("CSC207H5F");
	        System.out.println("Does CSC207H5F match " + p + " ?");
	        System.out.println(m.matches());

	        // Here we reuse that (under the hood) infrastructure.
	        System.out.println("Does CSC199H1Y match " + p + " ?");
	        System.out.println(p.matcher("CSC199H1Y").matches() + "\n");

	        // Now, to match any part of the string instead of the entire thing, you can use find
	        System.out.println(m.find());
	        System.out.println();
	        
	        // The matcher has other methods that let you find out 
	        // which substrings matched with which "capturing group"
	        // of the pattern.  Each capturing groups begins with a 
	        // left bracket.  The capturing groups are numbered from 0,
	        // and group 0 is the whole pattern.

	        // Here I add more brackets to the pattern.
	        // This will allow us to capture the group of characters
	        // that is the course number.
	        p = Pattern.compile("CSC([0-9][0-9][0-9])H1(F|S|Y)");
	        m = p.matcher("CSC207H1S");
	        System.out.println(m.matches());
	        System.out.println(m.group(0));  // the entire string
	        System.out.println(m.group(1));  // the first group: 207
	        System.out.println(m.group(2));  // the second group: S
	        System.out.println();

	        // Using a backreference.
	        System.out.println("Backreferencing Example");
	        p = Pattern.compile("(\\d\\d\\d)ABC\\1"); // When using \ we have to escape that character with a preceding \
	        m = p.matcher("123ABC123");      
	        System.out.println(m.matches());    
	        System.out.println(m.group(1));
	        m = p.matcher("123ABC456"); // Backreferencing doesn't mean repeat the same \d\d\d regex, but the actual string which that group matched
	        System.out.println(m.matches());
	        System.out.println();
	        
			// find() and matches()
	        System.out.println("Find vs. Matches Example");
			p = Pattern.compile("\\d\\d\\d");
			m = p.matcher("a123b");
			System.out.println(m.find()); // find a substring that matches
			System.out.println(m.matches()); // matches the entire string	   
	   }
}
