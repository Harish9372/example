package JPrograms;

public class reversemiddleword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hi guys hello buddy";
		String[] words = s.split(" ");
		
		String middleword = words[words.length-2];
		
		
		String rev = "";
		
		for(int i =middleword.length()-1; i >=0 ; i--) {
			
			rev = rev + middleword.charAt(i);
			
			
		}
		words[words.length-2] = rev;
		
		String result ="";
		
		for(int i=0; i <words.length; i++) {
			
			result = result + words[i] +" ";
			
			
		}
		System.out.println(result.trim());
	}
	
	
	

}
