
import java.util.Scanner;

public class IntegerOrNot {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr Your No");

    double n = sc.nextDouble();

     
     if(n == (int)n)System.out.println("Not an Integer");
     else System.out.println("Is a inetegr");
 }
}
