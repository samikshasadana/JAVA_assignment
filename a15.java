import java.util.*;
class a15{
public static void main(String arg[]){
    Scanner o=new Scanner(System.in);
    int n=o.nextInt();
    int a,r,sum=0;
    while(n>0){
        r=n%10;
        sum=sum+r;
        n=n/10;
}
           System.out.println(sum);

}}