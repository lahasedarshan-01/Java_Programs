import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height_cm = sc.nextDouble();

        double height_m = height_cm / 100;
        double bmi = weight / (height_m * height_m);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } 
        else if (bmi < 29.9) {
            System.out.println("Category: Overweight");
        } 
        else {
            System.out.println("Category: Obese");
        }
0
        sc.close();
    }
}
