
class Rectangle
{
    float length,width;
     void attributes(float l,float w)
    {
        length=l; 
        width=w;
        if(0.0<=l & l>=2.0)
        {
        length=l=0;
        width=w=0;
        }
        if(0.0<=w & w>=2.0)
        {
          length=l=0;
        width=w=0;
        }
    }
    void area()
    {
       float A = length*width;
        System.out.println("Area of Rectangle = "+A);
    }
    float perimeter()
    {
        float P = 2*(length+width);
        return P;
    }
    public static void main(String args[])
    {
        Rectangle r2 = new Rectangle();
        r2.attributes(1.966f,1.0f);
        r2.area();
        
        r2.perimeter();
        System.out.println("Perimeter of Rectangle = "+r2.perimeter());
    }
}