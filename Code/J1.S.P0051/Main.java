/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author chuth
 */
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
