package org.j8unit.util.helper;

public abstract class Foo {

    public abstract CharSequence foo(Number n);

    protected String sayYourName() {
        return this.getClass().getName();
    }

}