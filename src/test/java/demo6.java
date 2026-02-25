import java.util.Iterator;

public class demo6 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1;
		int second =2;
		
	for (int i = 0; i < 5; i++) {
		
		System.out.println(first);
		int third = first+second;
		first=second;
		second=third;
	}

}
}