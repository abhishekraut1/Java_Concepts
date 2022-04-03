class Pattern
{
  public static void main(String args[])
  {
  System.out.println("1) Star Pattern:\n");
  int i,j,n=5,d,st=1;
  for(i=0;i<6;i++)
  {
  for(j=0;j<n;j++)
  {
   System.out.print("*");
  }
   n++;
  System.out.println(" ");
  }
   
  
  System.out.println("2) Star Pattern:\n");
  for(i=0;i<6;i++)
  {
  for(j=0;j<n;j++)
  {
   System.out.print("\b");
  }
  for(d=0;d<st;d++){
  System.out.print("*");
  }
   st++;
   n--;
  System.out.println();
  }
  

  System.out.println("3) Star Pattern:\n");
  for( i=0;i<5;i++)
  {
  for(j=0;j<=i;j++)
  {
   System.out.print("*");
  }
  System.out.println(" ");
  }
  
  int a[]={1,2,3,4,5}; //OR int[] a={1,2,3,4,5};
  System.out.println("1) Numbers Pattern:\n");
  for(i=0;i<5;i++)
  {
  for(j=0;j<5;j++)
  {
   System.out.print(a[j]);
  }
  System.out.println();
  }
  
  int p=5;
  System.out.println("2) Numbers Pattern:\n");
  for(i=0;i<5;i++)
  {
  for(j=0;j<p;j++)
  {
   System.out.print(""+a[j]+"");
  }
  System.out.println();
  p--;
  }
  }
  }