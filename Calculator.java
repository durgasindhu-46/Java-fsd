package BuildingBlocks;
import java.util.Scanner;
import java.lang.String;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Arithmetic Calculator For Two Numbers");
		char operator;
		double result;
		
	while(true) {
		//Code for entering input numbers
		System.out.println("Enter the input numbers");
		System.out.println("Enter the first number:");
		// Double is used to hold all types of data
		double num1=sc.nextDouble();
		System.out.println("Enter the second number:");
		double num2=sc.nextDouble();
		
		//Code for Entering operator to perform operation 
		System.out.println("The operator are:\n+ for Addition\n- for Subtraction\n* for Multiplication\n/ for Division");
		System.out.println("Enter an operator from the above:");
		operator = sc.next().charAt(0);
		
		//Performing operations on numbers
	    switch (operator) {
	      // performing addition of two numbers
	      case '+':
	        result = num1+num2;
	        System.out.println("Addition of two numbers "+num1 + " + " + num2 + " = " + result);
	        break;
	      // performs subtraction of two numbers
	      case '-':
	        result = num1-num2;
	        System.out.println("Subtraction of two numbers "+num1 + " - " + num2 + " = " + result);
	        break;
	      // performs multiplication of two numbers
	      case '*':
	        result = num1*num2;
	        System.out.println("Multiplication of two numbers "+num1 + " * " + num2 + " = " + result);
	        break;
	      // performs division of two numbers
	      case '/':
	    	if(num2==0) {
	    	System.out.println("second number is zero so division is not possible");
	    	}
	    	else {
	        result = num1/num2;
	        System.out.println("Division of two numbers "+num1 + " / " + num2 + " = " + result);
	    	}
	        break;
	      default:
	        System.out.println("Invalid operator! Please enter the specified operator");
	        break;
	    }
	    System.out.println("Perform calculation for other numbers");
	}
	
	}

}
