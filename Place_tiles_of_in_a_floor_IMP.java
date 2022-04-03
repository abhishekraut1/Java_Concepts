package com.company;
//Que. Place tiles of 1xm in a floor of size nxm and find total no. of methods.
public class Place_tiles_of_in_a_floor_IMP {
    public static int placeTiles(int n,int m){
        //base cases
        if(n==m){
            return 2;//only two methods
        }
        if(n<m) {//no. of rows < no. of columns
            return 1;//only one method
        }
        //vertical placement
        int verPlace = placeTiles(n-m,m);
        //horizontal placement
        int horPlace = placeTiles(n-1,m);
        return horPlace+verPlace;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int total = placeTiles(n,m);
        System.out.println(total);
    }
}
