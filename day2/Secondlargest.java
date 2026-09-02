
package day2;
import java.util.Scanner;
public class  Secondlargest{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int a = arr[0];
        int b = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>a){
                b = a;
                a = arr[i];
            }
            else if(arr[i]>b&&arr[i]<a){
                b = arr[i];
            }
        }
        System.out.println(b);
        scan.close();

    }
    
}
/*class Solution {
    
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        
        if (n < 2) {
           
            return -1; 
        }
        
        
        Arrays.sort(nums);

        int largest = nums[n - 1];

        int secondLargest = -1;

       
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] != largest) {

              /
                secondLargest = nums[i];
                break;
            }
        }

        
        return secondLargest;
    }
} */