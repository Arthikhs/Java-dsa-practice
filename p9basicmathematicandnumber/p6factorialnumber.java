package p9basicmathematicandnumber;

public class p6factorialnumber {
    public static void main(String[]args){
        int num  = 8;
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    
}
