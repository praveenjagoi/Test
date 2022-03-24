package org.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class B {
	public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter your Phone number");
       String phone = sc.next();
    String regex ="\\d{10}";
    
   Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(phone);
  
  if  (matcher.matches()) {
	System.out.println("Valid");
} else {
    System.out.println("invalid");
}
    
    		
       
       
		
	}
}
   
