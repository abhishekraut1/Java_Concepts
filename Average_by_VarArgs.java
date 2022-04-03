package com.company;

public class Average_by_VarArgs {
    static float avg(float ...a){
        float sum=0;
        for(int i=0;i<a.length;i++)
          sum=sum+a[i];
        return sum/a.length;
    }
    public static void main(String[] args) {
        System.out.println(avg(1,2,3,5,0));
    }
}
