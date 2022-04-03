class Motorvehicle       //Superclass method can be call by using subclass object
{                        //But subclass method can be call by using superclass object
    int maxspeed,modelyear,noOfPassenger;
    String modelname;
    Motorvehicle()
    {
        modelname = "M20";
        modelyear = 2006;
        noOfPassenger = 2;
         maxspeed = 200;
    }
    void display()
    {
      System.out.println("Modelname of Motor vehicle is "+modelname);
      System.out.println("Modelyear of Motor vehicle is "+modelyear);
      System.out.println("Maxspeed speed of Motor vehicle is "+maxspeed);
      System.out.println("No Of Passenger in motor vehicle is"+noOfPassenger);
    }
}
class Bike extends Motorvehicle
{
boolean kickstart;
boolean bottonstart;
Bike()
{
kickstart = true;
bottonstart = false;
}
void dis()
{
System.out.println("Bike has Kickstart feature = "+kickstart+" and \nBottonstart feature = "+bottonstart);
}
public static void main(String args[])
{
Motorvehicle m = new Motorvehicle();
m.display();
    
Bike b = new Bike();    
b.dis();
}
}