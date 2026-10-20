public class p8maximunsubarrays {
    public static void main(String[] args){
     int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
     int maxsum =  Integer.MIN_VALUE;
     for(int i = 0;i<arr.length;i++){
        int currentsum = 0;
        for(int j = i;j<arr.length;j++){
            currentsum +=arr[j];
            maxsum = Math.max(maxsum,currentsum);
        }
     }
    System.out.println("Maximum subarray sum = " + maxsum); 
   
}
}

