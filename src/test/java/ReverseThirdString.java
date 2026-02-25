
public class ReverseThirdString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="hai maala how are you";
		String[] words = s.split(" ");
		
		String Thirdword = words[2];
		String rev ="";
		
		for (int i = Thirdword.length()-1; i>=0 ; i--) {
			
			rev = rev + Thirdword.charAt(i);
		}
		
		System.out.println("given input=== "+ s);
		System.out.println("modified output=== "+ s +" "+ rev );
	}

}
