package org.j8unit.util;

import java.net.Inet4Address;

public abstract class Bar
extends Foo {

    @Override
    public abstract void someAbstractMethodThatShallBeOverridden();

    @Override
    public String someProtectedMethodThatShallBeOverridden() {
        return super.someProtectedMethodThatShallBeOverridden();
    }

    public static String someStaticMethodThatShallBeHidden() {
        return Bar.class.getName();
    }

    /**
     * Returns covariant return type ({@link String} instead of {@link CharSequence}).
     */
    @Override
    public String someMethodThatShallBeRedefinedWithCovariantReturnType() {
        return "";
    }

    /**
     * Uses contravariant parameter type ({@link Number} instead of {@link Integer}).
     */
    public void someMethodThatShallBeRedefinedWithContravariantParameterType(final Number n) {
    }

    /**
     * Returns covariant return type ({@link String} instead of {@link CharSequence}).
     *
     * Uses contravariant parameter type ({@link Number} instead of {@link Integer}).
     */
    public String someMethodThatShallBeRedefinedWithCovariantReturnTypeAndContravariantParameterType(final Number n) {
        return "";
    }

    /**
     * Uses contravariant parameter type ({@link Inet4Address} instead of {@link String}).
     */
    public void someMethodThatRedefinedWithDifferentParameterType(final Inet4Address a) {
    }

}
