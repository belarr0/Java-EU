import java.util.Scanner;

public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        /*
        System.out.println("Введіть перше число: ");    //1
        int a = in.nextInt();

        System.out.println("Введіть друге число: ");
        int b = in.nextInt();



        if (a>b){
            System.out.print("Число: " + a + " більше");
        }else {
            System.out.print("Число: " + b + " більше");
        }


        int b=0;    //2

        do {
            System.out.println("Введіть рік: ");
            int a = in.nextInt();

            if (a % 4 == 0) {
            }
            if (a % 100 != 0) {
            }
            if (a % 400 == 0) {
                b++;
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }while (b<1);


        System.out.print("Введіть 'x': ");    //4
        int x = in.nextInt();

        if (x>0){
            System.out.print("1");
        }if (x<0){
            System.out.print("-1");
        }if (x==0){
            System.out.print("0");
        }

        System.out.print("Введіть перше число: ");  //5
        int f = in.nextInt();
        System.out.print("Введіть друге число: ");
        int s = in.nextInt();

        if (f>s){
            System.out.println("Найбільше: " + f);
        }else{
            System.out.println("Найбільше: " + s);
        }


        int first, second, third;   //6
        int a = 0;
        String str1 = "Y";
        String str2 = "N";

        do {
            System.out.print("Введіть перше число: ");
            first = in.nextInt();
            System.out.print("Введіть друге число: ");
            second = in.nextInt();
            System.out.print("Введіть третє число: ");
            third = in.nextInt();

            if (first > second) {
                if (first > third) {
                    System.out.println(first + " найбільше");
                }
            }
            if (second > first) {
                if (second > third) {
                    System.out.println(second + " найбільше");
                }
            }
            if (third > first) {
                if (third > second) {
                    System.out.println(third + " найбільше");
                }
            }

            System.out.print("Завершити? (Y/N): ");
            String answer = in.next();
            //String answer = in.next();
            if(answer.equalsIgnoreCase(str1)){
                System.out.print("Stop");
                a++;
            }if (answer.equalsIgnoreCase(str2)){
                System.out.println("Continue");
            }
        }while (a<1);


        int x1, y1, x2, y2;     //7

        System.out.println("x1/y1 -- rook\nx2/y2 -- other figure");

        System.out.println("-------------");

        System.out.print("x1: ");
        x1 = in.nextInt();
        System.out.print("y1: ");
        y1 = in.nextInt();
        System.out.print("x2: ");
        x2 = in.nextInt();
        System.out.print("y2: ");
        y2 = in.nextInt();

        if(x1 == x2){
            System.out.println("Y");
        }if (y1 == y2){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
         */

        int x1, y1, x2, y2;     //8

        System.out.println("x1/y1 -- elephant\nx2/y2 -- other figure");
        System.out.println("-------------");

        System.out.print("x1: ");
        x1 = in.nextInt();
        System.out.print("y1: ");
        y1 = in.nextInt();
        System.out.print("x2: ");
        x2 = in.nextInt();
        System.out.print("y2: ");
        y2 = in.nextInt();

        if(x1 + y1 == x2 + y2){

        }
    }
}
