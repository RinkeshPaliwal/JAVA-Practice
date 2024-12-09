import java.io.*;
class Array1
{
 public static void main(String args[])
 {
  int i,sum,avg,l,s;
  int x[] = new int[5];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.println("Enter values");
      for(i=0; i<5; i=i+1)
      {
       x[i]=Integer.parseInt(inp.readLine());
      }
      sum=0; avg=0; l=x[0]; s=x[0];
      for(i=0; i<5; i=i+1)
      {
       sum=sum+x[i];
       if(s>x[i])
       {
        s=x[i];
       }
       if(l<x[i])
       {
        l=x[i];
       }
      }
      avg=sum/5;
      for(i=0; i<5; i=i+1)
      {
       System.out.println(x[i]);
      }
      System.out.println("Sum=" +sum);
      System.out.println("Avg=" +avg);
      System.out.println("Smallest=" +s);
      System.out.println("Largest=" +l);
     }
  catch(Exception e){
  }
 }
}

      
      
      