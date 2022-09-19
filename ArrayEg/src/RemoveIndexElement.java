import java.util.Arrays;
import java.util.Scanner;

public class RemoveIndexElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, index; // i is nothing but row
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		System.out.println("Enter array elements for first array : ");
		int a[] = new int[size];
		for (i = 0; i < size; i++)// storing value of array
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements is=" + Arrays.toString(a));
		System.out.println("\n Enter removable index no.=");
		index = sc.nextInt();
		for (i = index; i < size - 1; i++)// move element to left side one position array
		{
			a[i] = a[i + 1];
		}
		size--;// decrease size of array
		System.out.println(".....New array.....");
		for (i = 0; i < size; i++)
			System.out.print("\t" + a[i]);

	}
}
