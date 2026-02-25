package LaunchBrowsers;

public class justfortry {
	
	
	public static int fact(int num) {
		
		if(num<=0) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int fact = fact(n);
		System.out.println(fact);
	}

}
