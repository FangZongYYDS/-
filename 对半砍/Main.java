package 对半砍;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();

        while (x > 0) {
            System.out.print(x+" ");
            x /= 2;

        }
    }
}

