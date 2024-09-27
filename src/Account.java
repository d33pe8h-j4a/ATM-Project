import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    Scanner scn = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void calcCheckingWithdraw(double amount) {
        checkingBalance -= amount;
    }

    public void calcCheckingDeposit(double amount) {
        checkingBalance += amount;
    }

    public void calcSavingWithdraw(double amount) {
        savingBalance -= amount;
    }

    public void calcSavingDeposit(double amount) {
        savingBalance += amount;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking amount balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw: ");
        double amount = scn.nextDouble();

        if (checkingBalance - amount >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New checking account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving amount balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw: ");
        double amount = scn.nextDouble();

        if (savingBalance - amount >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New saving account balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking amount balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit: ");
        double amount = scn.nextDouble();

        if (checkingBalance + amount >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New checking account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getSavingDepositInput() {
        System.out.println("Saving amount balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit: ");
        double amount = scn.nextDouble();

        if (savingBalance - amount >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New saving account balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }


}
