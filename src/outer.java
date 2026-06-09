

class Car {
    String carName = "Tesla";

    // Inner class
    class Engine {
        void start() {
            System.out.println(carName + " engine started!");
        }
    }
}


public class outer {
    public static void main(String[] args) {
        Car c = new Car();
        Car.Engine e = c.new Engine();
        e.start();
    }
}
