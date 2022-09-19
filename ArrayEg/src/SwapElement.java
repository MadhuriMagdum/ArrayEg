import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array size=");
		int size=sc.nextInt();
		 int a []=new int [size];
		 System.out.println("Enter Array Element");
		 for(int i =0;i<size;i++)
		 {
			 a[i]=sc.nextInt();
		 }
			System.out.println("Array elements is="+Arrays.toString(a));
			System.out.println("Enter any two index for swap=");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			 int temp=0;
			 temp=a[num1];
			 a[num1]=a[num2];
			 a[num2]=temp;
			
			System.out.println(Arrays.toString(a));
	}

}
