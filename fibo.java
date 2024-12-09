class fibo
{
 public static void main(String args[])
 {
  int a,b,c;
  a=-1;
  b=1;
  do{
     c=a+b;
     a=b;
     b=c; 
     System.out.println(c);
    }
  while(c<100);
 }
}
    
  
  
  
  
 