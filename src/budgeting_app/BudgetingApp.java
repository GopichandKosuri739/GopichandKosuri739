package budgeting_app;

import java.util.Scanner;
import java.util.ArrayList;

public class BudgetingApp {
	static ArrayList<Expense> expenses = new ArrayList<Expense>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Expense");
			System.out.println("2. View Expense");
			System.out.println("3. Quit");
			System.out.println("Enter the choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if (choice == 1) {
				addExpense();
			} else if (choice == 2) {
				viewExpenses();
			}else if (choice == 3) {
				break;
			}else {
				System.out.println("Invalid Choice");
			}
			
		}
		
			sc.close();
	}

	static void addExpense() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Description: ");
		String description = sc.nextLine();
		
		System.out.print("Enter the amount: ");
		double amount = sc.nextDouble();
		
		expenses.add(new Expense(description, amount));
		
		System.out.println("Expenses added");
	}

	static void viewExpenses() {
		double total = 0;

		for (Expense expense : expenses) {
			System.out.println(expense.description + ":$" + expense.amount);
			total += expense.amount;
		}
		System.out.println("Total: $" + total);
	}

}
