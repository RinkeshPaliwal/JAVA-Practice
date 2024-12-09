import java.io.*;
class CommissionChart
{
 public static void main(String args[])
 {
  int i,j;
  String Agent[] = new String[5];
  float Sale[] = new float[5];
  float Commission[] = new float[5];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      for(i=0,j=1;i<5;i++,j++)
      {
       System.out.print("Enter name of Agent " +j +" = ");
       Agent[i] = inp.readLine();
       System.out.print("Enter sale of the Agent(Rs) = ");
       Sale[i] = Integer.parseInt(inp.readLine());
       if(Sale[i]<5000)
       {
        Commission[i] = 0;  
       }
       if(Sale[i]>=5000 && Sale[i]<10000)
       {
        Commission[i] = 5.0f/100.0f*Sale[i];
       }
       if(Sale[i]>=10000 && Sale[i]<20000)
       {
        Commission[i] = 10.0f/100.0f*Sale[i];
       }
       if(Sale[i]>=20000)
       {
        Commission[i] = 20.0f/100.0f*Sale[i];
       }
      }
      System.out.println();
      System.out.println("Sr.      Name of Agent      Sale(Rs)      Commission(Rs)");
      for(i=0,j=1;i<5;i++,j++)
      {
       System.out.format("%-5d",j);
       System.out.format("%15s",Agent[i]);
       System.out.format("%15.2f",Sale[i]);
       System.out.format("%15.2f",Commission[i]);
       System.out.println();
      }      
     }
  catch(Exception e){
	System.out.println(e.getMessage());
  }
 }
}
  
