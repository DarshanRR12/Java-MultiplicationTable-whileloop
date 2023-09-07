import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 10;
        int currentNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for desired multiplication table : ");
        int userInput = scanner.nextInt();

        while (currentNumber <= number){
            System.out.println(currentNumber * userInput);
            currentNumber ++;
        }
    }
}
