import java.util.Scanner;

public class Facto {
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("N = ");
        int n= input.nextInt();
        System.out.println("Factorial de "+n+" este egal cu "+factorial(n));
    }
    public static int factorial(int x) {
        if (x<=1) {
            return 1;
        }
        else {
            return factorial(x-1)*x;
        }

        }
    }


