import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElement {
	public static void removeDupli() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Enter Array size=");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Array 1st Element");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements is=" + Arrays.toString(a));
		System.out.println("\n");
		int b[] = new int[a.length];// storing in new array

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp++;
				}
			}
			if (temp == 0) {
				b[k] = a[i];
				k++;
			}

		}
		int c[] = new int[k];
		for (int i = 0; i < c.length; i++)
			c[i] = b[i];
		System.out.println("After removing duplicate element=" + Arrays.toString(c));
	}

	public static void main(String[] args) {
		removeDupli();
	}
}
