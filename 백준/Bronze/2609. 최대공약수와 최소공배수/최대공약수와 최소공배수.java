import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a > b ? b : a;
        int max = a > b ? a : b;

        int sum1 = 0;
        for(int i = min; i > 0; i--){
            if(a % i == 0 && b % i == 0) {
                sum1 = i;
                break;
            }
        }

        System.out.println(sum1);

        int sum2 = 0;
        int j = max;
        while(true) {
            if(j % a == 0 && j % b == 0) {
                sum2 = j;
                break;
            }
            j++;
        }

        System.out.println(sum2);
    }
}
