
package string;
public class p3palindrome {
    public static void main(String[]args){
        String a = "aba";
        String reversed = new StringBuilder(a).reverse().toString();
        if(a.equals(reversed)){
            System.out.println("PALINDRAME");


        }
        else{
            System.out.println(" not PALINDRAME");


        }
       
        
    }

    }

