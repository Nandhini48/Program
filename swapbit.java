public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int a=5,b=7;
  
     a=a^b;
     b=a^b;
        
     a=a^b;
        System.out.println(""+a);
        System.out.println(""+b);        
    }