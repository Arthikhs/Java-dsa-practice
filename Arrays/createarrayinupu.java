import java.util.Scanner;

package Arrays;

public class createarrayinupu {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
    }
    
}
