 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(final String[] args) {

		final Scanner input = new Scanner(System.in);
		int n = 0;
		System.out.println("Hello Software Engineering World");
		System.out.println("Input your number and press enter: ");
		n = input.nextInt();
		System.out.print("Reverse of the input number is:");
		reverseMethod(n);
		System.out.println();

	}

	// This is a method to reverse the number by recursion
	public static void reverseMethod(final int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }
				   
	   //    add your test method in this space then remove the block comment symbols
	       
}
	 
	   


