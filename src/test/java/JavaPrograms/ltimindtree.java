package JavaPrograms;

public class ltimindtree {


    public static void main(String[] args) {

        int n = 10;
        System.out.println("My " + n + "th Fibonacci number is : " + fibonacci(n));
    }

    // Method must be outside main
    public static int fibonacci(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
	}