package 最值求平均;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        int min=100,max=0;
        double sum=0;
        for(int i=0;i<n;i++){
            int x=scan.nextInt();
            sum+=x;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.printf(".2f",sum/n);
    }
}