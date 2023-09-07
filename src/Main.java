// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        int numberToReach = 10;
//        int currentNumber = 0;
//
//        while(currentNumber <= numberToReach){
//            System.out.println(currentNumber);
//            currentNumber ++;
//        }
//    }

    public static void main(String[] args) {
        int numberToReach = 10;
        int currentNumber = 0;

        boolean hasNumberReached = false;

        while (!hasNumberReached){
            System.out.println(currentNumber);
            if (currentNumber == numberToReach){
                hasNumberReached = true;
            }
            currentNumber ++;
        }
    }
}