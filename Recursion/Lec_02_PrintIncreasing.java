import java.util.Scanner;

public class Lec_02_PrintIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        printincreasing(n);
    }

   public static void printincreasing(int n){
    if(n==0){
        return;
    }
    printincreasing(n-1);
    System.out.println(n);
   }
}
