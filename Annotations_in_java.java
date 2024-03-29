package com.company;

@FunctionalInterface //It means below Interface contains only one method
interface myFunctionalInterface {
    void method1();
//    void method2(); --> throws error
}

class KeyPadPhone{
    @Deprecated ///****
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone{
    @Override ///****
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

public class Annotations_in_java {
    public static void main(String args[]){
        @SuppressWarnings("deprecation") ///****
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
    }
}