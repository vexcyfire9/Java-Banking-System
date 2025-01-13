import java.util.Scanner;

public class Banking
{
	public static void main(String[] args)
	{
		String password = "Jam";
		String Username = "Peanut";

	 	double deposit = 0;
	 	double withdraw = 0;
	 	double balance = 0;

		Login(password, Username, withdraw, deposit, balance);
	}
	public static void Login(String password, String Username, double withdraw, double deposit, double balance)
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, User to the banking experience of a life-time");
		System.out.print("To get started please enter your user name > ");
		String Input = scan.nextLine();

		if(Input.equals("Peanut"))
		{
			System.out.print("Welcome " + Username + " please enter the password to get into your account > ");
			Input = scan.nextLine();

			if(Input.equals("Jam"))
			{
				Menu(balance, withdraw, deposit);
			}
			else
			{
				retry();
			}
		}
		else
		{
			retry();
		}
	}
	public static void Menu(double balance, double withdraw, double deposit)
	{
		Scanner s = new Scanner(System.in);
			System.out.println("======================Bank Account======================");
			System.out.println("");
			System.out.println("		      Balance: " + balance);
			System.out.println("");
			System.out.println("		      Deposit(D)");
			System.out.println("");
			System.out.println("		      Withdraw(W)");
			System.out.println("");
			System.out.println("		      Exit(E)");
			System.out.println("                                                    ");
			System.out.println("========================================================");
			System.out.print("Make a selection > ");
			String Input = s.nextLine();

			if (Input.equals("D"))
			{
				dep(balance, deposit, withdraw);
			}
			else if (Input.equals("W"))
			{
				with(balance, deposit, withdraw);
			}
			else if (Input.equals("E"))
			{

			}
			else
			{
				System.out.print("Please enter either D, W or E to make a selection");
				s.nextLine();
			}
	}

	public static void retry()
	{
		System.out.print("Try Again Later");
	}

	public static void with(double balance, double deposit, double withdraw)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the amount you wish to withdraw > ");
		withdraw = s.nextDouble();

		if (withdraw > 0)
		{
			if (withdraw > balance )
			{
				System.out.println("You are now in the negatives please enter a different amount");
				s.nextLine();
				Menu(balance, deposit, withdraw);
			}
			else if (withdraw < balance)
			{
				balance -= withdraw;
				Menu(balance, deposit, withdraw);
			}
		}
		else
		{
			System.out.println("Withdraw amount can not be less than 1 dollar");
			s.nextLine();
			Menu(balance, deposit, withdraw);
		}
	}
	public static void dep(double balance, double deposit, double withdraw)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the amount you wish to deposit > ");
		deposit = s.nextDouble();

		if (deposit > 0)
		{
			balance += deposit;

			Menu(balance, deposit, withdraw);
		}
		else
		{
			System.out.println("Deposit amount can not be less than 1 dollar");
			s.nextLine();
			Menu(balance, deposit, withdraw);
		}

		
	}
}