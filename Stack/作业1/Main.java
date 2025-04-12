package Stack.作业1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n=sc.nextInt();
            if (n != 0) {
            stack.push(n);
            }
            else
                break;
        }
        sc.close();
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}