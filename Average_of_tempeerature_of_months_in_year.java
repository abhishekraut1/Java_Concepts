import java.io.*;
class Average
{
    public static void main(String args[])
{
    int temp[] = {24,44,33,43,29,32,34,40,28,37,30,25};
    System.out.print("Temperatures of 12 months are ");
     for(int i=0;i<12;i++)
        System.out.print(temp[i]+" ");
        int s=0;
        float avg;
     for(int i=0;i<12;i++)
         s=s+temp[i];
        avg=s/12;
     System.out.print("\nAverage of temperatures = "+avg);
}}