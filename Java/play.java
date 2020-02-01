import java.util.Scanner;

public class play
{
	static Scanner input= new Scanner(System.in);
	static boolean keepPlaying=true;
	public static void main(String[] args)
	{
		System.out.println("Let's play a guessing game!");

		while(keepPlaying)
		{
			PlayARound();
		}
		System.out.println("\nThank you for playing!");
	}
	public static void PlayARound()
	{
		boolean validInput;
		int number, guess;
		String ans;

		// Pick a random number
		number=(int)(Math.random() * 10)+1;
		System.out.println("\nI'm thinking of a number between 1 and 10.");

		//guess
		System.out.print("What do you think it is? ");
		do
		{
			guess=input.nextInt();
			validInput=true;
			if ((guess<1) || (guess > 10))
			{
				System.out.print("I said, between 1 and 10. try again: ");
				validInput= false;

			}
		} while (!validInput);

		// Check the guess
		if (guess == number)
			System.out.println("You're right!");
		else
			System.out.println("You're wrong! The number was "+number);
		// Play again?
		do
		{

			System.out.print("\nPlay again? (Y/N) ");
			ans= input.next();
			validInput=true;
			if (ans.equalsIgnoreCase("Y")); // keepPlaying remains true
			else if (ans.equalsIgnoreCase("N"))
				keepPlaying=false;
			else
				validInput = false;
		} while (!validInput);
		
	}
}