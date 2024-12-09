import java.io.*;
class Armstrong
{
 public static void main(String args[])
 {
  int a,n,b,c;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.print("Enter a=");
      a=Integer.parseInt(inp.readLine());
      n=a;
      c=0;
      b=0;
      while(n>0)
      {
       c=n%10;
       n=n/10;
       b=b + c*c*c;
      }
      System.out.println("Sum of cube of digits of " +a +" = " +b);
      if(b==a)
      {
       System.out.print("It is a Armstrong number.");
      }
      else
      {
       System.out.print("It is not a Armstrong number.");
      }
     }
  catch(Exception e){
  }
 }
}
