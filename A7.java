import java.io.*;
class A7
{
 public static void main(String args[])
 {
  int i,j,k;
  char x[] = new char[30];
  DataInputStream inp = new DataInputStream(System.in);
  try{
      i=-1;
      do{
         i++;
         x[i] = (char)System.in.read();
        }
      while(x[i]!='\r');
      
      i=-1;
      j=0;
      k=-1;
      do{
         i++;
         if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u'||x[i]=='A'||x[i]=='E'||x[i]=='I'||x[i]=='O'||x[i]=='U')
         {
          j=j+1;
         }
         else
         {
          k++;
          if(x[i]==' ')
          {
           k=k-1;
          }
         }
        }
      while(x[i]!='\r');
      System.out.println("Number of vowels =" +j);
      System.out.print("Number of consonants =" +k);
     }
  catch(Exception e){
  }
 }
}