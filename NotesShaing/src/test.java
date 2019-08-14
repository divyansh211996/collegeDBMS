
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter second number");
        int b = in.nextInt();

//        int lcm = 0;
//        for (int i = 1; i <= a * b; i++) {
//            if (i % a == 0 && i % b == 0) {
//                lcm = i;
//                break;
//            }
//        }
//        System.out.println("lcm " + lcm);
        
        int min = Math.max(a, b);
        
        int hcf=0;
        for (int i = 1; i <=min; i++) {
             if (a%i == 0 && b%i == 0) {
                hcf = i;
//                break;
            }
        }
        
        System.out.println(hcf);
    }

}
