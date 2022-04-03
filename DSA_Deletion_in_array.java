package com.company;
//Time Complexity = O(n)
public class DSA_Deletion_in_array {
        //Deletion
        void deleteArray(int[] a, int index, int size, int capacity){
            if(size>=capacity)
                System.out.println("out of bound");
            else
                for(int i=index;i<size-1;i++) {
                    a[i] = a[i + 1];
                }
        }
        void display(int []a,int size){
            //Traversal to print array
            for(int i=0;i<size;i++)
                System.out.print(a[i]+", ");
        }
        public static void main(String[] args) {
            int []a = new int[50];
            a[0] =3; a[1] =84; a[2] =40; a[3] =29; a[4] =55;
            int size=5,capacity=50,index=3;
            DSA_Deletion_in_array o = new DSA_Deletion_in_array();
            o.deleteArray(a,index,size,capacity);
            size--;
            o.display(a,size);
        }
    }