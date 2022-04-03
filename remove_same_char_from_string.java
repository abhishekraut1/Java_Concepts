package com.company;

//Time Complexity = O(n)
public class remove_same_char_from_string {
    public static boolean[] map= new boolean[26]; //initially all are false
    public static void removeSame(String str,int index,String newString){
            if(index==str.length()){
            System.out.println(newString);
            return;
        }
        if(!map[str.charAt(index)-'a']){ // i.e map[str.charAt(index)-'a'] == false
            newString+=str.charAt(index);
            map[str.charAt(index)-'a'] = true;// update that as true
            removeSame(str,index+1,newString);
        }else{
            removeSame(str,index+1,newString);
        }
    }
    public static void main(String[] args) {
        removeSame("abbccda",0,"");
    }
}
