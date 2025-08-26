import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int n = sc.nextInt();

        if(n%5==0){
           System.out.println("divisble by 5");
        } else  if(n%3 ==0){
            System.out.println("Divisble by 3");
        }else if(n%2==0){
            System.out.println("Dividible by 3");
        }else {
            System.out.println("Not Divisble");
        }
    
    }
}
