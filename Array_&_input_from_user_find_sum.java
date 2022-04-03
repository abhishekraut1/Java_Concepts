import javax.swing.*;
class Sum
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        for( int i=0;i<a.length;i++)
        {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the value for array"+i));
        }
        int s=0;
        for(int i=0;i<a.length;i++)
        {
          s=s+a[i];
        }
        System.out.println("Sum of first 5 numbers = "+s);
    }         
}