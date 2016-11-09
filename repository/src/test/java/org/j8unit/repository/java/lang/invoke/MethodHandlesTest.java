package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MethodHandles} (by simply reusing the
 * J8Unit test interface {@link MethodHandlesTests}).
 */

@RunWith(J8Unit4.class)
public class MethodHandlesTest
implements MethodHandlesTests<MethodHandles> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles]

    @Override
    public MethodHandles createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.MethodHandles], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.MethodHandles]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.MethodHandles]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Lookup} (by simply reusing the
     * J8Unit test interface {@link LookupTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LookupTest
    implements LookupTests<Lookup> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]

        @Override
        public Lookup createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.MethodHandles.Lookup], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]

    }

}
