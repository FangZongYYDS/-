package 排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []a={14,26,88,4,2,66};
        Arrays.sort(a);//关键
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
