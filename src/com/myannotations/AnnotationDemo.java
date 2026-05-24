/**
 *  Java program to demonstrate annotations.
 */

package com.myannotations;

/**
 *  AnnotationDemo class.
 */
@CustomerAnnotation(name = "Julia", id = 121)
public class AnnotationDemo {
    public static void main(String[] args) {

        // Creating an instance of the class AnnotationDemo.
        AnnotationDemo ad = new AnnotationDemo();

        // Calling method test.
        ad.test();

        // Creating an instance of the class SubClass.
        SubClass sb = new SubClass();

        // Calling method test.
        sb.test();
    }

    // Method test.
    // Deprecated means method is not in use anymore.
    @Deprecated
    void test() {

        System.out.println("Hello annotated.");

    }
}

/**
 * SubClass class.
 */
class SubClass extends AnnotationDemo {

    // Method test.
    @Override
    void test() {

        @SuppressWarnings("unused")
        int i = 8;
        System.out.println("Hello annotated in subclass.");

    }
}

@interface CustomerAnnotation {
    String name();
    int id();
}