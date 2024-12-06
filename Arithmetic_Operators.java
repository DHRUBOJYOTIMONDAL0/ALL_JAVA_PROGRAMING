public class Arithmetic_Operators {

    public static void main(String[] args) {

        int num1 = 10;
        // int num2 = 15;
        num1 = num1 + 1; // same for all Arithmetic Operators

        // int res = num1 + num2; // same for all Arithmetic Operators

        num1 += 1;

        num1++; // Post - increment
        ++num1; // Pre - increment
        num1--; // Post - decrement

        int res = num1++; // Fetch the value and then increment
        int res = num1++; // Increment and then the value

        // System.out.println("Addition: " + res);
        System.out.println(num1);
    }

}
