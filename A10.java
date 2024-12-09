import java.io.*;
class A10
{
 public static void main(String args[])
 { 
  String Item[] = new String[5];
  int Rate[] = new int[5];
  int Quantity[] = new int[5];
  int Amount[] = new int[5];
  int i,j,k,q;
  DataInputStream inp = new DataInputStream(System.in);
  try{
      for(i=0,j=1,k=0,q=0;i<5;i++,j++)
      {
       System.out.print("Enter Item no "+j +" = ");    
       Item[i] = inp.readLine();
       System.out.print("Enter its rate = ");
       Rate[i] = Integer.parseInt(inp.readLine());
       System.out.print("Enter its quantity = ");
       Quantity[i] = Integer.parseInt(inp.readLine());
       Amount[i] = Rate[i]*Quantity[i];
       k = k+Amount[i];
       q = q+Quantity[i];
      }
      System.out.println();
      System.out.println("Sr.      Item          Rate          Quantity          Amount");
      for(i=0,j=1;i<5;i++,j++)
      {
       System.out.format("%-8d",j);
       System.out.format("%-15s",Item[i]);
       System.out.format("%-15d",Rate[i]);
       System.out.format("%-15d",Quantity[i]);
       System.out.format("%-15d",Amount[i]);
       System.out.println();
      }
      System.out.print("                                Total=" +q +"         Total=" +k);
     }
  catch(Exception e){
  }
 }
} 
       