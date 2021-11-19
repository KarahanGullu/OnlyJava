package myworks1;
import java.util.Scanner;
public class Hangman {
	public static void main(String[] args) {

		Scanner blc = new Scanner(System.in);
		System.out.print("Enter the Word And Start the Game: ");
		String entered = blc.next();
		entered = entered.toUpperCase();
		String refill ="";
		boolean control = false;
		char snap;

		for (int i = 0; i < entered.length(); i++) {
			refill += "_";
		}
		
		for (int ab = 0; ab < 5; ab++) {
			if (refill.equals(entered)) {
				System.out.println("You Won, Congratulations!! // The Word--> " + refill);
				break;
			}
			System.out.print("-> ( " + refill + " ) <-");
			System.out.println(" (You have " + Math.abs(ab - 5) + " turn!!)");
			snap = blc.next().toUpperCase().charAt(0);

			for (int j = 0; j < entered.length(); j++) {
				if (entered.charAt(j) == snap) {
					control = true;
					refill = refill.substring(0, j) + entered.charAt(j) + refill.substring(j + 1);
				}
			}
			if (control)
				ab--;

			control = false;
		}
			blc.close();
		
		if (!refill.equals(entered)) {
			System.out.println("Hey Hey You Lose! The word was " + entered);
		}
	}
}