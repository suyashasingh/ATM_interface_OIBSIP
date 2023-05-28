import java.util.Scanner;


public class ATMSystem {
    private static final String USER_ID = "123";
    private static final String USER_PIN = "123";
    private static final double INITIAL_BALANCE = 10000.0;

    private double balance;

    public ATMSystem() {
        balance = INITIAL_BALANCE;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter user id: ");
        String userId = scanner.nextLine();

        System.out.print("Enter user pin: ");
        String userPin = scanner.nextLine();


        if (!userId.equals(USER_ID) || !userPin.equals(USER_PIN)) {
            System.out.println("Invalid user id or user pin");
            return;
        }

        System.out.println("Welcome to the ATM system");

        
        while (true) {
            System.out.println("Choose an option:");
			 System.out.println();
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
			
			 System.out.print("option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showTransactionsHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM system");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void showTransactionsHistory() {
        System.out.println("Transaction history:");
        
    }

    private void withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal successful");
    }

    private void deposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful");
    }

    private void transfer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter recipient's account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
        System.out.println("Transfer successful");
    }

public static void main(String[] args) {
    ATMSystem atmSystem = new ATMSystem();
    atmSystem.run();
}
}