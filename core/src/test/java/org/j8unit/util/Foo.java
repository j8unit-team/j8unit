package org.j8unit.util;

public abstract class Foo {

    public abstract CharSequence foo(Number n);

    protected String sayYourName() {
        return this.getClass().getName();
    }

}