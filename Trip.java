import java.util.Scanner;

public class Trip {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("Welcome to Vacation Planner!");
		System.out.print("What's your name? ");
		String name= read.nextLine();
		System.out.print("Nice to meet you "+name+", wheare are you travelling to? ");
		String destination = read.nextLine();
		System.out.println("Great! "+ destination +" sounds like a great trip");
		System.out.println("***********");
		MoneynTime();
	}
	public static void MoneynTime() {
		Scanner read = new Scanner(System.in);
		System.out.print("How many days are you spending travelling? ");
		int dayz = read.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
	    Double budget= read.nextDouble();
		System.out.print("What is three letter currency symbol for your travel destination? ");
		String currency= read.next().toUpperCase();
		double toUSD=0; 
		int hours=dayz*24,minutes=hours*60;
		
		if ("USD".equals(currency)) {toUSD=1.0;} else {System.out.print("How many "+currency.toUpperCase()+" are there in 1 USD?");
		toUSD=read.nextInt();}
		System.out.println("If you're travelling for "+dayz+" days,that is the same as "+hours+" hours  or "+
				minutes+" minutes");
		System.out.println("If you're going to spend $"+budget+
				" USD that means per day you're spending up to $"+(budget/dayz)+" USD"
		);
		double curBudget= budget*toUSD;
		if (!"USD".equals(currency)) {
			System.out.println("Your total budget in "+currency+" is "+curBudget+" "+currency
					+", which per day is "+(curBudget/dayz)+" "+currency);
		}
		System.out.println("***********");
		Time();
		}
	public static void Time() {
		Scanner read = new Scanner(System.in);
		System.out.print("What's the time difference, in hours, between your home and your home and your destination?");
		int timeDiff= read.nextInt();
		System.out.println("That means that when it is midnight at home it will be "+timeDiff%24+":00 in your travel destination "+
				" and when it will be noon at home it will be "+(12+timeDiff)%24+":00");
		System.out.println("***********");
		System.out.print("Want to respond to one more question?");
		String quest= read.next().toUpperCase();
		if ("Y".equals(quest)) {
		AreaS();} else {System.out.println("Ok then");}
	}
	public static void AreaS() {
		Scanner read = new Scanner(System.in);
		System.out.print("What is the square area of your destination country in Km2? ");
		int AreaKm = read.nextInt();
		double AreaM= AreaKm*0.38610;
		System.out.println("In miles2 that is "+AreaM);
		
	}
	
}
