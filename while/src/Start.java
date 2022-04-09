import javax.security.sasl.SaslServer;
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


        int n, a = 2;      //3

        System.out.print("Введіть число: ");
        n = in.nextInt();

        while (a + a < n) {
            a = a + a;
            System.out.println(a);
        }


        int n, i = 1;       //4

        System.out.print("Введіть число: ");
        n = in.nextInt();

        while (i < n) {
            i = i * 2;
        }
        if (i == n) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }


        int n, k = 0, q = 1;       //5

        System.out.print("Введіть число: ");
        n = in.nextInt();

        while (q < n) {
            q = q * 2;
            k++;
        }
        System.out.println("Відповідь: " + k);


        int q = 1;   //6
        double x, y;

        System.out.print("Введіть початкова відстань: ");
        x = in.nextFloat();

        System.out.print("Введіть кількість днів: ");
        y = in.nextInt();

        while (x <= y) {
         x = x + ((x / 100) * 10);
         q++;
     }
        System.out.println(q);
         */

        int q, w ,e, r = 1;     //7

        System.out.print("Введіть початковий вклад: ");
        q = in.nextInt();
        System.out.print("Введіть відсотки: ");
        w = in.nextInt();
        System.out.print("Введіть бажану суму: ");
        e = in.nextInt();

        while (q < e){
            q = q + ((q / 100) * w);
            r++;
        }
        System.out.println("Роки: " + r);
    }
}
