import java.util.Scanner;

public class SideOfTrinagle {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter 1st Side: ");
        int n1 = sb.nextInt();
        System.out.println("Enter 2st Side: ");
        int n2 = sb.nextInt();
        System.out.println("Enter 3st Side: ");
        int n3 = sb.nextInt();

        if(n1+n2>n3 && n2+n3>n1 && n3+n1>n2)
            System.out.println("Valid Traingle");
            else System.out.println("Invalid Traingle");
    }
}