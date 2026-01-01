import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            int l = a > b ? ((a > c) ? a : c) : ((b > c) ? b : c);
            int l1 = l*l;

            int a1 = a*a;
            int b1 = b*b;
            int c1 = c*c;

            if(a1 + b1 == l1) {
                System.out.println("right");
            }
            else if(a1 + c1 == l1) {
                System.out.println("right");
            }
            else if(b1 + c1 == l1) {
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }

    }
}
