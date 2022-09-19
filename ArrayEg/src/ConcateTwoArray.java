import java.util.Arrays;
import java.util.Scanner;

public class ConcateTwoArray {
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

		int concate[] = new int[a.length + b.length];
		int index = 0;
		for (int i : a) {
			concate[index++] = i;
		}
		for (int i : b) {
			concate[index++] = i;
		}
		System.out.println("Addition of two Arrays=" + Arrays.toString(concate));
	}
}
