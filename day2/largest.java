package day2;
import java.util.Scanner;
public class largest {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int a = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>a){
                arr[i]= a;
            }
        }
        System.out.println(a);
        scan.close();

    }
    
}
