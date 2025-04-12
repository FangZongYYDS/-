package 排序.列表排序;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.sort(list,(o1,o2)->o2-o1);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
