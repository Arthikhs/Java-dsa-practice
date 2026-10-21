
package string;
public class p2reversestringwithstringbuilder {
    public static void main(String[]args){
        String a = "hello";
        String reversed = new StringBuilder(a).reverse().toString();
       
        System.out.println(reversed);
    }

    }

