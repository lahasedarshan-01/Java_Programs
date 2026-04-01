public class BitwiseOperators {

    public static void main(String[] args) {
        int a = 5, b = 3;

        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("NOT a: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
        System.out.println("Unsigned Right Shift: " + (a >>> 1));
    }
}
