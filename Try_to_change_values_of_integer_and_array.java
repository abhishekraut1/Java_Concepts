package com.company;

public class Try_to_change_values_of_integer_and_array {
    static void change1(int x){
        x = 100;
    }
    static void change2(int []arr){
        arr[0] = 6778;
    }

    public static void main(String[] args) {
        int a = 89;
        change1(a);  //Here the value of integer a will NOT be change
        System.out.println("The value of a after changing : "+a);

        int [] marks = {7,4,2,7,8};
        change2(marks); //Here the value of marks[0] will be CHANGE
        System.out.println("The value of marks[0] after changing : "+marks[0]);
    }
}
