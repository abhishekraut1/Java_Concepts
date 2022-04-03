package com.company;
import java.util.Scanner;
public class Codechef_GRIDSQRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextLong();
        int i,j,size2 = 0;
        while (test-- > 0) {
            int n = sc.nextInt();
            int countofsize1=0, countofsize2=0;
            int[][] arr = new int[n+1][n+1];
            for (i = 1; i <=n; i++) {
                for (j = 1; j <=n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (i = 1; i <=n; i++) {
                for (j = 1; j <=n; j++) {

                    if (arr[i][j] == 1)
                        countofsize1++;
                    //if(row==i || column<i+1)
                   // if (n>1 && j==2 || n>1 && j<n)
                    if(n>1) {
                        if(n==2){
                            if (arr[1][1] == 1 && arr[1][2] == 1 && arr[2][1] == 1 && arr[2][2] == 1) {
                                countofsize2=1;
                                //System.out.println("   "+countofsize2);
                            }
                        }
                        else {
                            for(i=1;i<j;i++)

                               if (arr[i][j] == 1 && arr[i][j + 1] == 1 && arr[i + 1][j] == 1 && arr[i + 1][j + 1] == 1)
                                countofsize2++;
                            System.out.println(countofsize2);
                        }
                    }
                }
            }
            System.out.println((countofsize1+countofsize2));
        }
    }
}
//countofsize1+"+"+countofsize2 +" "+