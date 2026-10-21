package string;

public class p8countthefrequencyofeachcahter {
    public static void main(String[]args){
        String str = "abhkijjinfioioaacnoaoi";
        for(int i = 0;i<str.length();i++){
            int count = 1;
            boolean alerndycount = false;
            for(int j  = 0;j<i;j++){
                if(str.charAt(i)== str.charAt(j)){
                    alerndycount = true;
                    break;

                }
            }
            if(alerndycount){
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " = " + count);

        }
    }
}
