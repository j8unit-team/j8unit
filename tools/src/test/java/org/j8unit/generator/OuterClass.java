package org.j8unit.generator;

public class OuterClass {

    public OuterClass() {
    }

    public void method1() {
    }

    void method2() {
    }

    protected void method3() {
    }

    @SuppressWarnings("unused" /* is used via Reflection API */)
    private void method4() {
    }

    public static class InnerClass1 {
    }

    static class InnerClass2 {
    }

    protected static class InnerClass3 {
    }

    @SuppressWarnings("unused" /* is used via Reflection API */)
    private static class InnerClass4 {
    }

}
