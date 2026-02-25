import java.util.ArrayList;
import java.util.List;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array1={1,2,3,4,5};
		int[] array2 ={2,3,4,5,6};
		  
		List<Integer> common = new ArrayList<Integer>();
		
		for (int i = 0; i < array1.length; i++) {
			 
			 int count =0;
			
			for (int j = 0; j < array2.length; j++) {
				
				if(array1[i]==array2[j]) {
					if(!common.contains(array1[i])) {
						
						common.add(array1[i]);
					}
					
					
				}
			}
			
		}
	
    System.out.println(common);
	
        
	}
	}

