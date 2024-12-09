import java.io.*;
class Array2
{
 public static void main(String args[])
 {
  int i,j,k;
  int x[] = new int[9];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      for(i=0;i<9;i=i+1)
      {
       System.out.print("Enter values=");
       x[i]=Integer.parseInt(inp.readLine());
      }
     k=-1;
     for(i=0;i<3;i=i+1)
     {
      for(j=0;j<3;j=j+1)
      {
       k=k+1;
       System.out.print(x[k]);
      }
      System.out.println();
     }
    }
  catch(Exception e){
  }
 }
}