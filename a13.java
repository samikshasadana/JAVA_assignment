class a13{
public static void main(String arg[]){
    int i,j,f=1;
    for(i=10;i<=99;i++){
    for(j=2;j<=i-1;j++){
         if(i%j==0){
                          System.out.println(j);

                          System.out.println(i);

         f=0;
             }
    }
    if(f==1){
             System.out.println(i+" is a prime number");

    }}
    

}}