import java.util.Arrays;
import java.util.Scanner;

public class AscendDesendArray {

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

		// sort by Ascending order
		int temp;
		for (int i = 0; i < size; i++)
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		System.out.println("After sorting ascending order=" + Arrays.toString(a));

		// sort by descending order
		for (int i = 0; i < size; i++)
			for (int j = i + 1; j < size; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		System.out.println("After sorting descending order=" + Arrays.toString(a));
	}

}
