package com.company;
class Final_Demo{
    final int Max = 100;
    final void show(final int x){
        System.out.println("super class show method "+x);
        System.out.println("super class show method "+Max);
    }
}
class Final_Demo1 extends Final_Demo{
    public static void main(String[] args) {
        Final_Demo1 ob = new Final_Demo1();
        ob.show(12);
    }}
/*/IMPORTANT
* Variables in abstract & interface are already(default) final hence we can't use final variables.
* We can create final Methods in abstract & interface.
 */