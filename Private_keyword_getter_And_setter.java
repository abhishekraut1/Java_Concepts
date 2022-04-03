package com.company;
class Employee {
    private String name;
    private int id;
    //getter and setter are used to access private String , int,etc
    public void setName(String n){
       name = n;
        //OR use this.name = name
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
public class Private_keyword_getter_And_setter {
    public static void main(String[] args) {
        Employee harry = new Employee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("Abhishek");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}