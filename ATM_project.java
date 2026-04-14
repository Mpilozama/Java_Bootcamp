import java.util.Scanner;

public class ATM_project {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your bank balance: R");
        double balance = input.nextDouble();
        boolean isRunning = true;
        while (isRunning){
            System.out.println("PLease input a number to select onew of the options: \n 1. Deposit    2. Withdraw \n 3. View balance    4. Exit");
            int user_input = input.nextInt();
            switch (user_input){
                case 1:
                    System.out.println("Enter the amount of money you want to deposit: R");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    break;

                case 2:
                    System.out.println("Enter the amount of money you want to withdraw: R");
                    double withdraw = input.nextDouble();
                    if (withdraw > balance){
                        System.out.println("Insufficient Funds");

                    }else{
                        balance -= withdraw;
                    }
                    break;

                case 3:
                    System.out.printf("Your balance is  R%f", balance);
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");


            }
        }


    }
}
