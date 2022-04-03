package com.company;

   class Sum{
    public static void main(String args[]) {
        int [][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        Sum a = new Sum();
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
