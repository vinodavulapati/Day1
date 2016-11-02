package vinod_day1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci_Nonrecrussion {

	public static void main(String args[]) {
		int n1 = 0, n2 = 1, n3, i, count = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Fibonaci Series Range to Print");
		try {
			count = in.nextInt();

		} catch (InputMismatchException e) {

			System.out.println("Exception Caught" + e);
		}

		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		in.close();

	}
}
