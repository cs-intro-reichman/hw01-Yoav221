import java.util.concurrent.ThreadLocalRandom;;

public class GenThree {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);

		int b = Integer.parseInt(args[1]);

		int random_int_1 = ThreadLocalRandom.current().nextInt(a, b);
		int random_int_2 = ThreadLocalRandom.current().nextInt(a, b);
		int random_int_3 = ThreadLocalRandom.current().nextInt(a, b);

		System.out.println(random_int_1);
		System.out.println(random_int_2);
		System.out.println(random_int_3);

		System.out.println(Math.min(Math.min(random_int_1, random_int_2), random_int_3));

	}
}
