import com.AlphabetsPatternPro.O;



// Inner Class & Outer Class in Java
//Outer Class: A regular class that contains other classes.
//Inner Class: A class defined inside another class. It has access to the outer class's members.


/*
class OuterClass {
    int outerValue = 10;

    class InnerClass {
        void display() {
            System.out.println("Outer Value: " + outerValue);
        }
    }
}

public class OuterInnerClass {
    public static void main(String args[]) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = outer.new InnerClass();
        inner.display();
    }
}
*/
/*
class OuterClass {
    int outerValue = 10;

    class InnerClass {
        void display(){
            System.out.println("Outer Value : "+outerValue);
        }
    }
}
public class OuterInnerClass {
    public static void main(String[] args) {
        OuterClass o= new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();
        i.display();
    }
}*/







class OuterClass{
    int outervalue = 10;

    class InnerClass{
        void display(){
            System.out.println("OuterClass : "+outervalue);
        }
    }
}

public class OuterInnerClass{
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();
        i.display();
    }
}
















