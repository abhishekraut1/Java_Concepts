package com.company;

//Time Complexity = O(4^n) ************************
public class keypad_combination_IMP {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        String mapping = keypad[str.charAt(index) - '0']; //it will give string at that index
        for(int i=0;i<mapping.length();i++){
            printComb(str,index+1,combination+mapping.charAt(i)); //NOTE
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str,0,"");
    }
}
