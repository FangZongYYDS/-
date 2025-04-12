package Stack;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());//查看栈顶元素
        while(!stack.isEmpty()){
            System.out.println(stack.pop());//移除顶部元素并且返回他
        }
        System.out.println(stack.isEmpty());
    }
}
