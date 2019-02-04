import java.util.*;
class a2{
    public static void main(String arg[]){
        System.out.println("enter a number");
        Scanner o=new Scanner(System.in);
        int a,b;
        a=o.nextInt();
        b=o.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
    else{
            System.out.println(a+" is less than "+b);
    }
    }
}