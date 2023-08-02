import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int lastDigit = number % 10;
        while(number >=10){
            number/=10;
        }
        int firstDigit = number;
        int result = firstDigit + lastDigit;
        System.out.println("Sum of " + firstDigit + " and " + lastDigit + " of the number is " + result);
    }
}