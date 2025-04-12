package Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(1,2);
        map.put(10,66);
        //map.put(3,null);
        System.out.println(map.get(10));//map.get():return value of key
        System.out.println(map.size());//return the length
        int k=map.getOrDefault(3,-1);
        //如果找不到Key3则返回-1
        System.out.println(k);
    }
}
