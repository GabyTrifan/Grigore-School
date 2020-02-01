import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Let's play a game called \"Odds and Evens\"");
		System.out.print("What's your name? ");
		String name= input.next();
		System.out.print("Hi "+name+" which do you choose? (O)dds or (E)vens? ");
		String player = input.next();
		
		if (player.equalsIgnoreCase("Odds") || player.equalsIgnoreCase("O")) { // Odds
			System.out.println(name+" has picked odds! The computer will be evens.");
			System.out.print("How many fingers do you put out? ");
			int playerNum = input.nextInt();
			
			int computer = rand.nextInt(6);
			System.out.println("The computer played "+computer+" \"Fingers\"");
			System.out.println("------------------------------------------------------------");
			
			int sum = computer+playerNum; 
			System.out.println(playerNum+" + "+computer+" = "+sum);
			
			if (sum%2==0) {System.out.println(sum+" is ...even!");System.out.println("Computer wins!");}
			else {System.out.println(sum+" is ...odd!");System.out.println(name+" wins!");}		}
		
		
		else if (player.equalsIgnoreCase("Evens") || player.equalsIgnoreCase("E")) { // Evens
			System.out.println(name+" has picked evens! The computer will be odds.");
			System.out.print("How many fingers do you put out? ");
			int playerNum = input.nextInt();
			
			int computer = rand.nextInt(6);
			System.out.println("The computer played "+computer+" \"Fingers\"");
			System.out.println("------------------------------------------------------------");
			
			int sum = computer+playerNum; 
			System.out.println(playerNum+" + "+computer+" = "+sum);
			
			if (sum%2==0) {System.out.println(sum+" is ...even!");System.out.println(name+" wins!");}
			else {System.out.println(sum+" is ...odd!");System.out.println("The computer wins!");}}
		System.out.println("------------------------------------------------------------");
		
		}
}
