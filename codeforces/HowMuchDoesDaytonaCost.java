import java.util.*;
public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            boolean flag=false;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==k){
                    flag=true;
                }
            }
            System.out.println(flag?"YES":"NO");
        }}}
