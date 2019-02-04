import java.util.*;
class a14{
public static void main(String arg[]){
    Scanner o=new Scanner(System.in);
    int n=o.nextInt();
    int i,f=1;
    if(n==0 || n==1){
    System.out.println(n+" is niether prime nor composite");
    }
    else{
    for(i=2;i<n-1;i++){
    if(n%i==0){
         System.out.println(n+" is not a prime number");
         f=0;
         break;}
    }
    if(f==1){
             System.out.println(n+" is a prime number");

    }
    }

}}