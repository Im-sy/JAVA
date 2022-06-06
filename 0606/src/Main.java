import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 111
        // Scanner input = new Scanner(System.in);
        // int kor = input.nextInt();
        // int eng = input.nextInt();
        // int math = input.nextInt();
        // int comp = input.nextInt();
        // System.out.printf("sum %d\n", kor+eng+math+comp);
        // System.out.printf("avg %d", (kor+eng+math+comp)/4);

        // 112
        // Scanner input = new Scanner(System.in);
        // int a = input.nextInt();
        // int b = input.nextInt();
        // System.out.printf("%d / %d = %d...%d", a, b, a/b, a%b);

        // 113
        // Scanner input = new Scanner(System.in);
        // int w = input.nextInt();
        // int h = input.nextInt();
        // int new_w = w + 5;
        // int new_h = h * 2;
        // System.out.printf("width = %d\n", new_w);
        // System.out.printf("length = %d\n", new_h);
        // System.out.printf("area = %d\n", new_w*new_h);

        // 114
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // int y = input.nextInt();
        // System.out.printf("%d %d\n", ++x, y--);
        // System.out.printf("%d %d", x, y);

        // 115
        // Scanner input = new Scanner(System.in);
        // int min_h = input.nextInt();
        // int min_w = input.nextInt();
        // input.nextLine();
        // int key_h = input.nextInt();
        // int key_w = input.nextInt();
        // System.out.printf("%s", (min_h>key_h) && (min_w>key_w));

        // 116
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // int y = input.nextInt();
        // int z = input.nextInt();
        // System.out.printf("%.1f", (x+y+z)/3.0);

        // 117
        // Scanner input = new Scanner(System.in);
        // double x = input.nextDouble();
        // double y = input.nextDouble();
        // double z = input.nextDouble();
        // System.out.printf("sum %d\n", (int) x+(int) y+(int) z);
        // System.out.printf("avg %d", (int) (x+y+z)/3);

        // 118
        // int a = 5;
        // a += 10;
        // System.out.println(a);
        // a -= 1;

        // 119
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int a = 0; 
        System.out.printf("%d ", a);
        a = cal.get ( java.util.Calendar.YEAR )-1900;
        System.out.printf("%d ", a);
        a += cal.get ( java.util.Calendar.MONTH );
        a += cal.get ( java.util.Calendar.DATE );
        System.out.printf("%d ", a);
    }
}
