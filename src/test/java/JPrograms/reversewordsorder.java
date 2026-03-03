package JPrograms;

public class reversewordsorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hi guys and buddys";
		String[] words = s.split(" ");
		
		String result ="";
		
		for(int i =words.length-1 ; i>=0; i--) {
			
			result = result +words[i]+" ";
			
			
		}
		System.out.println(result.trim());
	}

}
