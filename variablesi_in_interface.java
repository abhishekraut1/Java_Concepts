package com.company;

interface LimitTest{
    int LowerLimit = 0;
    int UpperLimit = 100;
}
class VariableTest implements LimitTest{
    void find(int a){
        if(a>0 && a<100)
            System.out.println("a lies between "+VariableTest.LowerLimit+" and "+VariableTest.UpperLimit);
            else
            System.out.println("a does not lies between "+VariableTest.LowerLimit+" and "+VariableTest.UpperLimit);
    }

    public static void main(String[] args) {
        VariableTest o = new VariableTest();
        o.find(8);
        o.find(190);
    }
}
