package PracticeProject;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = obj.nextLine();
	      System.out.println("Some of the valid and invalid email id formates:");
	      LinkedHashSet<String> mail=new LinkedHashSet<String>();
	      //List of email ids
	      mail.add("simple@gmail.com");
	      mail.add("simple.learn@gmail.com");
	      mail.add("name9@simplilearn.com");
	      mail.add("name@yahoo.in");
	      mail.add("simple_learn@gmail.com");
	      mail.add("name@domain.ac.in");
	      //as linkedhashset is used duplicates are not allowed
	      mail.add("name@yahoo.in");
	      //Invalid mails
	      mail.add("name@yahoo.in@gmail.com");
	      mail.add("name#yahoo.in");
	      mail.add("name$yahoo.in");
	      mail.add("name@gmail..com");
	      String p = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)"
	      		+ "*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
	      Pattern pattern = Pattern.compile(p);  
	      //Checking each mail
	         for(String emailid : mail){  
	          Matcher matcher = pattern.matcher(emailid);  
	          System.out.println(emailid +" : "+ matcher.matches());  
	 	  }
	     
	      //To check user input email valid or not
	      System.out.println("enter the email id:");
	      String email=obj.next();
	    
	         Matcher matcher = pattern.matcher(email);
	         //if mail matches all the requirements it is valid
	         if(matcher.matches()) {
	            System.out.println("Valid Email ID");
	         } else {
	            System.out.println("Invalid Email ID");
	            System.out.println("Please enter a valid email id as mentioned");
	         }
	      
	 }
}


