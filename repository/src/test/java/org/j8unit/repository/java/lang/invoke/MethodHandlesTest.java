package org.j8unit.repository.java.lang.invoke;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodHandlesTest
implements org.j8unit.repository.java.lang.invoke.MethodHandlesTests<java.lang.invoke.MethodHandles> {

    @RunWith(J8Unit4.class)
    public static class LookupTest
    implements org.j8unit.repository.java.lang.invoke.MethodHandlesTests.LookupTests<java.lang.invoke.MethodHandles.Lookup> {

        @Override
        public java.lang.invoke.MethodHandles.Lookup createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.lang.invoke.MethodHandles.Lookup] available.");
        }

    }

    @Override
    public java.lang.invoke.MethodHandles createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.invoke.MethodHandles] available.");
    }

}
