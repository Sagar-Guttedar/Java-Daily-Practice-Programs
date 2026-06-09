package com.coll;

import java.util.Stack;

public class StEx {
    Stack st = new Stack();

    public void addToStack(Object o){
        st.push(o);
        System.out.println("Added the element : "+o);
    }

    public void displaytack(){
        System.out.println("Elements in stack : "+st);
    }

    public void removeFromStack(){
        st.pop();
        System.out.println("Elements in stack : "+st);
    }

    public static void main(String[] args) {
        StEx st = new StEx();
        st.addToStack("Hello");
        st.addToStack(100);
        st.addToStack(1000.23f);
        st.addToStack('x');

        st.displaytack();

        st.removeFromStack();
        st.removeFromStack();

    }

}
