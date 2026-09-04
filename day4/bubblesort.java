package day4;
import java.util.Scanner;
public class sectionsort {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }
        for(int j = 0;j<arr.length-1;j++){
           
            for(int k = 0;k<arr.length-1-j;k++){
                if(arr[k]<arr[k+1]){
                    int temp = arr[k];
                    arr[k]= arr[k+1];
                    arr[k+1]= temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++ ){
            System.out.println(arr[i]);
        }
        scan.close();

    }
    
}
