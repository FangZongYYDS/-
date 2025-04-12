package 草稿;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 10_000_000; i >= 0; i--) {
            if (isCycle(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static boolean isCycle(int num) {
        List<Integer> list = new ArrayList<>();
        int temp = num;
        while (temp > 0) {
            list.add(temp % 10);
            temp /= 10;
        }
        int len = list.size();
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        list.add(sum);
        while (sum <= num) {
            if (sum == num) return true;
            sum = sum * 2 - list.remove(0);
            list.add(sum);
        }
        return false;
    }
}