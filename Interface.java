interface A
{
   void showA();
}  
interface B extends A
{ 
  void showB ();
 }
class InDemo implements B {
  public void showA()
{
System.out.println("ShowA method");
}
public void showB ()
{
System.out.println("ShowB method"); 
}
public static void main(String[] args)
{
InDemo I =new InDemo();
I.showA();
I.showB ();
}
}