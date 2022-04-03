class InherTest
{ 
int a, b, c;
InherTest()
{
a=20;
b=25;
}
void add () {
c=a+b; System.out.println("addition is: "+c);
}
}
class InherTest2 extends InherTest
{
int d;
void multi(){
d= a*b;
System.out.println("multiplication is: "+d);
}
public static void main(String args[])
{ 
InherTest I = new InherTest();
 I.add();
 
InherTest2 I2 = new InherTest2(); 
I2.multi();
}
}