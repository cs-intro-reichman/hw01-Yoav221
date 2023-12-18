
/*
 * Adds two given integers and prints the result in a fancy way.
 */
import java.util.Scanner;

public class AddTwo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("First integer: ");
		int first_int = scanner.nextInt();

		System.out.println("Second integer: ");
		int second_int = scanner.nextInt();

		int sum = first_int + second_int;

		System.out.println("The sum is: " + sum);

	}
}
