package com.intr;

public interface Calc {

    public final int a = 20;
    int b = 30;

    public abstract void add(int x, int y);
    public  abstract void sub(int x, int y);

    void mul(int x, int y);
    void div(int x, int y);
}
