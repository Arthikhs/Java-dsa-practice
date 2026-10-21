package p9basicmathematicandnumber;

public class p1checkitsprimenumber {
    public static void main(String[]args){
        int num = 11;
        boolean isprime = true;
        if(num<=1){
            isprime = false;

        }
        else {
            for(int i = 2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    isprime = true;
                    break;
                }
            }
        }
              if (isprime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
