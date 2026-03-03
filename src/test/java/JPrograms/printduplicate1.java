package JPrograms;

public class printduplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,3,4,3,2,1,4,4,5,6,7,8,};
		
		for (int i=0 ; i <a.length ; i++) {
			
			if(a[i]==-1) {
				
				continue;//skip the function
				
			}
			
			int count =1;
			
		for(int j =i+1 ; j<a.length ;j++) {
			
			if (a[i]==a[j]) {
				
				a[j]=-1;
				count++;
			}
			
			
		}
		
		if (count>1) {
			
			System.out.println(a[i] +  " appears "  + count + " times " );
			//System.out.print(a[i]);
		}
		
		
		}
		
		
	}

}
