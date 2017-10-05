package org.j8unit.util;

public abstract class Foo {

    public abstract void someAbstractMethodThatShallBeOverridden();

    protected String someProtectedMethodThatShallBeOverridden() {
        return this.getClass().getName();
    }

    public static String someStaticMethodThatShallBeHidden() {
        return Foo.class.getName();
    }

    public CharSequence someMethodThatShallBeRedefinedWithCovariantReturnType() {
        return "";
    }

    public void someMethodThatShallBeRedefinedWithContravariantParameterType(final Integer i) {
    }

    public CharSequence someMethodThatShallBeRedefinedWithCovariantReturnTypeAndContravariantParameterType(final Integer i) {
        return "";
    }

    public void someMethodThatRedefinedWithDifferentParameterType(final String s) {
    }

}
