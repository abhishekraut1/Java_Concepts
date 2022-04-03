package com.company;

//Time Complexity = O(n!) *******************************************
public class find_permutation_of_string_MIMP {
    public static void printPerm(String str,String permutation){
        if(str.length()==0){ //base case
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            String newString = str.substring(0,i) + str.substring(i+1);
            printPerm(newString,permutation + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str,"");
    }
}
