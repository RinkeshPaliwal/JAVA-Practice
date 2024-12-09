import java.io.*;
class Calculator
{
 public static void main(String args[])
 {
  DataInputStream in = new DataInputStream(System.in);
  int a,b,d;
  char c,f;
  try
     {
      do{
         d=0;
         in.readLine();
         System.out.println("A.Add");
         System.out.println("S.Sub");
         System.out.println("M.Multiply");
         System.out.println("D.Div");
         System.out.println("X.Exit"); 
         System.out.print("Enter value=");
         a=Integer.parseInt(in.readLine());
         System.out.print("Enter value=");
         b=Integer.parseInt(in.readLine());
         System.out.print("Enter your choice(A,S,M,D,X)=");
         c=(char)System.in.read();
         switch(c)
         { 
          case 'a':
          case 'A':
                   d=a+b;
                   System.out.println(d);
                   break;
          case's':
          case'S':
                  d=a-b;
                  System.out.println(d);
                  break;
          case'm':
          case'M':
                  d=a*b;
                  System.out.println(d);
                  break;
          case'd':
          case'D':
                  d=a/b;
                  System.out.println(d);
                  break;
          case'x':
          case'X':
                  System.out.print("Wrong choice");
        }
        System.out.println("Any more(Y/N)");
        in.readLine();
        f=(char)System.in.read();
       }
       while(f=='y' || f=='Y');
      }
  catch(Exception e){
  }
 }
}

    
      
         
  