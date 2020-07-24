package com.ruthvika.epamproj;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b) {

			System.out.println("Enter the X and Y:");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			System.out.println("Select required operation: ");
			System.out.println("Operations which you can perform on calculator are:");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBTRACT");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			char ch = sc.next().charAt(0);
			double result = 0;
			char s;
				Calculator cal = new Calculator();
				switch(ch) {
					case '1':
						result = cal.add(x,y);
						System.out.println("Sum = " +result);
						break;
					case '2':
					    result = cal.subtract(x, y);
						System.out.println("Difference = " +result);
						break;
					case '3':
					    result = cal.multiply(x, y);
						System.out.println("Product = " +result);
						break;
					case '4':
					    result = cal.divide(x, y);
						System.out.println("Division = " +result);
						break;
					default:
						System.out.println("Enter vaild number");
						break;
						
				}
				System.out.println("Do you want to perform any other operation(Y/N)");
						s = sc.next().charAt(0);
						if(s == 'Y' || s == 'y') {
							b = true;
						} else {
							b = false;
							System.out.println("Thankyou for using calculator");
							sc.close();
							System.exit(0);
						}
			}
    }
}