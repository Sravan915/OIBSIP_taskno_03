import java.util.Scanner;
public class Task3
{
    public static void main(String args[] )
    {
        int Balance = 91500, Withdraw, Deposit;
        Scanner sc = new Scanner(System.in);
        String ID="VS" , pin="9152";

        System.out.println("Enter your ATM pin: ");
        String in=sc.nextLine();

        if(in.equals(pin))
        {
            while(true)
            {
                System.out.println("Welcome to the ATM");
                System.out.println("1.Withdraw");
                System.out.println("2.Deposit");
                System.out.println("3.For Bank Transfer");
                System.out.println("4.To Check Balance");
                System.out.println("5.For EXIT");
                System.out.print("Choose an operation you want to perform:\n");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        Withdraw = sc.nextInt();
                        if(Balance >= Withdraw)
                        {
                            Balance = Balance - Withdraw;
                            System.out.println("Please collect your money");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        Deposit = sc.nextInt();
                        Balance = Balance + Deposit;  
                        System.out.println("Your Money has been successfully depsited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Amount based transaction.");
                        System.out.print("Enter amount:");
                        int Amount = sc.nextInt();
                        if(Amount>Balance)
                        {
                            System.out.print("Sufficient amount not available.");
                        }
                        else
                        {
                            System.out.print("Transaction Successfull.\n");
                            Balance=Balance - Amount;
                        }
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Balance : "+Balance);
                        System.out.println("");
                        break;

                    case 5:
                        System.out.println("Thank You!!.");
                        System.exit(0);

                }  
            }
        }
    }  
}  