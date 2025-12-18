
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7, c = 0;
		for (int i = 1; i <= n; i++)
		    if (n % i == 0) c++;
		System.out.println(c == 2 ? "Prime" : "Not Prime");


	}

}
