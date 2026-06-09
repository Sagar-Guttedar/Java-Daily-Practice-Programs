package com.Exceptionn;
// The ArrayIndexOutOfBoundsException in Java is a runtime error. It happens when you try to access an array element with an invalid index. Arrays start at index 0 and end at array.length - 1. If you use an index less than 0 or more than array.length - 1, Java throws this exception.
/*public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int num = numbers[6]; // Accessing index 5, which is out of bounds
            System.out.println("Number at index 5: " + num);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}*/


/*

public class ArrayIndexOutOfBoundsExample{
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        try {
            int num= numbers[6];
            System.out.println("Number at index 5 "+num);
        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
        }
    }
}*/

/*public class ArrayIndexOutOfBoundsExample{
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        try {
            int num=numbers[6];
            System.out.println("Numbers is array 5 : "+num);
        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
        }
    }
}*/

public class ArrayIndexOutOfBoundsExample{
    public static void main(String[] args) {
        int[] numbers={1,2,3,3,4,4};
        try {
            int num=numbers[7];

        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
        }
    }
}















