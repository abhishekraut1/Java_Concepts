class Nestedif
{
public static void main(String args[]) 
{ 
int a=100,b=30,c=50,s;
s=a+b+c;
if(s==180)
{
System.out.println("Triangle can be formed"); 

if(a==90||b==90 || c==90)
System.out.println("Right angle triangle can be formed"); 

if(a==b || b==c || c==a)
System.out.println("Isosceles triangle can be formed");

if(a==60 && b==60 && c==60) 
System.out.println("Equilateral triangle can be formed");

if(a>90 || b>90 || c>90)
System.out.println("obtuse Angle triangle can be formed");
} 
else
{
System.out.println("Triangle can not be formed");
}
}
}