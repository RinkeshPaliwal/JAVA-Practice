import java.io.*;
class Mat3x3
{    
 public static void main(String args[])
 {
  int i,j,k;
  int x[][] = new int[3][3];
  int y[][] = new int[3][3];
  int z[][] = new int[3][3];  
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.println("Enter values of arr x and y");
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        x[i][j] = Integer.parseInt(inp.readLine());
       }
      }
      System.out.println();
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        y[i][j] = Integer.parseInt(inp.readLine());
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
      System.out.println("Matrix 2:");
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        System.out.print(y[i][j]+"  ");
       }
       System.out.println();
      }
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        z[i][j]=0;
        for(k=0;k<3;k++)
        {
         z[i][j] = z[i][j] + x[i][k]*y[k][j];
        }
       }
      }
      System.out.println("Product of the matrices is:");
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        System.out.print(z[i][j]+"  ");
       }
       System.out.println();
      }
     }
  catch(Exception e){
  }
 }
}

