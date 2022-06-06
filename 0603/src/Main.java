import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 101
        // System.out.println("My name is Hong");

        // 102
        // System.out.println("My hometown");
        // System.out.println("Flowering mountain");

        // 103
        // System.out.println("TTTTTTTTTT");
        // System.out.println("TTTTTTTTTT");
        // System.out.println("    TT    ");
        // System.out.println("    TT    ");
        // System.out.println("    TT    ");

        // 104
        // System.out.println("kor 90");
        // System.out.println("mat 80");
        // System.out.println("eng 100");
        // System.out.printf("sum %d", 90+80+100);

        // 105
        // System.out.printf("%15s%15s%15s\n", "Seoul", "10,312,545", "+91,375");
        // System.out.printf("%15s%15s%15s\n", "Pusan", "3,567,910", "+5,868");
        // System.out.printf("%15s%15s%15s\n", "Incheon", "2,758,296", "+64,888");
        // System.out.printf("%15s%15s%15s\n", "Daegu", "2,511,676", "+17,230");
        // System.out.printf("%15s%15s%15s", "Gwangju", "1,454,636", "+29,774");

        // 106
        // int a = 10;
        // int b = 20;
        // int c = 30;
        // System.out.printf("%d + %d = %d", a, b, c);

        // 107
        // double a = 80.5;
        // double b = 22.34;
        // System.out.printf("%10.2f%10.2f%10.2f", a, b, a+b);

        // 108
        // int a = 50;
        // double b = 100.12;
        // System.out.printf("%.2f * %d = %.0f", b, a, a*b);

        // 109
        // Scanner input = new Scanner(System.in);
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int c = input.nextInt();
        // System.out.printf("sum = %d", a+b+c);

        // 110
        Scanner input = new Scanner(System.in);
        System.out.printf("yard? ");
        double yard = input.nextDouble();
        System.out.printf("%.1fyard = %.1fcm", yard, yard*91.44);
    }
}
