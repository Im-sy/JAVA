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
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // int day = 0;
        // switch (x) {
        //     case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        //         day = 31;
        //         break;
        //     case 4: case 6: case 9: case 11:
        //         day = 30;
        //         break;
        //     case 2:
        //         day = 28;
        //         break;
        // }
        // System.out.println(day);

        // 125
        // Scanner input = new Scanner(System.in);
        // int x= input.nextInt();
        // for (int i=1; i<=x; i++) {
        //     System.out.printf("%d ", i);
        // }

        // 126
        // Scanner input = new Scanner(System.in);
        // int odd = 0;
        // int even = 0;
        // while (true) {
        //     int x = input.nextInt();
        //     if (x==0) {
        //         break;
        //     } else if (x%2==0) {
        //         even++;
        //     } else {
        //         odd++;
        //     }
        // }
        // System.out.printf("odd : %d\neven : %d", odd, even);

        // 127
        // Scanner input = new Scanner(System.in);
        // int sum = 0;
        // int cnt = 0;
        // while (true) {
        //     int x = input.nextInt();
        //     if (x<0 || x>100) {
        //         break;
        //     } else {
        //         sum += x;
        //         cnt++;
        //     }
        // }
        // System.out.printf("sum : %d\navg : %.1f", sum, (double) sum/cnt);

        // 128
        // Scanner input = new Scanner(System.in);
        // int cnt = 0;
        // while (true) {
        //     int x = input.nextInt();
        //     if (x == 0) {
        //         break;
        //     } else if (x%3!=0 && x%5!=0) {
        //         cnt++;
        //     }
        // }
        // System.out.println(cnt);

        // 129
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf("Base = ");
            int base = input.nextInt();
            input.nextLine();
            System.out.printf("Height = ");
            int height = input.nextInt();
            input.nextLine();
            System.out.printf("Triangle width = %.1f\n", base*height*0.5);
            System.out.printf("Continue? ");
            char cont = input.nextLine().charAt(0);
            if (cont=='Y' || cont=='y') {
                continue;
            } else {
                break;
            }
        }
    }
}
