
public class Reversenewconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "i am harish from north chennai";
		String[] a = s.split(" ");
		
		String rev="";
		
		for (int i = a.length-1; i >=0; i--) {
			
			rev= rev+a[i]+" ";
			String Words=rev;
			String rev1="";
			for (int j = Words.length()-1; j>=0; j--) {
				
				rev1=rev1+Words.charAt(j);
				
				
			}
			//System.out.println(rev1);
		}
		
		
	}

}
