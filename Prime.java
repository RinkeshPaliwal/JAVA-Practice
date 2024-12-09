import java.io.*;
class Prime 
{
 public static void main(String args[])
 {
  int a,n,b;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.print("Enter a=");
      a=Integer.parseInt(inp.readLine());
      n=1; 
      b=0;
      while(n<a/2)
      {
       n=n+1;
       if(a%n==0)
       {
        b=b+n;
       }
      }
      if(b==0)
      {
       System.out.print(a +" is a prime number ");
      }
      else
      {
       System.out.print(a +" is not a prime number ");
      }
     }
  catch(Exception e){
  }
 }
}
