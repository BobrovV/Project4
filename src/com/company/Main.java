package com.company;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        a.a();

        A b = new A() {
            @Override
            void a() {
                System.out.println("hi from Anonym");            }
        };

        b.a();


    }
}
