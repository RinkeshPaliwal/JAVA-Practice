import java.io.*;
class Swap1
{
 public static void main(String args[])
 {
  int a,b,c;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.print("Enter a=");
      a=Integer.parseInt(inp.readLine());
      System.out.print("Enter b=");
      b=Integer.parseInt(inp.readLine());
      c=a;
      a=b;
      b=c;
      System.out.print(" After swapping a = " +a +" and " +" b = " +b );
     }
  catch(Exception e){
  }
 }
}
