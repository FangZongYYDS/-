package 哈希表知识点;
import java.util.*;
public class Main {
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        Set<Integer> set=new HashSet<>();//创建一个int的哈希表
        set.add(1);
        boolean A=set.add(1);//哈希表的元素不可重复
        System.out.println(A);
        set.remove(1);
        Boolean B=set.contains(1);
        System.out.println(B);
        set.clear();//清楚哈希表所有元素
    }
}
