
public class Section2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		if (n > 0) System.out.println("Positive");
		else if (n < 0) System.out.println("Negative");
		else System.out.println("Zero");
		
		
		if (n % 2 == 0) System.out.println("Even");
		else System.out.println("Odd");
		
		
		int y = 2024;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		    System.out.println("Leap Year");
		else
		    System.out.println("Not Leap Year");
		
		
		int a = 10, b = 20, c = 15;
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Largest = " + max);
		
		int m = 78;
		if (m >= 90) System.out.println("A");
		else if (m >= 75) System.out.println("B");
		else if (m >= 60) System.out.println("C");
		else System.out.println("Fail");






	}

}
