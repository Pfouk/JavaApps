package com.os.ileschinsky.anonimous;

public class AnonymousMain {
    public static void main(String[] args) {
        Service service = new Service() {
            @Override
            public void service1() {
                System.out.println("Anon serv 1");
            }

            @Override
            public void service2() {
                System.out.println("Anon serv 2");
            }
        };
        service.service1();
        service.service2();
    }
}
