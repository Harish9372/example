package JPrograms;

import java.util.Scanner;

public class MultipleOfNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number:  ");
		int num1 = sc.nextInt();
		System.out.println("Enter The Last Number : ");
		int num2 = sc.nextInt();
		
		for(int i = num1 ; i<= num2 ; i++) {
			if(i % 9 == 0) {
				if(i == 9) {
					System.out.println(i);
				}else {
					System.out.println(i + " = 9");
				}
			}
		}

	}

}
