import java.io.*;
class Power
{
 public static void main(String args[])
 {
  int a,b,p,w;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      b=0;
      w=1;
      System.out.print("Enter base value=");
      a=Integer.parseInt(inp.readLine());
      System.out.print("Enter power=");
      p=Integer.parseInt(inp.readLine());
      while(b<p)
      {
       b=b+1;
       w=a*w;
      }
      System.out.print(a +" to the power " +b +" = " +w);
     }
  catch(Exception e){
  }
 }
}

