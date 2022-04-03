package com.company;

//Time Complexity = O(2^n)
public class print_subsequences_of_string {
    public static void printSub(String str,int index,String newString){
        //base condition
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        //1st condition: add the char
        printSub(str,index+1,newString+str.charAt(index));
        //2nd condition: doesn't add the char
        printSub(str,index+1,newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSub(str,0,"");
    }
}
