package JPrograms;

public class printDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[]  a = {1,2,3,1,2,4,5,6,4};

		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==-1) {
				
				continue;//SKIP ELEMENTS ALREADY MARKED AS DUPLICATES
			}
			//RESET COUNT FOR EACH ELEMENT
			int count = 1;
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					
					a[j] = -1;
					count++;
					
					
				}
				
				
			}
			if(count>1) {
				
				System.out.println(a[i] +  " appears " + count + " times ");
			}
		}
		
		
	}

}
