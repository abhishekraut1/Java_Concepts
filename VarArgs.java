package com.company;

public class VarArgs {
    static int sum(int ...arr){   //Here ...arr is array
        int result = 0;                     //If I write sum(int a, int ...arr) then here one value is compulsory
        for(int i=0;i< arr.length;i++){     // i.e, I can't write sum()
            result += arr[i];
        }
            return result;
    }

    public static void main(String[] args) {
        System.out.println("sum = "+sum());
        System.out.println("sum = "+sum(3,9));
        System.out.println("sum = "+sum(3,9,8));
    }

}
