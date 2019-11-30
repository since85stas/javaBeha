package com.company;

public class OddCheck {
    public static void main(String[] args) {
       boolean b = isOdd(10);
        boolean b1 = isOdd(11);
        boolean b2 = isOdd(-11);
    }

    public static boolean isOdd(int i) {
        return i % 2 ==1;
    }
}
