import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
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


        int[] arr = new int[]{1, -3, 6, 2, -9};     //3

        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0){
                System.out.print(arr[i] + " ");
            }
        }


        int[] arr = new int [] {48, 85, 8, 105, 6};     //4
        int n = 0;

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                n++;
            }
        }
        System.out.println(n);


        int[] arr = new int [] {1, 3, 4, -2, 1};     //5

        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] < 0 && arr[i] < 0 || arr[i - 1] > 0 && arr[i] > 0){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }


        int[] arr = new int[] {1, 5, 1, 5, 1};      //6
        int n = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i]) {
                if(arr[i] > arr[i + 1]){
                    n++;
                }
            }
        }
        System.out.println(n);


        int[] arr = new int[] {4, 5, 3, 4, 2, 3};          //7

        for (int i = 5; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


        int[] array = new int[]{4, 5, 3, 4, 2, 3};       //8

        for (int i = 0; i < array.length-1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            i++;
        }

        System.out.println(Arrays.toString(array));


        int[] arr = {4, 5, 3, 4, 2, 3};       //9

        int temp = arr[5];

        for(int i = 5; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));


        int [] arr = new int [] {1, 2, 3};      //10
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.print(max);


        int[] arr = new int[] {1, 1, 2, 4, 8};      //11
        int q = 0;

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] != arr[i + 1]){
                q++;
            }
        }
        System.out.print(q);


        int q, nums, petro;      //12

        System.out.print("Розмір шеренги: ");
        q = in.nextInt();
        int [] arr = new int[q];

        for (int i = 0; i < q; i++){
            System.out.print(i + 1 + ": ");
            nums = in.nextInt();
            arr[i] = nums;
        }

        System.out.println();
        System.out.println("Шеренга: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Зріст Петра: ");
        petro = in.nextInt();

        for (int i = 0; i < arr.length; i++){
            if(petro < arr[i] && arr[i + 1] < petro){
                System.out.print("Його номер: " + i + 2);
                break;
            }
        }
        */

        int[] arr = new int [] {5,3,7,4,6};         //14

        System.out.println("Було:  " + Arrays.toString(arr));

        int temp1 = arr[0];
        int temp2 = arr[1];
        for (int i = 0; i < 3; i++){
            arr[i] = arr[i + 2];

        }
        arr[3] = temp1;
        arr[4] = temp2;

        System.out.print("Стало: " + Arrays.toString(arr));
    }
}
