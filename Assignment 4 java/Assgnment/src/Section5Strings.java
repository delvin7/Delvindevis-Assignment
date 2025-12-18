
public class Section5Strings {
	public static void main(String[] args) {
		
	
	String s = "Java";
	for (int i = s.length() - 1; i >= 0; i--)
	    System.out.print(s.charAt(i));
	System.out.println();
	
	String k = "madam", r = "";
	for (int i = k.length() - 1; i >= 0; i--)
	    r += k.charAt(i);
	System.out.println(s.equals(r) ? "Palindrome" : "Not");



}
}
