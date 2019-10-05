
public class JavaMethods {
	public static void main(String[] args) {
		message1();
		message2();
		System.out.println("Finished main.");
	}
	public static void message1() {
		System.out.println("This is message 1.");
	}
	public static void message2() {
		System.out.println("This is message 2.");
		message1();
		System.out.println("Finished message 2.");
	}
}
