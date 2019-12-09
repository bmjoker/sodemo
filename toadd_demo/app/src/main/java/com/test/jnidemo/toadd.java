package com.test.jnidemo;

public class toadd {
    static {
        System.loadLibrary("demoadd");
    }
    public native  int add(int i,int j);
}
