import java.util.Arrays;
import java.util.Scanner;

public class EqualArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int z = 0;
		System.out.println("Enter size of first array : ");
		int m = sc.nextInt();// m is 1st array size
		System.out.println("Enter array elements for first array : ");
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements is=" + Arrays.toString(a));
		System.out.println("Enter size of second array : ");
		int n = sc.nextInt();// n is 2nd array size
		if (m == n) {

			System.out.println("Enter array elements for second array : ");
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			System.out.println("Array elements is=" + Arrays.toString(b));
			if (a.length == b.length) {
				for (int i = 0; i < b.length; i++) {
					if (a[i] != b[i]) {
						System.out.println("Not Equal");
						z++;
					}
				}
				if (z == 0)
					System.out.println("Equals");
			}
		} else
			System.out.println("Size not Same");
	}

}
