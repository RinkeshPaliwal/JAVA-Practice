import java.io.*;
class Two_Darr
{
 public static void main(String args[])
 {
  int i,j,k;
  int x[][]=new int[3][3];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        System.out.print("Enter values = ");
        x[i][j]=Integer.parseInt(inp.readLine());
       }
      }
      for(i=0;i<3;i++)
      {
       for(j=0;j<3;j++)
       {
        System.out.print(x[i][j]);
       }
       System.out.println();
      }
     }
  catch(Exception e){
  }
 }
}
 
 
      
  
