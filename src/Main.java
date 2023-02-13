public class Main {
    public static void main(String[] args) {

        boolean condition = true;

        if (condition) {
            System.out.println( "I have reached this statement" );
        }

        if ( 1 < 3 ) {
            System.out.println( "Statements works" );
        }

        int a = 1;
        int b = 5;

        if (a < b) {
            System.out.println( "statement is true" );

        } else {
            System.out.println( "statement is false" );
        }

        // else if
        // && ||
        // switch case

        int[] myArray = new int [10];
        int[] myArrayTwo = {1, 2, 3};
        myArrayTwo[0] = 2;
        // myArray.length
        // myArray [myArray.length -1]

        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int x = 7;
        Integer y = 111;
        x = y;
        y = x * 123;




    }


}