import javax.naming.ldap.ManageReferralControl;

public class Calculate {
  public int a, b;
 public int sum(int a, int b){

    return a+b;
 }
  
 public int sub(int a, int b){
    return a-b;
}
public int multi(int a, int b){
    return a*b;
}
 
public int div(int a, int b){
    return a/b;
}


    public static void main(String[] args) {
        Calculate cal= new Calculate();
     System.out.println("sum is: "+cal.sum(2, 5));
      System.out.println("sub is: "+ cal.sub(5, 7));
      System.out.println("multi is :"+cal.multi(10,2));
      System.out.println ("div is: "+ cal.div(20, 4));
  
       
    }
}