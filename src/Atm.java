import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int right = 3, balance = 1500;
        boolean isTrue = false;
        while (!isTrue && right > 0) {
            System.out.println("Enter your SSN");
            int isn = scan.nextInt();
            System.out.println("Enter your PIN");
            int pin = scan.nextInt();
            if (isn == 101010101 && pin == 123123) {
                isTrue = !isTrue;
                System.out.println("You've successfully logged-in");
                System.out.println("Chose what you want to do");
                System.out.println("1-> Withdrawal\n2-> Deposit\n3-> Show Balance\n4-> Exit");
                int operationType = scan.nextInt();
                System.out.println(operationType);
                switch (operationType) {
                    case 1:
                        System.out.println("Enter amount");
                        int withdrawal = scan.nextInt();
                        if (withdrawal <= balance)
                            balance -= withdrawal;
                        else
                            System.out.println("Insufficient balance.");
                        break;
                    case 2:
                        System.out.println("How much money will you deposit?");
                        int deposit = scan.nextInt();
                        System.out.println("Insert your money.");
                        try { //from this column;
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            System.out.println("Thread is interrupted");
                        }// to this column...
                        //this code part is adding delay to code.
                        System.out.println("This may take a little time...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Thread is interrupted");
                        }
                        System.out.println("Your process is in progress...");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            System.out.println("Thread is interrupted");
                        }
                        balance += deposit;
                        System.out.println("Your new balance: " + balance + "$");
                        break;
                    case 3:
                        System.out.println("Your balance: " + balance + "$");
                        break;
                    case 4:
                        System.out.println("See you later");
                        break;
                }

            } else {
                right--;
                System.out.println("Wrong SSN or PIN! Please check your credentials.");
                try { //from this column;
                    Thread.sleep(1000);
                    System.out.println("Remaining rights to login:" + right);
                } catch (InterruptedException e) {
                    System.out.println("Thread is interrupted");
                }
                    if (right == 0) {
                        try {
                            Thread.sleep(1000);
                            System.out.println("...");
                            Thread.sleep(2000);
                            System.out.println("...");
                        } catch (InterruptedException e) {
                            System.out.println("Thread is interrupted");
                        }
                        System.out.println("Your account has been suspended. Please call your bank.");
                        try {
                            Thread.sleep(1500);
                            System.out.println("GSM: +1 429 874 2114");
                        } catch (InterruptedException e) {
                            System.out.println("Thread is interrupted");
                        }
                    }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread is interrupted");
                }
             }
            }
        }
}
