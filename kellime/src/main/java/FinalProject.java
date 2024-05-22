import java.util.Random;
import java.util.Scanner;

public class FinalProject {

	private static final String[] KELİMELER = { "bilgisayar", "programlama", "insan", "bal", "kedi", "ders", "esma" };

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		boolean option = true;

		do {
			String harf, choice;

			Random rand = new Random();
			String randomKelime = KELİMELER[rand.nextInt(KELİMELER.length)];
			int wordLength = randomKelime.length();

			System.out.println();
			

			String blankWord = initWord(randomKelime);
			print(blankWord);

			System.out.println();

			for (int i = 0; i < 6; i++) {
				System.out.print("Kelimeden bir harf giriniz" + i + ": ");
				harf = klavye.next();

				int index = randomKelime.indexOf(harf);
				if (index != -1) {
					System.out.println("Good guess!");
					blankWord = blankWord.substring(0, index) + harf + blankWord.substring(harf + 1);
					print(blankWord);
				} else {
					System.out.println("Bad guess!");
				}

				if (randomKelime.equals(blankWord)) {
					System.out.println();
					System.out.println("YOU WON!");
					break;
				}
			}

			System.out.println("The secret word was:" + " " + randomKelime);
			System.out.println();

			System.out.print("Play again? (y/n): ");
			choice = klavye.next();
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