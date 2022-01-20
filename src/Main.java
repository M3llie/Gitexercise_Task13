import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! This is now a new feature, test 2!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + "!");
    }
}
