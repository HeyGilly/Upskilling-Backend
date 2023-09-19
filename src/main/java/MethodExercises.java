public class MethodExercises {

    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static int multiplication_02(int n, int num2) {
        if (num2 == 0) {
            System.out.println("All done!");
            return n;
        }
        n += n;
        num2 -= 1;
        multiplication_02(n,num2);
        return n;
    }

    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num2 % num1;
    }



    public static void main(String[] args) {

//        //Exercise #1
//        System.out.println("Addition: "+addition(1,2));
//
//        // Exercise #2
//        System.out.println("Subtraction: "+subtraction(2,1));
//
//        // Multiplication
//        System.out.println("Multiplication "+multiplication(2,3));
//
//        //Division
//        System.out.println("Division: "+ division(6,2));
//
//        //Modulus
//        System.out.println("Modulus: "+ modulus(6,2));

        //Multiplication Without *
        System.out.println(multiplication_02(2,3));
    }
}
