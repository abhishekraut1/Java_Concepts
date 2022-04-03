package com.company;

  class Method_overloading_1 {
      int multiply(int a, int b) {
          return a * b;
      }

     int multiply(int a, int b, int c) {
          return a * b * c;
      }}
      class a{
        public static void main(String[] args) {

            Method_overloading_1 obj = new Method_overloading_1();
            int c = obj.multiply(5,4);
            int d = obj.multiply(5,4,3);
            System.out.println(c);
            System.out.println(d);

        }
      }
