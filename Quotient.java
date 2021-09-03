package Basicprogram;
import java.util.Scanner;
public class Quotientproblem {
	public static void main(String[] args) {

	    // Get Divend and Divisor input from user
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Divedend");
	    int dividend=sc.nextInt();

	    System.out.println("Enter the Divisor");
	    int divisor=sc.nextInt();

	    // Computing Process

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	  }
	}

