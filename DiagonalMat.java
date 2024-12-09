import java.io.*;
class DiagonalMat
{
 public static void main(String args[])
 {
  int i,j;
  int x[][] = new int[3][3];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.println("Enter values of arr x");
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        x[i][j] = Integer.parseInt(inp.readLine());
       }
      }
      System.out.println("Matrix 1:");
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        System.out.print(x[i][j]+"  ");
       }
       System.out.println();
      }
      System.out.println("Diagonal matrix of x");
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        if(i==j)
        System.out.print(x[i][j]+" ");
        else
        System.out.print("0"+" ");
       }
       System.out.println();
      }
     }
  catch(Exception e){
  }
 }
}

