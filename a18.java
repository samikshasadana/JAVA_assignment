import java.util.*;
class a18{
public static void main(String arg[]){
    Scanner o=new Scanner(System.in);
    int n=o.nextInt();
    int a,r,n1=0;
    a=n;
    while(a>0){
        r=a%10;
        n1=(n1*10)+r;
        a=a/10;
        //System.out.println(n1);
}
    if(n==n1){
    System.out.println("pallindrome");
    }
    else
            System.out.println("not pallindrome");

}}