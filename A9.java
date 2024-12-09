import java.io.*;
class A9
{
 public static void main(String args[])
 {
  int i,j,k;
  char l;
  char x[] = new char[30];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      i=-1;
      k=-1;
      do{
         i++;
         k++;
         x[i] = (char)System.in.read();
        }
      while(x[i]!='\r');
      System.out.println("Length of String =" +k);        
      
      for(i=0;i<k;i++)
      {
       for(j=0;j<k;j++)
       {
        if(x[j]>x[j+1])
        {
         l=x[j];
         x[j]=x[j+1];
         x[j+1]=l;
        }
       }
      }
      

      for(i=0;i<=k;i++)
      {
       System.out.print(x[i]);
      }
      inp.readLine();
     }
  catch(Exception e){
  }
 }
}

      
        