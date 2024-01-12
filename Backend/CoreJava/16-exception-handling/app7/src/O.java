import java.util.Scanner;
public class O 
	{
		public static void main(String[] args) 
		{
        System.out.println("Welcome to your Account");
        System.out.println("Your Balance is 10,000.0 Rupees");
        System.out.println("Enter the amount to be withdrawn");

        Scanner sc = new Scanner(System.in);
        double balance = 10000.0; // Initial balance

        do {
            double withdrawalAmount = sc.nextDouble();

            if (withdrawalAmount <= 0) {
                System.out.println("Invalid! Please enter a valid amount to be withdrawn");
            } else if (withdrawalAmount > balance) {
                try {
                    throw new InsufficientBalanceException("Your balance is 10,000 only!");
                } catch (InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                    continue; // Continue the loop to allow the user to enter a valid amount
                }
            } else {
                // Update the balance after successful withdrawal
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance + " Rupees");
            }

            System.out.println("Do you want to make another withdrawal? (yes/no)");
        } while (sc.next().equalsIgnoreCase("y"));

        System.out.println("Thank you");
    }
}