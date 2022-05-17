import java.util.Scanner;

public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        /*
        int[] array  = new int[] {3, 11, 43, 15, 16};       //1

        for(int i = 0; i < 5; i++){
            if(i % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }


        int[] arr = new int[] {1, 2, 3, 4, 5};      //2

        for(int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
         */

        int[] arr = new int[]{1, -3, 6, 2, -9};

        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
