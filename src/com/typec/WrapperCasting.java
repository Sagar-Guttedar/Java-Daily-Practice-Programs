package com.typec;

//Casting Between Wrapper Classes and Primitives
//Autoboxing: Automatic conversion of a primitive type to its corresponding wrapper class.
//Unboxing: Automatic conversion of a wrapper class to its corresponding primitive type.


public class WrapperCasting {
    public static void main(String[] args) {
        int num = 10;
        Integer wrappedNum = num;  // Autoboxing
        int unwrappedNum = wrappedNum;  // Unboxing
        System.out.println("Autoboxed: " + wrappedNum);
        System.out.println("Unboxed: " + unwrappedNum);
    }
}


//Special Types of Casting
//  3. Casting Between Reference Types
//Reference type casting is used in inheritance hierarchies.
//Two types:
//Upcasting: Converting a subclass reference to a superclass reference.
//Safe and implicit.
//Downcasting: Converting a superclass reference back to a subclass reference.
//Needs explicit casting and may throw ClassCastException.


//            or


//Implicit Casting	:- Smaller to larger type (automatic)	int → double
//Explicit Casting	:- Larger to smaller type (manual)	double → int
//Upcasting :-	Subclass to superclass (automatic)	Dog → Animal
//Downcasting :-	Superclass to subclass (manual)	Animal → Dog
//Autoboxing :-	Primitive to wrapper class (automatic)	int → Integer
//Unboxing	:- Wrapper class to primitive (automatic)	Integer → int
//String Casting :- String to numeric using parse methods	"123" → int