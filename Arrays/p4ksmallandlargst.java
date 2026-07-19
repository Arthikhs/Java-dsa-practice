
package Arrays;
import java.util.Scanner;
public class p4ksmallandlargst {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
       int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
   
