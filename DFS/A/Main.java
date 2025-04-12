package DFS.A;
import java.util.*;
public class Main {
    static List<List<Integer>>list=new ArrayList<>();
    public void dfs(int n,int[]v ,List<Integer>t){
        if(t.size()==n){
            list.add(new ArrayList<>(t));
            return;
        }
        for(int i=1;i<=n; i++){
            if(v[i]==1)continue;
            v[i]=1;
            t.add(i);
            dfs(n,v,t);
            t.remove(t.size()-1);
            v[i]=0;
        }
    }

    public static void main(String[] args) {
        Main m=new Main();
        int n=3;
        int []v=new int [n+1];
        List<Integer>t=new ArrayList<>();
        m.dfs(n,v,t);
        for(List<Integer> res:list){
            System.out.println(res);
        }
    }
}
