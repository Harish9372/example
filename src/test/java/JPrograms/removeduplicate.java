package JPrograms;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n = {1,2,3,2,4,5,6,3,1};
		
		for (int i = 0; i < n.length; i++) {
	
	
			
			for (int j = i+1; j < n.length; j++) {
				
				if(n[i]==n[j]) {
					
					n[j] = -1;
					
				}
			
			}
			if(n[i]!=-1) {
			System.out.print(n[i]+" ");
		}
		}
	}

}
