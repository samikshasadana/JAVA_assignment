import java.util.*;
class a20{
public static void main(String arg[]){
    int choice;
    System.out.println("Press 1 for addition and press 2 for subtraction");
    int a,b,c;
    Scanner o=new Scanner(System.in);
    choice=o.nextInt();
    a=o.nextInt();
    b=o.nextInt();
    if (choice==1)
    {   c=a+b;
        System.out.println("Addition of numbers is "+c);
    }
    else if (choice==2)
    {    c=a-b;
            System.out.println("Subtraction of numbers is "+c);
}
    String s;
    char y;
    s=o.next();
    y=s.charAt(0);
    while(y=='y'||y=='Y'){
            System.out.println("Press 1 for addition and press 2 for subtraction");
    choice=o.nextInt();
    a=o.nextInt();
    b=o.nextInt();
    if (choice==1)
    {    c=a+b;
            System.out.println("Addition of numbers is "+c);
}
    else if (choice==2)
    {   c=a-b;
            System.out.println("Subtraction of numbers is "+c);
}
    s=o.next();
    y=s.charAt(0);
    }
}}