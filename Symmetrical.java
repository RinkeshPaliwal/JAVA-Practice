import java.io.*;
class Symmetrical
{
 public static void main(String args[])
 {
  int i,j,k;
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
      System.out.println("Transpose of matrix x");
      k=0;
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        System.out.print(x[j][i]+"  ");
        if(x[i][j] == x[j][i])
        {
         k=k+1;
        }
       }
       System.out.println();
      }
      if(k==9)
      System.out.print("Therefore Matrix is Symmetrical");
      else
      System.out.print("Therefore Matrix is not Symmetrical");
     }
  catch(Exception e){
  }
 }
}

