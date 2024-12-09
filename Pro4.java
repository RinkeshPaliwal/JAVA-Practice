import java.io.*;
class Pro4
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
       b=b+c;
      }
      System.out.print("Sum of digits of " +a +" = " +b);
     }
  catch(Exception e){
  }
 }
}
