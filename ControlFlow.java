import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ControlFlow{
    public class AsciiChars  {

    public static void printNumbers() {

        for(int i=48; i < 57; i++) {
        int num = i;
        System.out.println("ASCII: " + num + "is equal to " + i);
        
        }
    }

    public static void printLowerCase() {

        for(int i=97; i < 122; i++) {
        int num = i;
        System.out.println("ASCII: " + num + "is equal to " + i);
        }
    }

    public static void printUpperCase(){
        for(int i=65; i < 90; i++) {
        int num = i;
        System.out.println("ASCII: " + num + "is equal to " + i);
        }
    }
}


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello!");
    String someString = input.next();
    System.out.println("Do you wish to continue?");
    String anwser1 = input.next();
    if (anwser1.equals("yes") || anwser1.equals("y")) {
        System.out.println("Do you have a red car?");
        while (!input.hasNext()) {
            System.out.println("Not acceptable.");
            input.next();
        }
        String redcar = input.next();

        System.out.println("What the name of your favorite pet?");
        while (!input.hasNext()) {
            System.out.println("Not acceptable. Please enter a proper name: ");
            input.next();
        }

        String favoritePet = input.next();

        System.out.println("What is the age of your favorite pet?");
        while (!input.hasNextInt()) {
            System.out.println("Not acceptable. Please give a proper age: ");
            input.next();
        }

        int age = input.nextInt();

        System.out.println("What is your lucky number?");
        while (!input.hasNextInt()) {
            System.out.println("Not acceptable. Please give a proper number: ");
            input.next();
        }

        int luckyNumber = input.nextInt();

        System.out.println("What is your favorite quarterback's jersey number?");
        while (!input.hasNextInt()) {
            System.out.println("Not acceptable. Please give a proper jersey number: ");
            input.next();
        }

        int jerseyNumber = input.nextInt();

        System.out.println("What is the two-digit model of your car");
        while (!input.hasNextInt()) {
            System.out.println("Not acceptable. Please give a proper two-digit model number: ");
            input.next();
        }

        int carNumber = input.nextInt();

        System.out.println("What is the first name of your favorite actor or actress?");
        while (!input.hasNext()) {
            System.out.println("Not acceptable. Please give a proper name: ");
            input.next();
        }

        String actorName = input.next();

        System.out.println("Enter a random number between 1 and 50: ");
        while (!input.hasNextInt()) {
            System.out.println("Not acceptable. Please give a proper number: ");
            input.next();
        }

        int randomNum = input.nextInt();

        Random random = new Random();
        int magicNum = random.nextInt(10)+2;
        int magicBall = jerseyNumber * magicNum; 
            while (magicBall > 75) {
                magicBall -=75;
            }
        int lotteryNum1 = carNumber + luckyNumber;
        while(lotteryNum1 > 65) {
            magicBall -= magicNum;
             }
        int lotteryNum2 = jerseyNumber + age + luckyNumber;
        while (lotteryNum2 > 65) {
            lotteryNum2 -= magicNum;
            }
        int lotteryNum3 = randomNum - magicNum;
        while (lotteryNum3 < 1) {
            lotteryNum3 += magicNum*magicNum;
        }
        int lotteryNum4 = age + carNumber;
        while (lotteryNum4 > 65) {
            lotteryNum4 -= magicNum;
        }
        int lotteryNum5 = actorName.charAt(0);
        while (lotteryNum5 > 65) {
            lotteryNum5 -= magicNum;
        }
        System.out.printf ("Lottery numbers: %d, %d, %d, %d, %d Magic ball: %d\n", lotteryNum1, lotteryNum2, lotteryNum3, lotteryNum4, lotteryNum5, magicBall);
        System.out.println("Would you like to start over?");
        String startover = input.next();
        if (startover.equals("yes")) {
            ControlFlow.main(args);
        } else {
            System.out.println("Thanks for playing!");
        }
        
        }
        }
    }
