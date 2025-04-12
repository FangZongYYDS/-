package 队列Queue.zuoye1996;
//n 个人围成一圈，从第一个人开始报数,
// 数到 m 的人出列，再由下一个人重新从 1 开始报数，数到 m 的人再出圈，
// 依次类推，直到所有的人都出圈，请输出依次出圈人的编号。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i=1;i<=n;i++){
            q.add(i);
        }
        int res=0;//x的傀儡
        while(!q.isEmpty()){
            int x=q.poll();
            res++;
            if(res==m){
                System.out.print(x+" ");
                res=0;
            }
            else q.add(x);
        }
    }
}
