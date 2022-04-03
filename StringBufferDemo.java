package com.company;

class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        System.out.println("Initial capacity: "+sb.capacity());
        System.out.println("String appended: "+sb.append("Dogs bark at night")); //it adds string "Dogs bark at night" at existing string
        System.out.println("String replaced: "+sb.replace(10,13,"NEW"));
        System.out.println("String reverse: "+sb.reverse());
        System.out.println("Current capacity: "+sb.capacity());
        sb.setCharAt(5,'A');
        System.out.println("After setting char 'A' at position 5: "+sb);
    }
}
