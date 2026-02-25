
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "capegemini";// PRINT THE DUPLICATE 
		
		char[] k = s.toCharArray();
	
		
		for (int i = 0; i < k.length; i++) {
			
			if(k[i]=='0') {
				continue;// SKIP THE REST OF THE CODE
			}
			
			for (int j = i+1; j < k.length; j++) {
				
				if (k[i]==k[j]) {
					
					System.out.println(k[i]);
					k[j]='0';
					break;
					
					
					
					
				}
				
			}
		
		}

	}

}
