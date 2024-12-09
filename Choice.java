import java.io.*;
class Choice
{
 public static void main(String args[])
 {
  int a,b,c,d;
  DataInputStream inp = new DataInputStream(System.in);
  System.out.println("1.Add");
  System.out.println("2.Sub");
  System.out.println("3.Mul");
  System.out.println("4.Div");
  try
     {
      System.out.print("Enter a=");
      a=Integer.parseInt(inp.readLine());
      System.out.print("Enter b=");
      b=Integer.parseInt(inp.readLine());
      System.out.print("Enter your choice(1,2,3,4)=");
      c=Integer.parseInt(inp.readLine());
      if(c==1)
      {
       d=a+b;
       System.out.print(d);
      }
      if(c==2)
      {
       d=a-b;
       System.out.print(d);
      }
      if(c==3)
      {
       d=a*b;
       System.out.print(d);
      }
      if(c==4)
      {
       d=a/b;
       System.out.print(d);
      }
     }
  catch(Exception e)
  {}
 }
}


