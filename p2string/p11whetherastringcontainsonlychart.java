package p2string;

public class p11whetherastringcontainsonlychart {
    public static void main(String[] args) {
        String str = "HelloWorld";
        boolean isAlpha = true;
        for (int i = 0; i < str.length(); i++)
            if (!Character.isLetter(str.charAt(i))) { isAlpha = false; break; }
        System.out.println(isAlpha);
    }
}
