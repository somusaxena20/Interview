package Problem;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2 || n % 2 == 1)
            System.out.println("NO");
        else
            System.out.println("YES");
        sc.close();
    }
}
