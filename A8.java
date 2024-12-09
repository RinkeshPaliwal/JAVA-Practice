import java.io.*;
class A8
{
 public static void main(String args[])
 {
  int i,j,k;
  char y;
  char x[] = new char[30];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      System.out.print("Enter string =");
      i=-1;
      do{
         i++;
         x[i] = (char)System.in.read();
        }
      while(x[i]!='\r');
      System.out.println();
      
      System.out.print("Enter any character of above string = ");
      inp.readLine(); 
      k=System.in.read();
      y=(char)k;
      System.out.println();
      
      i=-1;
      j=0;
      do{
         i++;
         if(x[i]==y)
            j++;
        }
      while(x[i]!='\r');
      System.out.print("Frequency = " +j);
     }
  catch(Exception e){
  }
 }
}