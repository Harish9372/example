package JavaPrograms;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String s = "kurkruk";
		String rev = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		
		if (s.equals(rev)) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		System.out.print(rev);
	}
}
