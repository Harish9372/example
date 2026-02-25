package JPrograms;

public class FibonacciSerious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int first = 0;
		int second = 1;
		
		
for (int i = 0; i < 5; i++) {
	System.out.println(first);
	//IF WE WANT FIBONACCI OF 5 THEN WE BREAK THE LOOP
//	if(first==5) {
//		break;
//	}
	int third = first+second;
		first=second;
		second=third;
		
		
		
		
	}
	}
}
