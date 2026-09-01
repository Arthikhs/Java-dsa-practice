package day1;

import java.util.Scanner;

class switchcase {
    public void whichWeekDay(int day) {
        switch(day){
            case 1 :
            System.out.println("Monday");
            break;
            case 2 :
            System.out.println("Tuesday");
            break;
            case 3 :
            System.out.println("Wednesday");
            break;
            case 4 :
            System.out.println("Thrsday");
            break;
            case 5 :
            System.out.println("Friday");
            break;
            case 6 :
            System.out.println("Saturday");
            break;
            case 7 :
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid");
           
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switchcase obj = new switchcase();
        obj.whichWeekDay(day);
        sc.close();
    }


}
