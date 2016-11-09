package org.j8unit.repository.java.beans;

import java.beans.Introspector;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Introspector} (by simply reusing the
 * J8Unit test interface {@link IntrospectorTests}).
 */

@RunWith(J8Unit4.class)
public class IntrospectorTest
implements IntrospectorTests<Introspector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Introspector]

    @Override
    public Introspector createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.Introspector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.Introspector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.Introspector]

}
