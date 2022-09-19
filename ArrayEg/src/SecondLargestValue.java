import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestValue {

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
		
		//second largest value
		int secondlarge;
		secondlarge=a[a.length-2];
		System.out.println("second Largest value of Array="+ secondlarge);
		
	}

}
