package PairImper;
import java.util.Scanner;

public class PairImper {

	private static Scanner scanner = new Scanner (System.in);
	public static void main(String args []) {
		
		System.out.print("Entrez un nombre entier:");
		int number = scanner.nextInt();
		
		if (number == 0) {
			System.out.println ("Le nombre est zéro, il est pair ");
		}else {
			if (number < 0) {
				System.out.println("Le nombre est négatif ");
			}else {
				System.out.println("Le nombre est positif ");
				
			}
			int reste = number % 2;
			if (reste == 0) {
				System.out.println("et pair");
			} else {
				System.out.println("et impair");
				
			}
		}
		
		
	}
	
}
