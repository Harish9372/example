package JavaPrograms;

import java.util.Scanner;

public class PrinciplrAmountAndIntrestAmount {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PRINCIPLE AMOUNT");
		double p = sc.nextDouble();
		
		
		System.out.println("INTREST AMOUNT");
		double i = sc.nextDouble();
		
		System.out.println("TIME OF AN AMOUNT");
		double t = sc.nextDouble();
		
		double SI = (p*i*t)/100;    //--->SIMPLE INTREST OF AN AMOUNT
		double Total = p+SI;
		
		System.out.println("SIMPLE INTREST IS :"+ SI);
		System.out.println("TOTAL AMOUNT WITH INTREST :"+Total);
	}
}
