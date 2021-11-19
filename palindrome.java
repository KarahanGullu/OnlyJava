package myworks1;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner blc = new Scanner(System.in);
		System.out.print(" Please Enter A Number Or A Word: ");
		String entry = blc.next();
		String ne = "";	
				
		for(int i = (entry.length()- 1); i>=0;i--) {
			ne += entry.charAt(i);
		}
		if(ne.equals(entry)) {
			System.out.println(" The World Is Palindrome. ");
		}
		else {
			System.out.println(" The World Isn't Palindrome. ");
			
		}
	}	
	
}

				

