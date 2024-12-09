import java.io.*;
class A5
{
 public static void main(String args[])
 {
  int i,j,k,l;
  char x[] = new char[30];
  try{
      i=-1;
      l=-1;
      do{
         i++;
         l++;
         x[i] = (char)System.in.read();
        }
      while(x[i]!='\r');
      
      System.out.print("String = ");
      for(i=0;x[i]!='\r';i++)
      {
       System.out.print(x[i]);
      }
      System.out.println();

      i=-1;
      j=l;
      k=0;
      System.out.println("Reverse of String:");
      do{
         i=i+1;
         j=j-1;
         System.out.print(x[j]);
         if(x[i] == x[j])
          k++;
        }
      while(j!=0);
      System.out.println();

      if(k==l)
      {
       System.out.print("String is Pallindrome");
      }
      else
      {
       System.out.print("String is not Pallindrome");
      }
     }
  catch(Exception e){
  }
 }
}
  
