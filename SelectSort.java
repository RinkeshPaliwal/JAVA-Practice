import java.io.*;
class SelectSort
{
 public static void main(String args[])
 {
  int i,j,k;
  int x[]=new int[5];
  DataInputStream in = new DataInputStream(System.in);
  try{
      System.out.println("Enter values for sorting");
      for(i=0;i<5;i++)
      { 
       x[i]=Integer.parseInt(in.readLine());
      }
      System.out.println();
      for(i=0;i<4;i++)
      {
       for(k=4;k>0;k--)
       {
        if(x[k]<x[k-1])
        {
         j=x[k];
         x[k]=x[k-1];
         x[k-1]=j;
        }
       }
       System.out.println();
      }
      for(i=0;i<5;i++)
      {
       System.out.println(x[i]);
      }
     }
  catch(Exception e){
  }
 }
}
 

    
  