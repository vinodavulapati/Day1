package vinod_day1;

// Palindrome for Integers Using Modular  % method (Mathematical Procedure)

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String args[]) {
		int r, sum = 0, temp;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a  number to check if it is a palindrome");
		int n = in.nextInt();

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
		in.close();

	}
}
