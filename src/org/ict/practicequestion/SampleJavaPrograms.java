/**
 * 
 */
package org.ict.practicequestion;

import java.util.Scanner;

/**
 * 
 */
public class SampleJavaPrograms {

	/**
	 * @param args
	 */
	
	public double  simpleInterest() {
		double principal, rate ,time, s_int, amount;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a Principal amount : ");
     	principal = sc.nextDouble();
     	System.out.println("Enter an Interest rate : ");
     	rate = sc.nextDouble();
     	System.out.println("Enter a Time period in years : ");       
        time = sc.nextDouble();
		s_int = (principal * rate * time) / 100;
		amount = principal+s_int;
		System.out.println("Simple Interest :"+s_int);
		System.out.println("Amount :"+amount);
		sc.close();
		return 0;
	}
	public double  compoundInterest() {
		double principal, rate ,time, c_int, amount;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a Principal amount : ");
     	principal = sc.nextDouble();
     	System.out.println("Enter an Interest rate : ");
     	rate = sc.nextDouble();
     	System.out.println("Enter a Time period in years : ");       
        time = sc.nextDouble();
        amount = principal * (Math.pow((1+ rate/100), time)) ; 
		c_int= amount-principal;
		System.out.println("Compound Interest :"+c_int);
		System.out.println("Amount :"+amount);
		sc.close();
		return 0;
	}
	public double retanglePerimeter () {
		double length, width, perimeter;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter length of the rectangle: ");
     	length = sc.nextDouble();
     	System.out.println("Enter width of the rectangle: ");
     	width = sc.nextDouble();
     	perimeter = 2* (length+width);
		System.out.println("Perimeter of a rectangle :"+perimeter);
		sc.close();
		return 0;
	}
	public int swapping () {
		int num1, num2, temp =0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter  first number: ");
     	num1 = sc.nextInt();
     	System.out.println("Enter second number: ");
     	num2 = sc.nextInt();
     	temp = num1;
     	num1 = num2;
     	num2 = temp;     	
		System.out.println("After swapping num1 :"+num1 +" ,num2 :"+num2);
		sc.close();
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleJavaPrograms sjp =new SampleJavaPrograms();
     	Scanner sc = new Scanner(System.in);
     	System.out.println("1.Simple Interest 2.Compound Interest 3. Rectangle Perimeter  4. swapping");
		int opt = sc.nextInt();
		if(opt == 1) {
			sjp.simpleInterest();
		}
		if(opt == 2) {
			sjp.compoundInterest();
		}
		if(opt == 3) {
			sjp.retanglePerimeter();}
		if(opt == 4) {
			sjp.swapping();}
		sc.close();
	}


}
