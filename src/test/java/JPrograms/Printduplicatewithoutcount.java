package JPrograms;

public class Printduplicatewithoutcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[]  a = {1,2,3,1,1,2,2,2,4,5,6,4};
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==-1) {
				
				continue;//IT MEANS MARKES AS ALREADY DUPLICATE
			}
		     
			boolean isduplicate = false;
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					
				    a[j]=-1;
				   isduplicate=true;
					
							}
				
				
			}
			if (isduplicate) {
				System.out.print(a[i]);
			}
		
		}
		

	}

}
