package p2string;

import java.util.Arrays;

public class p14reversethewordinthesentce {
    public static void main(String[]args){
        String abhi = "neha is abhi";
        String [] words = abhi.split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder revere = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            revere.append(words[i]);
        
        if(i >0){
            revere.append(" ");
        }

    }
    System.out.println(revere);

    }
}
