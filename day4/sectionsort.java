package day4;
import java.util.Scanner;
public class sectionsort {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }

        scan.close();
    
    for(int i = 0;i<arr.length-1;i++){
        int minIndex = i;
        for(int j = i+1;j<arr.length;j++){
            if(arr[j]<arr[minIndex]){
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i]= arr[minIndex];
        arr[minIndex]= temp;

    }
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    
    }   
}
