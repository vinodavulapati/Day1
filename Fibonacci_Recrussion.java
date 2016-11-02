package vinod_day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci_Recrussion {

	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String args[]) {

		int count = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Fibonaci Series Range to Print");
		try {
			count = in.nextInt();

		} catch (InputMismatchException e) {

			System.out.println("Exception Caught" + e);
		}

		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibonacci(count - 2);// n-2 because 2 numbers are already printed
		in.close();
	}
}
