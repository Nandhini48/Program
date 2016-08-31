public class Swap {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter three numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
   if(a>b&&a>c){
       System.out.println("a is greatest "+a);
   }else if(b>a&&b>c){
       System.out.println("b is greater "+b);
   }else if(c>a&&c>b){
       System.out.println("c is greatest "+c);
   }
  }