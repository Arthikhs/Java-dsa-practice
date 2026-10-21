package string;
public class p1reversestring{
    public static void main(String[]args){
        String a = "hello";
        String reversed = "";
        for(int i = a.length()-1;i>=0;i--){
            reversed += a.charAt(i);


        }
        System.out.println(reversed);
    }

    }

