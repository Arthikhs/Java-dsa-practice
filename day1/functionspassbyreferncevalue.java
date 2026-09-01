package day1;


import java.util.Scanner;
class functionspassbyreferncevalue {
    public int[] reverse(int[] arr) {
       int left = 0;
       int right = arr.length-1;
       while(left<right){
        int temp = arr[left];
        arr[left]= arr[right];
        arr[right]= temp;
        left++;
        right--;

       }
       return arr;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }
        functionspassbyreferncevalue obj = new functionspassbyreferncevalue();
         int[] result = obj.reverse(arr);
         System.out.println(result);
        scan.close();

    }

}
