import java.io.*;
class Palindrome
{
 public static void main(String args[])
 {
  int a,n,c;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.print("Enter a=");
      a=Integer.parseInt(inp.readLine());
      n=a;
      c=0;
      while(n>0)
      {
       c=c*10 + n%10;
       n=n/10;
      }
      System.out.println("Reverse of " +a +" = " +c);
      if(a==c)
      {
       System.out.print("It is a palindrome number." );
      }
      else
      {
       System.out.print("It is not a palindrome number. ");
      }
     }
  catch(Exception e){
  }
 }
}