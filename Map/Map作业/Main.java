package Map.Map作业;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer>map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int C=sc.nextInt();
        int arr[]=new int[N];
        for (int i=0;i<N;i++){
           arr[i]=sc.nextInt();
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        long res=0;
        for(int i=0;i<N;i++){
            int b=arr[i]-C;
            res+=map.getOrDefault(b,0);
        }
        System.out.println(res);
    }
}
