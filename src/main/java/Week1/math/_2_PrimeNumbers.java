package Week1.math;

public class _2_PrimeNumbers {

    public static void main(String[] args)  {
        System.out.println(isPrime(11));
    }

    private static boolean isPrime(int num) {
        if(num==2) return true;
        for(int i=2; i<num; i++){
            return num%i == 0 ? false : true;
        }
        return false;
    }
}
