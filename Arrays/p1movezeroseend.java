package Arrays;
import java.util.Scanner;
public class p1movezeros {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }
        int j =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                j++;
                
            }

        }
         for (int num : arr) {
            System.out.print(num + " ");
        }
        scan.close();
    }
    
}
