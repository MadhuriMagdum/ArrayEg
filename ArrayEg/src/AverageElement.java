import java.util.Arrays;
import java.util.Scanner;

public class AverageElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size=");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Array Element");
		int sum = 0;
		double avg;
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		avg = sum / a.length;
		System.out.println("Array elements is=" + Arrays.toString(a));
		System.out.println("Average of array is =" + avg);

	}

}
