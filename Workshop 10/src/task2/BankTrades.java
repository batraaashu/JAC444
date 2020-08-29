/**********************************************
Workshop #10
Course: JAC444 - Summer 2020
Last Name: Chan
First Name: Daryan
ID: 113973192
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 8/12/2020
**********************************************/

package task2;
import java.util.Scanner;

//this class will prompt user to enter their number of banks and minimum total assets 
public class BankTrades {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("Number of banks: ");
		int n = input.nextInt();
		int [] numOfBanks = new int [n];
		
		//will store the balance for each bank in 2D array
		double[] BankBalances = new double[n];
		double[][] loan = new double[n][n];
		
		System.out.print("Minimum asset of limit: ");
		double limit = input.nextDouble();
		
		for (int i = 0; i < numOfBanks.length; i++) {
			
			System.out.println("For Bank # " + i);
			System.out.print("\tBalance: ");
			BankBalances[i] = input.nextDouble();

			System.out.print("\tNumber of banks Loaned: ");
			int numbOfBorrowers = input.nextInt();
			for (int j = 0; j < numbOfBorrowers; j++) {
				
				//Bank m borrows from bank i
				System.out.print("\t\tBank ID who gets the loan: ");
				int m = input.nextInt();
				//Loan amount of Bank k borrowing from bank i
				System.out.print("\t\tLoaned Amount: ");
				loan[i][m]= input.nextDouble();			
			}			
		}
		
		double[] asset = new double[n];		
		boolean[] isSafe = new boolean[n];
		for(int i = 0; i < n; i++) {
			isSafe[i] = true;   //initialize to true
		}

		System.out.print("\nUnsafe banks are ");
		boolean newNotSafeFound = true;
		while(newNotSafeFound) {
			newNotSafeFound = false;
				
			for (int i = 0; i < numOfBanks.length; i++) {				
				asset[i] = BankBalances[i];

				for (int j = 0; j < numOfBanks.length; j++) { 
					//Add the loan amount to the total asset of the bank
					asset[i] += loan[i][j];
				}
					
				//If banks asset is less than safe limit, newNotSafeFound will be set as "True".
				if(isSafe[i] && asset[i] < limit) {
					isSafe[i] = false;
					newNotSafeFound = true;
					System.out.print("Bank " + i + " ");
								
					//Remove the unsafe bank from the list and set borrower as 0.
					for(int m = 0; m < numOfBanks.length; m++) {
						loan[m][i] = 0;
					}						
				}				
			}
		}			
	}		
}

