
public class Section6 {
	static void check(int n) {
	    System.out.println(n % 2 == 0 ? "Even" : "Odd");
	    
	}
	static int fact(int n) {
	    int f = 1;
	    for (int i = 1; i <= n; i++) f *= i;
	    return f;
	}
	
	static boolean isPrime(int n) {
	    int c = 0;
	    for (int i = 1; i <= n; i++)
	        if (n % i == 0) c++;
	    return c == 2;
	}
	
	static int max(int a, int b) {
	    return a > b ? a : b;
	}
	
	static double simpleInterest(int p, int t, double r) {
	    return (p * t * r) / 100;
	}






	public static void main(String[] args) {
		check(3);


        System.out.println("Factorial = " + fact(4));

        System.out.println("Is Prime = " + isPrime(121));

        System.out.println("Maximum = " + max(2, 3));

        System.out.println("Simple Interest = " + simpleInterest(2, 4, 5));
		
		
		
		

	}

}
