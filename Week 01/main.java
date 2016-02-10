import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int bill, customer, change, coins;

        System.out.println("Enter the amount to be paid (in pence): ");
        bill = keyboard.nextInt();
        System.out.println("Enter the money received: ");
        customer = keyboard.nextInt();
        change = customer - bill;
        System.out.println("Change due: " + change);

        if (change >= 200) {
            coins = change / 200;
            change %= 200;
            System.out.println("£2 coins: " + coins);
        }

        if (change >= 100) {
            coins = change / 100;
            change %= 100;
            System.out.println("£1 coins: " + coins);
        }

        if (change >= 50) {
            coins = change / 50;
            change %= 50;
            System.out.println("50p coins: " + coins);
        }

        if (change >= 20) {
            coins = change / 20;
            change %= 20;
            System.out.println("20p coins: " + coins);
        }

        if (change >= 10) {
            coins = change / 10;
            change %= 10;
            System.out.println("10p coins: " + coins);
        }

        if (change >= 5) {
            coins = change / 5;
            change %= 5;
            System.out.println("5p coins: " + coins);
        }

        if (change >= 2) {
            coins = change / 2;
            change %= 2;
            System.out.println("2p coins: " + coins);
        }

        if (change >= 1) {
            coins = change / 1;
            change %= 1;
            System.out.println("1p coins: " + coins);
        }

    }
}
