import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;


public class Framework {
    public static void main(String[] args) {
        new Framework().run();
}

    private void run() {
        Scanner scan = new Scanner(System.in);
        ArrayList AL = new ArrayList();

        System.out.println("Введите кол-во параллепипедов");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            AL.add(read(scan));
        }

        sort(AL);

        for (Object obj : AL) {
            System.out.println(obj);
        }
    }

    private boolean control(int a, int b, int c) {
        return a > 0 & b > 0 & c > 0;
    }

    private void sort(ArrayList AL) {
        Comparator C = new MyComparator();
        Collections.sort(AL, C);
    }

    private Parallelepiped read(Scanner s) {
        int a = 0;
        int b = 0;
        int c = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Введите длину, ширину, высоту ");
            System.out.print("a = ");
            a = s.nextInt();
            System.out.print("b = ");
            b = s.nextInt();
            System.out.print("c = ");
            c = s.nextInt();
            if (control(a, b, c)) {
                flag = false;
            } else {
                System.out.println("Значения должны быть больше нуля");
            }
        }
        return new Parallelepiped(a, b, c);
    }
}

