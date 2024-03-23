package calculator;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Calculator.normalCalculator();
                    break;
                case 2:
                    BMICal.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
    
}
