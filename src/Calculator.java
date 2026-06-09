public abstract class Calculator {

    public abstract void add(int x, int y);
    public abstract void sub(int x, int y);

    public void mul(int x, int y){
        int z = x*y;
        System.out.println("Multiplication of 2 numbers "+z);
    }
    public void div(int x, int y) {
        int z = x/y;
        System.out.println("Division of 2 numbers " +z);
    }
}


