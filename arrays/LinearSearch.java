package arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr,int k){
        int pos = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        System.out.println("Enter the number that you want to search: ");
        int k = s.nextInt();
        int[] arr = CreateAndPrintArray.getArray(n);
        int position = linearSearch(arr,k);
        if(position == -1){
            System.out.println("The element is not found!!");
        }
        else{
            System.out.println("The element is found at "+position+" index and "+(position+1)+" position");
        }

    }
}
