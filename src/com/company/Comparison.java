package com.company;

public class Comparison {
    public static void main(String[] args) throws Exception {
      long x = Long.MAX_VALUE;
      double y = (double) Long.MAX_VALUE;
      long z = Long.MAX_VALUE - 1;

        System.out.println((x==y) );
        System.out.println((y==z) );
        System.out.println(x==z);

    }
}
