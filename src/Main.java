import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, number, smallestNumber = 0, biggestNumber = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            number = inp.nextInt();
            if (number <= smallestNumber) {
                smallestNumber = number;
            } else if (number >= biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println("The largest number: " + biggestNumber);
        System.out.println("The smallest number: " + smallestNumber);

    }
}
