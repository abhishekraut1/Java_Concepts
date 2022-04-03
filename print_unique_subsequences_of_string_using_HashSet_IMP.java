package com.company;

//Time Complexity = O(2^n)
import java.util.HashSet;
public class print_unique_subsequences_of_string_using_HashSet_IMP {
    public static void printSub(String str,int index,String newString,HashSet<String>set){
        //base condition
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        //1st condition: add the char
        printSub(str,index+1,newString+str.charAt(index),set);
        //2nd condition: doesn't add the char
        printSub(str,index+1,newString,set);
    }
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<>();
        String str = "aaa";
        printSub(str,0,"",set);
    }
}
