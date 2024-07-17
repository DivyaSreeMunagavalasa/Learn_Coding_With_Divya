package arrays;

import java.util.Scanner;

public class CreateArray {
    public static int[] getArray(int n){
        Scanner s = new Scanner(System.in);
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
