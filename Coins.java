
/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
import java.util.Scanner;

public class Coins {
	public static void main(String[] args) {
		try (// Put your code here
				Scanner scanner = new Scanner(System.in)) {
			System.out.println("Quantity of cents: ");
			int cents = scanner.nextInt();

			int quarters = cents / 25;
			int reminder = cents % 25;

			System.out.println("Quarters: " + quarters);
			System.out.println("Reminder in cents: " + reminder);

		}

	}
}