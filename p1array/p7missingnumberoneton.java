public class p4missingnumberoneton {
   public static void main(String[] args){
    int arr[]= {1,3,4,2,6};
    int n = 6;
    int total = n * (n + 1) / 2;
    int sum = 0;
    for(int i= 0;i<arr.length;i++){
        sum = sum +arr[i];

    }
    int miss = total -sum;
    System.out.println(miss);

   } 
}
