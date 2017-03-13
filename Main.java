import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("minutes: ");

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int b = m*12;
        System.out.println("bottles: " + b);
    }
}