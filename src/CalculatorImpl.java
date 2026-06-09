public class CalculatorImpl extends Calculator{

    @Override
    public void add(int x, int y){
        int z = x+y;
        System.out.println("Addition of 2 numbers "+z);
    }

    @Override
    public void sub(int x, int y){
        int z = x-y;
        System.out.println("Substraction of 2 numbers "+z);
    }

    public static void main(String[] args){
        CalculatorImpl c = new CalculatorImpl();
        c.add(100, 100);
        c.sub(200, 100);
        c.mul(20, 20);
        c.div(20,  10);
    }

}
