package com.company;

public class Occurrences_of_elements_in_string {
    public static int first = -1;
    public static int last = -1;

    public static void findElement(String str, char element, int index) {
        if (index == str.length()) {
            if(first!=-1 && last==-1){
                last=first;
            }
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(index) ==element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findElement(str,element,index+1);
    }
    public static void main(String[] args) {
        String str = "Abhishek";
        findElement(str,'k',0);
    }
}
