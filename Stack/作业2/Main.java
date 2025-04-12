package Stack.作业2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        char[] A = sc.next().toCharArray();
        boolean fa = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == '@')
                break;
            if (A[i] == '(')
                stack.add(1);
            if (A[i] == ')') {
                if (stack.isEmpty()) {
                    fa = false;
                } else stack.pop();
            }
        }
        if (!stack.isEmpty())
            fa = false;
        if (fa)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
