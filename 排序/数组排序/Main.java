package 排序.数组排序;
//lambda 表达式 从大到小
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer [] a = {14, 26, 88, 4, 2, 66};
        Arrays.sort(a,((o1, o2) -> o2-o1));//关键
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}