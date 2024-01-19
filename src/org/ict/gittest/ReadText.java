package org.ict.gittest;

/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class ReadText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.println("Please enter your message.");
		String text = sc.nextLine();
		System.out.println("The user's message is "+text);
		sc.close();
		System.out.println("Please enter your fav number");
		int num1 = sc.nextInt();
		System.out.println("The user's fav number is "+num1);
	}

}

