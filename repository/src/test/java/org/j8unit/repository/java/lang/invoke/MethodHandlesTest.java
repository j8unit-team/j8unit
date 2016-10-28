package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodHandlesTest
implements org.j8unit.repository.java.lang.invoke.MethodHandlesTests<MethodHandles> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles]

    @Override
    public MethodHandles createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.MethodHandles], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles]

    @RunWith(J8Unit4.class)
    public static class LookupTest
    implements org.j8unit.repository.java.lang.invoke.MethodHandlesTests.LookupTests<Lookup> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]

        @Override
        public Lookup createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.MethodHandles.Lookup], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]

    }

}
