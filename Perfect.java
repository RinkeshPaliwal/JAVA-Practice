import java.io.*;
class Perfect
{
 public static void main(String args[])
 {
  int a,n,b;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.print("Enter a=");
      a=Integer.parseInt(inp.readLine());
      n=0; 
      b=0;
      while(n<a/2)
      {
       n=n+1;
       if(a%n==0)
       {
        b=b+n;
       }
      }
      if(a==b)
      {
       System.out.print(a +" is a perfect number ");
      }
      else
      {
       System.out.print(a +" is not a perfect number ");
      }
     }
  catch(Exception e){
  }
 }
}
