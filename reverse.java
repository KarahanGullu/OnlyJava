package myworks1;

import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner blc = new Scanner(System.in);
		System.out.print("Please Enter A Number Or A Word: ");
		String entry = blc.nextLine();
		String ne = "";	
				
		for(int a = (entry.length()- 1); a >= 0; a--) {
			ne += entry.charAt(a);
		}
		
		System.out.print( "Entered: " +entry + " // " +"Reverse: " +ne);
		
		
	}	
	
}