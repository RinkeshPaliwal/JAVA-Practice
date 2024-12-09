import java.io.*;
class Factorial
{
 public static void main(String args[])
 {
  int a,b,fact;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      b=0;
      fact=1;
      System.out.print("Enter the Number=");
      a=Integer.parseInt(inp.readLine());
      while(b<a)
      {
       b=b+1;
       fact=fact*b;
      }
      System.out.print("factorial of " +a +" = " +fact);
     }
  catch(Exception e){
  }
 }
}

