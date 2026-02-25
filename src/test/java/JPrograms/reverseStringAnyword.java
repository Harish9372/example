package JPrograms;

public class reverseStringAnyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to Capgemini interview";
		String [] words = s.split(" ");
		
		String Firstword = words[0];
		String rev= "";
		
		for (int i = Firstword.length()-1; i>=0; i--) {
			
			rev =rev+Firstword.charAt(i);
			
			
		}
		
		words[0]=rev;
		
		String result = String.join(" ", words);
		
		System.out.println(result);
	}

}
