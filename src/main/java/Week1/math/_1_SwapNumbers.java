package Week1.math;

// Swap two numbers without using a third variable
public class _1_SwapNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swapNums(num1, num2);
    }

    public static void swapNums(int num1, int num2){
        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
