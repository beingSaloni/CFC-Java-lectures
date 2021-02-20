package com.company.lecture9;

public class StringBuilderintro {
    public static void main(String[] args) {
        String string = "Ekta";
        StringBuilder Sb = new StringBuilder("Ekta");
//        for (int i = 0; i < 10000000; i++) {
//            string = string + "a";
//
//        }
//        System.out.println(string);
        for (int i = 0; i < 10000000; i++) {
            Sb.append("a");

        }
        System.out.println(Sb);
    }
}
