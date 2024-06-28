package patterns;
import java.util.Scanner;
/*For n = 5
The square pattern is:
  *****
  *****
  *****
  *****
  *****
*/
public class Pattern1 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			//For square patterns, the number of rows and columns will be same.
			System.out.print("Enter the number of rows and columns: ");
			int n = s.nextInt();	
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
