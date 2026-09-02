package day1;


import java.util.Scanner;

class forloop {
    public int forLoop(int low, int high) {
        int sum = 0;
        for(int i = low;i<=high;i++){
            sum+=i;
        }
        return sum;
        
    
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();
        forloop obj = new forloop();
         int result = obj.forLoop(low,high);
         System.out.println(result);
        scan.close();

    }

}