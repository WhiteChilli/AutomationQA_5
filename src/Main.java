import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1
        Scanner userInput = new Scanner(System.in);

        System.out.print("Type in a number between 1 and 4 to get a season:  ");

        int month = userInput.nextInt();

        if (month == 1) {
            System.out.println( "It is summer!" );
        } else if (month == 2) {
            System.out.println("It is autumn!");
        } else if (month == 3) {
            System.out.println("It is winter!");
        } else if (month == 4) {
            System.out.println("It is spring!");
        } else {
            System.out.println("Sorry, I do not have a season with this number!");
        }

        userInput.close();



    }


}