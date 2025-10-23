import java.util.Scanner;

public class Lec_03_FactorialofNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.println(f);
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int fact= factorial(n-1);
        int fn = n*fact;
        return fn;
    }
}
