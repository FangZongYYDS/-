package 哈希表知识点.不可重复的数;

import java.util.*;
public class Main {

    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        int n =scan.nextInt();
        for(int j=0;j<n;j++){
            int m=scan.nextInt();
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<m;i++){
                int k=scan.nextInt();
                if(set.add(k))
                {System.out.print(k+" ");}
           }
            System.out.println();
        }
    }
}