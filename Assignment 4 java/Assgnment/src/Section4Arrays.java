
public class Section4Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		for (int i : a) 
			System.out.print(i + " ");
		System.out.println();
		
		
		int max = a[0], min = a[0];
		for (int i : a) {
		    if (i > max) max = i;
		    if (i < min) min = i;
		}
		
		
		for (int i = a.length - 1; i >= 0; i--)
		    System.out.print(a[i] + " ");




	}

}
