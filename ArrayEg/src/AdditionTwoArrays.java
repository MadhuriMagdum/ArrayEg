import java.util.Arrays;
import java.util.Scanner;

public class AdditionTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size=");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Array 1st Element");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements is=" + Arrays.toString(a));
		int b[] = new int[size];
		System.out.println("Enter Array 2nd Element");
		for (int i = 0; i < size; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Array elements is=" + Arrays.toString(b));

		// additon of two arrays
		int addition[] = new int[size];
		for (int i = 0; i < size; i++) {
			addition[i] = a[i] + b[i];
		}

		System.out.println("Addition of two Arrays=" + Arrays.toString(addition));
	}
}
