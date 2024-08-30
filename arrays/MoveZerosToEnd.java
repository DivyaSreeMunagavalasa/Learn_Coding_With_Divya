package arrays;
import java.util.Scanner;
public class MoveZerosToEnd {
    public static int findFirstZero(int [] arr){
        int j = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        return j;
    }
    public static void moveZerosToEnd(int[] arr){
        int j = findFirstZero(arr);
        if(j == -1){
            return;
        }
        for(int i = j + 1 ; i < arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int [] arr = CreateAndPrintArray.getArray(n);
        System.out.print("The original array is: ");
        CreateAndPrintArray.printArray(arr);
        moveZerosToEnd(arr);
        System.out.print("The array after moving zeros to end is: ");
        CreateAndPrintArray.printArray(arr);
    }
}
