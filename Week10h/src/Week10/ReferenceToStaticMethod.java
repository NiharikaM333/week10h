package Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReferenceToStaticMethod {
	public static void main(String[] args) {
        List<String> a = Arrays.asList("121","1221","12344321","hiih","dad","avdc","abcdef");
        List<String> palindromes = ReferenceToStaticMethod.checkPaln(a, 
                (str) -> ReferenceToStaticMethod.checkPaln((String) str));
 
        System.out.println("Palindromes in the List are " + palindromes);
    }
 
    public static boolean checkPaln(String str) {
    	StringBuffer s =new StringBuffer();
    	for(int i = str.length()-1; i >= 0 ; i--) {
    	s = s.append(str.charAt(i));
    	}
    	if(str.equalsIgnoreCase(s.toString())) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> checkPaln(List<String> list, Predicate<String> predicate) { 
    	List<String> sortedpal = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            sortedpal.add((String) i);
        });
        return sortedpal;
 
    }
    
}
