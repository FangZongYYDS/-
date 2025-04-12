package 队列Queue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);//add 可以返回Boolean类型
        System.out.println(q.add(3));
        while (!q.isEmpty()){
            System.out.println(q.poll());//poll删除对头并返回其
            //peek 用于返回元素但是不删除
        }
    }
}
