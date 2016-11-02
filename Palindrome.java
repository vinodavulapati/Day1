package vinod_day1;

// Palindrome Using String Properties can handle both Integers and	 Strings 
//														212    and	 A m m A

import java.util.*;

class Palindrome {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();

		int length = original.length();

		if (length == 0) {
			System.out.println("you didnt entered any thing:");
			System.exit(0);
		} else {
			for (int i = length - 1; i >= 0; i--)
				reverse = reverse + original.charAt(i);

			if (original.equals(reverse))
				System.out.println("Entered string is a palindrome.");
			else
				System.out.println("Entered string is not a palindrome.");
		}
		in.close();
	}
}
