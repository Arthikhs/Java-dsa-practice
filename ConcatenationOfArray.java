import java.util.Scanner;

class ConcatenationOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.replace("[", "").replace("]", "");

        String[] input = s.split(",");

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i].trim());
        }

        for (int num : arr) {
            System.out.print(num + "[]");
        }
    }
}