import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    private final HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() {
        boolean flag = true;
        do {
            try {
                data.put(937732, 917168);
                data.put(938229, 837823);
                System.out.println("Welcome to Deepesh's ATM");
                System.out.println("Enter your customer number: ");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your pin number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("""
     
                        Invalid character(s). Only Numbers.
                        """);
                flag = false;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) getAccountType();
            else System.out.println("""
                    
                    Wrong Customer number or pin number
                    """);
        } while (flag);
    }

    public void getAccountType() {
        System.out.println("Select the Account type you want to access");
        System.out.println("Type 1 - Checking account");
        System.out.println("Type 2 - Savings account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;

            case 2:
                getSavings();
                break;

            case 3:
                System.out.println("Thank you for using this ATM, Bye.👋\n");
                break;

            default:
                System.out.println("""
                        Invalid choice
                        """);
                getAccountType();
        }
    }

    private void getSavings() {
        System.out.println("Savings Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM, Bye.👋\n");
                break;

            default:
                System.out.println("""
                        Invalid Choice
                        """);
                getSavings();
        }
    }

    private void getChecking() {
        System.out.println("Checking Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM, Bye.👋\n");
                break;

            default:
                System.out.println("""
                        Invalid Choice
                        """);
                getChecking();
        }
    }
}
