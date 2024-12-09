import java.io.*;
class Pro3
{
 public static void main(String args[])
 {
  float a,b,l,s,Avg,Sum;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.print("Enter a=");
      a=Float.parseFloat(inp.readLine());
      l=a;
      s=a;
      b=0;
      Sum=a;
      do{
         System.out.print("Enter value of a=");
         a=Float.parseFloat(inp.readLine());
         if(s>a && a!=0)
         {
          s=a;
         }
         if(l<a && a!=0)
         {
          l=a;
         }
         b=b+1;
         Sum=Sum+a;
        }
      while(a!=0);
      Avg=Sum/b;
      System.out.println("Sum=" +Sum);
      System.out.println("Avg=" +Avg);
      System.out.println("Smallest=" +s);
      System.out.println("Largest=" +l);
     }
  catch(Exception e)
  {
  }
 }
}
  