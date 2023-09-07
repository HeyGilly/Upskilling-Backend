public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//      Exercise - Syntax, Types, and Variables

        int myFavoriteNumber = 20;
        System.out.println(myFavoriteNumber);


//        String myString = "This is a string value";
//        char myString = "This is a string value";
        //-- When we turn into a char instead of a string we see that it won't work
        //-- Want to be change back to a string
//        System.out.println(myString);

//        long myNumber;
        //-- An error occurs stating that it was not initialized

//        myNumber = 3.14;
        //-- The error occurs that my long wants to be a double

//        myNumber = 123L;
        //-- Runs and no errors

//        myNumber = 123;
        // Runs and no Errors

        //-- The reason why the value '3.14' does not work because it wants to turn into a double.

//        float myNumber = (float) 3.14;
        float myNumber = 3.14F;
        //-- This is not working because the float should be a double.
        //-- One way to fix this problem is by adding a 'F' at the end of 3.14
        //-- Another way to fix this problem is by narrowing conversion
        System.out.println(myNumber);

        System.out.println();

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        System.out.println();
//
//        x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = 'this is not gonna work';
//        System.out.println(class);
        //-- This is a reserved keyword that we are not able to use.

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//       int three = (int) o;
//        //--
//        int three = (int) "three";

        int x = 4;
        x = x + 5;
        System.out.println(x);

        x=4;
        x += 5;
        System.out.println(x);

         x = 3;
        int y = 4;
        y = y * x;
        System.out.println(y);

        x=3;
        y=4;
        y *= x;
        System.out.println(y);

        x = 10;
        y = 2;
        x = x / y;
        y = y - x;
        System.out.println(y);

        x=10;
        y=2;
        x /= y;
        y -= x;
        System.out.println(y);


    }
}
