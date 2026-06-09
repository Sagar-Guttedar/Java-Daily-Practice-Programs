package com.poly;

/*public class SubstractionImpl extends Substraction {
    public void sub(int x, int y){
        int z = x-y;
        System.out.println("From sub class "+z);
    }

    public static void main(String[] args) {
        Substraction s = new SubstractionImpl();
        s.sub(200, 120);
    }
}*/


public class SubstractionImpl extends Substraction{

    public void sub(int x, int y){
        int z=x-y;
        System.out.println("From sub class : "+z);
    }

    public static void main(String[] args) {
        Substraction s = new SubstractionImpl();
        s.sub(200,100);
    }
}

