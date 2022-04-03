// Program to find Maximum of Three numbers using Nested-If
class NestedIf
 {
   public static void main(String args[])
   { 
    int a=34,b=56,c=33;
    int max;
    if(a>b)
    {
      if(a>c)
      max=a;
      else
      max=c;
      }
      else
      {
       if(b>c)
       max=b;
       else
       max=c;
       }
       System.out.println("Largest number: "+max);
       }}