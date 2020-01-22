package main.java.com.assignment;

import java.util.Scanner;

public class App {
	
	Scanner sc = new Scanner(System.in);
	String selection;
	double f;
	double c;
	public void ConvertTemp() {
		System.out.println("Convert to farenheit or celcius");
		selection = sc.nextLine().toLowerCase();
		if(selection.equalsIgnoreCase("celcius")) {
			System.out.println("Enter farenheit");
			f = sc.nextDouble();
			c = (5.0/9.0)*(f-32);
			System.out.println("Temp in celcius is " + c);
		}else {
			System.out.println("Enter Celcius");
			c = sc.nextDouble();
			f = c*(9.0/5.0)+32;
			System.out.println("Temp in Farenheit is " + f);
		}
		
	}
}
