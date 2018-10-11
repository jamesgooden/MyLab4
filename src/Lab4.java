import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		int userInteger;
		String userInput;

		System.out.println("Learn your squares and cubes! ");
		System.out.println("Hi ,whats your name? ");
		userName = scan.next();
		System.out.println("Nice to meet you " + userName);
		do {
			System.out.println("Please enter a integer between 1 and 100");
			userInteger = scan.nextInt();

			if (userInteger > 0 && userInteger <= 100) {
				System.out.println("Number       Squared       Cubed ");
				System.out.println("=======      ======        =====");
				for (int i = 1; i <= userInteger; i++) {
					System.out.printf("%-10d%10d%20d%n", i, i * i, i * i * i);

				}
			}

			else {
				System.out.println("Pleaser enter valid number between 1 and 100");
			}
			System.out.println("Press Y to continue press any other key to end ");
			userInput = scan.next();
		} while (userInput.equalsIgnoreCase("Y"));
		scan.close();
	}

}
