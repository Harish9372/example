
public class LongestWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String input = "apple an a doctor keeps away"; // You can change this line to any sentence
		 String[] words = input.split(" ");
	     
	  
	     int maxlength = 0;
	     String longestword ="";
	     
	     for (String word : words) {
			
	    	 if(word.length()>maxlength) {
	    		 
	    		 maxlength=word.length();
	    		 longestword=word;
	    		 
	    	 }
		}
		
			
			
		
		
		System.out.println(" longest word is "+longestword);
		System.out.println(" maximun length is "+maxlength);
	
		
		
		
		
}

}


