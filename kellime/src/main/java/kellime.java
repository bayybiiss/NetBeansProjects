import java.util.Random;
import java.util.Scanner;

public class kellime {

	private static final String[] WORDS = { "hat", "cake", "bake", "cat", "mat", "swing", "king" };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean option = true;

		do {
			String guess, choice;

			Random rand = new Random();
			String randomWord = WORDS[rand.nextInt(WORDS.length)];
			int wordLength = randomWord.length();

			System.out.println();
			System.out.println("Welcome to the HANGMAN game!");
			System.out.println("You have 6 guesses to find the secret word");
			System.out.println("Your secret word has " + wordLength + " letters ");

			String blankWord = initWord(randomWord);
			print(blankWord);

			System.out.println();

			for (int i = 0; i < 6; i++) {
				System.out.print("Please enter a letter (lower-case only) : Guess #" + i + ": ");
				guess = input.next();

				int index = randomWord.indexOf(guess);
				if (index != -1) {
					System.out.println("Good guess!");
					blankWord = blankWord.substring(0, index) + guess + blankWord.substring(index + 1);
					print(blankWord);
				} else {
					System.out.println("Bad guess!");
				}

				if (randomWord.equals(blankWord)) {
					System.out.println();
					System.out.println("YOU WON!");
					break;
				}
			}

			System.out.println("The secret word was:" + " " + randomWord);
			System.out.println();

			System.out.print("Play again? (y/n): ");
			choice = input.next();
			if (choice.equals("y")) {
				option = true;
			} else {
				option = false;
				System.out.println("Goodbye!");
			}

		} while (option);
	}

	private static String initWord(String word) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			sb.append("_");
		}
		return sb.toString();
	}

	private static void print(String word) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			sb.append(word.charAt(i)).append(" ");
		}
		System.out.println(sb.toString());
	}
}