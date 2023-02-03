import java.util.*;
class Main {
  public static void main(String[] args) {

    System.out.println("Enter the numbers to find LCD");
    Scanner sc =new Scanner(System.in);

    int a=sc.nextInt();
    int b=sc.nextInt();

    int ans=(a*b)/gcd(a,b);
    
    System.out.println("LCD of the "+a+" and "+b+" is : \n"+ans);
  }

  public static int gcd(int a ,int b)
  {
    if(b==0)return a;

    return gcd(b,a%b);
  }
}