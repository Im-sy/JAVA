import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 120
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // int y = input.nextInt();
        // if (x>y) {
        //     System.out.println(x-y);
        // } else {
        //     System.out.println(y-x);
        // }

        // 121
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // if (x>0) {
        //     System.out.println("plus");
        // } else if (x<0) {
        //     System.out.println("minus");
        // } else {
        //     System.out.println("zero");
        // }

        // 122
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // if (x%400==0 || (x%4==0 && x%100!=0)) {
        //     System.out.println("leap year");
        // } else {
        //     System.out.println("common year");
        // }

        // 123
        // Scanner input = new Scanner(System.in);
        // System.out.printf("Number? ");
        // int x = input.nextInt();
        // String what = "";
        // switch (x) {
        //     case 1: 
        //         what = "dog";
        //         break;
        //     case 2:
        //         what = "cat";
        //         break;
        //     case 3:
        //         what = "chick";
        //         break;
        //     default:
        //         what = "I don't know.";
        //         break;
        // }
        // System.out.println(what);

        // 124
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int day = 0;
        switch (x) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
        }
        System.out.println(day);
    }
}
