package org.j8unit.util;

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

    public default void noop() {
    }

}
