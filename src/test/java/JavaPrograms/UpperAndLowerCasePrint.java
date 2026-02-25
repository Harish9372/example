package JavaPrograms;

import java.util.Iterator;

public class UpperAndLowerCasePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome To JAva";
		
		int Upper= 0;
		int Lower= 0;
		int count  = 0;
	for (int i = 0; i < s.length(); i++) {
		
		char ch = s.charAt(i);
		if (ch>='A' && ch<= 'Z') {
			Upper++;
		}
		else {
			
			Lower++;
		}
	
		
	}
	System.out.println(Upper);
	System.out.println(Lower);
		
	}

}
