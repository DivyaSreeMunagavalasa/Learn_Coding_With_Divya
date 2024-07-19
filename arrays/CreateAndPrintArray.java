package arrays;

import java.util.Scanner;

public class CreateAndPrintArray {
    public static int[] getArray(int n){
        Scanner s = new Scanner(System.in);
        int [] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void printArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
