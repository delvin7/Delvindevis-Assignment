
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121, t = n, r = 0;
		while (t != 0) {
		    r = r * 10 + t % 10;
		    t /= 10;
		}
		System.out.println(n == r ? "Palindrome" : "Not Palindrome");


	}

}
