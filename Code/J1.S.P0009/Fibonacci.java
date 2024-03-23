package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("The 45 sequence Fibonacci:");
        fibonnaci(45, 1, 0, 1);
    }
   
    public static int fibonnaci(int term, int lower, int higher, int currentTerm) {
        if (term < 2) {
            return lower;
        }
        if(currentTerm <= term) {
            System.out.print(higher + " ");
//            System.out.println("#" + currentTerm + ": " + higher); //  Bonus: Hiển thị danh sách các phần tử Fibonacci (By TamNT122)
            return fibonnaci(term, higher, higher + lower, currentTerm + 1);
        }
        return 0;
    }
}
