package List集合;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();//创建列表
        list.add(10);// add方法
        list.add(15);
        list.add(100);
        System.out.println(list.size());//size方法返回长度
        System.out.println(list.get(0));//int index
    }
}
