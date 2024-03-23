package calculator;

import java.util.Scanner;

public class BMICal {
    
    private static final Scanner in = new Scanner(System.in);

    // display result BMI status
    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi < 25) {
            return "Standard.";
        } else if (bmi < 30) {
            return "Overweight.";
        } else if (bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    // allow user BMI calculator
    public static void BMICalculator() {
        System.out.println("----- BMI Calculator -----");
            System.out.print("Enter Weight(kg): ");
            double weight = Validate.possitiveNumber();
            System.out.print("Enter Height(cm): ");
            double height = Validate.possitiveNumber();
            double bmi = weight * 10000 / (height * height);
            System.out.printf("BMI number: %.2f\n", bmi);
            System.out.println("BMI Status: " + BMIStatus(bmi));
    }
}
