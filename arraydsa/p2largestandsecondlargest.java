


public class p2largestandsecondlargest {

    public static void main(String[] args) {
        int[] arr = {10,  20, 30, 8, 5, 12 };
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;

        

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest) {
                Secondlargest=largest;
                largest= arr[i];
            }
            else if (arr[i] >Secondlargest
                    && arr[i] != largest) {
                Secondlargest = arr[i];
        }
    }
        System.out.println(Secondlargest);

    
    }
}
