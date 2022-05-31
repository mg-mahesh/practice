package com.test;

class TestPojo {
    private String str;
    private Integer int1;
    public TestPojo(String str, Integer int1) {
        this.str = str;
        this.int1 = int1;
    }

    public static void main(String[] args) {
        TestPojo t1 = new TestPojo("a", 1);
        TestPojo t2 = new TestPojo("a", 1);
        System.out.println(t2.equals(t1));
    }

}

class SuperClass {

    void method() {
        System.out.println("SuperClass");
    }
}
 
class SubClass extends SuperClass{

    void method() throws ArithmeticException{

        System.out.println("SubClass");
    }
}