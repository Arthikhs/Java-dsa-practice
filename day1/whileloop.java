package day1;


import java.util.Scanner;
class whileloop{
    public int whileLoop(int d) {
        int sum = 0;
        int num = d;
        int count = 0;
        while(count<50){
            sum = sum + num;
            count ++;
            num +=10;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        whileloop obj = new whileloop();
         int result = obj.whileLoop(d);
         System.out.println(result);
        scan.close();

    }

}