import java.util.*; //Here method names are same
 class Worker       //but they can be call by
{
  
  double wages;      //using respective value
 double w_days;
 void setdata(int w,int d)
 {
   wages = w;
   w_days = d;
  }
 void setdata(int d)
 {
   wages = 1000;
   w_days = d;
  }
  void setdata(double w)
  {
    wages  = w;
    w_days = 10;
   }
   double payment()
   {
     double p = wages * w_days;
     return p;
    }
   public static void main(String args[])
   { 
     Worker w1 = new Worker();
    w1.setdata(30);
    System.out.println("Payment of worker: "+w1.payment());
       
         w1.setdata(1000,15);
    System.out.println("Payment of worker: "+w1.payment());
       
       w1.setdata(2000d);
      System.out.println("Payment of worker: "+w1.payment());
   }
 }
