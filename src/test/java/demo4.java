
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String a = "successful";
		char[] input =a.toCharArray();
		
		for (int i = 0; i <input.length; i++) {
			
			if(input[i] == '0') { 												
				
				continue;//IT MEANS SKIP THE REST OF CODE(REMAIN UNDER ALL CODES NOT WORKS DIRECTLY SWITH TO ANOTHER I-VALUE)
			}
			
			int count = 1;
			
			for (int j = i+1; j < input.length; j++) {
				
				if(input[i]==input[j]) {
					
					count++;
					input[j]='0';
					
				}
				
			}
			
			
				
				System.out.println(input[i] + " occurs "+ count + " times ");
			}
		}
		
		
	}


