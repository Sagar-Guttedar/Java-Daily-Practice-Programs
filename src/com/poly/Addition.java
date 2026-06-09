package com.poly;

/*public class Addition {

    public void add(int x, int y){
        int z = x+y;
        System.out.println("Addition of 2 Integers "+z);
    }

    public void add(float x, float y){
        float z = x+y;
        System.out.println("Addition of 2 Float"+z);
    }

    public void add(int x, int y, int z){
        int a = x+y+z;
        System.out.println("Addition of 2 Integers "+a);
    }

    public void add(int x, int y, float z){
        float a = x+y+z;
        System.out.println("Addition of 2 Integer and 1 float"+a);
    }

    public static void main(String[] args) {
        Addition ad = new Addition();
        ad.add(100,200);
        ad.add(2000.23f,300.34f);
        ad.add(10,20, 30);
        ad.add(10,20, 30.34f);

    }
}*/


public class Addition{
    public void add(int x, int y){
        int z=x+y;
        System.out.println("Addition of two integer : "+z);
    }
    public void add(float x, float y){
        float z=x+y;
        System.out.println("Addition of two float : "+z);
    }
    public void add(int x, int y, int z){
        int a = x+y+z;
        System.out.println("Addition of 3 integer : "+a);
    }

    public void add(int x, int y, float z){
        float a=x+y+z;
        System.out.println("Addition of 2 integer and 1 float : "+a);
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(10,20);
        a.add(2000.34f,3000.12f);

        a.add(10,20,30);
        a.add(10,10,100.23f);
    }
}













