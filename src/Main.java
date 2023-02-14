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



        // Task 2

        String[] myMusicList = new String [5];
        myMusicList[0] = "Queen";
        myMusicList[1] = "Scorpios";
        myMusicList[2] = "Helloween";
        myMusicList[3] = "Nightwish";
        myMusicList[4] = "Prodigy";



        // Task 3

        int[] firstArray = {1, 2};
        int[] secondArray = {3, 4};
        int[] thirdArray = {5, 6};

        System.out.println(firstArray[0] + " " + firstArray[1]);
        System.out.println(secondArray[0] + " " + secondArray[1]);
        System.out.println(thirdArray[0] + " " + thirdArray[0]);



        //Task 4

        Phone blackSmartphone = new Phone(11223344, "samsung", 0.4);
        Phone whiteSmartPhone = new Phone(88554411, "iphone");

        blackSmartphone.callTheNumber(5599224);
        whiteSmartPhone.showPhoneModel();


    }


}