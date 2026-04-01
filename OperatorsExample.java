import java.util.Scanner;

public class OperatorsExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Arithmetic Operators (+, %) --------
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Remainder = " + (a % b));

        // -------- Relational Operators (>, ==) --------
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is equal to b: " + (a == b));

        // -------- Bitwise Operators (&, |) --------
        System.out.println("Bitwise AND = " + (a & b));
        System.out.println("Bitwise OR = " + (a | b));

        // -------- Logical Operators (&&, !) --------
        System.out.print("Enter true or false: ");
        boolean x = sc.nextBoolean();

        System.out.print("Enter true or false: ");
        boolean y = sc.nextBoolean();

        System.out.println("Logical AND = " + (x && y));
        System.out.println("Logical NOT of first value = " + (!x));

        // -------- Assignment Operators (+=, *=) --------
        System.out.print("Enter a number for assignment operator: ");
        int c = sc.nextInt();

        c += 2;
        System.out.println("After += 2 : " + c);

        c *= 3;
        System.out.println("After *= 3 : " + c);


        sc.close();
    }
}
