import java.util.Scanner;

public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        /*
       int n, a=1;      //1

        System.out.print("Введіть число: ");
        n = in.nextInt();

       while (a * a < n){
           System.out.println(a*a);
           a++;
       }


        int a, b = 2;       //2

        System.out.print("Введіть число: ");
        a = in.nextInt();

        while (a % b != 0) {
            b++;
        }
        System.out.println(b);
         */

        int n, a = 2;      //3

        System.out.print("Введіть число: ");
        n = in.nextInt();

        while (a + a < n) {
            a = a + a;
            System.out.println(a);
        }
    }
}
