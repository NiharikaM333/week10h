package Week10;

import java.util.*; 
import java.util.stream.IntStream; 

public class Average_of_Integers {
	 public static void main(String[] args) 
	    {
		 	int a[]= {56,55,57,58,59,53};
	        IntStream stream = IntStream.of(a); 
	        OptionalDouble obj = stream.average(); 
	        if (obj.isPresent()) { 
	            System.out.println(obj.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}
