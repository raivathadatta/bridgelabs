package day6;

import java.util.Scanner;

public class VendingMachineCalculator {
	static int i=0, total = 0;
	public static int getRupeeNotesCount(int amount, int[] notes) {
		int remainder = 0;
		if(amount == 0) {
			AmountValidator amountvalidaator = new AmountValidator();
			//return 0;
			String validate = amountvalidaator.validateAmount(amount);
			System.out.println("validation = "+validate);
		}
		else {
			if(amount >= notes[i]) {
				int calculateNotes = amount / notes[i];
				remainder = amount % notes[i];
				amount = remainder;
				total += calculateNotes;
				System.out.println(notes[i] + ".Rs notes "+calculateNotes);
				
			}
		}
		i++;
		return getRupeeNotesCount(amount, notes);
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount : ");
		int amount = scanner.nextInt();
		int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1 };
		getRupeeNotesCount(amount, notes);
		
	
		
	}}
