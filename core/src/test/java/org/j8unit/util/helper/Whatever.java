package org.j8unit.util.helper;

import static java.lang.ClassLoader.getSystemClassLoader;
import static org.j8unit.util.Reflection.newProxyInstance;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;

public abstract interface Whatever {

    public default String returnsSomeString() {
        return this.getClass().getName();
    }

    public default String returnsSomeOtherString() {
        return this.returnsSomeString();
    }

    public default String returnsEvenAnotherString() {
        return this.returnsSomeOtherString();
    }

    public abstract String abstractStringReturn();

    public abstract Callable<? extends CharSequence> someCallable();

    public default void voidNoop() {
    }

    public static Whatever makeProxy(final InvocationHandler handler) {
        return newProxyInstance(getSystemClassLoader(), Whatever.class, handler);
    }

}
