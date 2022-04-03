package com.company;

import java.util.Scanner;
class Codechef_LISTLIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int operation=-1,g;
        while(test -- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int [] count = new int[n];
            g = count[0];
           // int g=count[0];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                 if(arr[i]==arr[j])
                     count[i]++;
            }
            for(int i=0;i<n;i++) {

                if(count[i]>g)
                    g = count[i];
            }
            if(g==0)
                System.out.println("-1");
            else if(g==1)
                System.out.println(g);
            else
            System.out.println(g+1);
        }
    }
}
