package org.j8unit.repository.java.lang.ref;

import java.lang.ref.Reference;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Reference} (by simply reusing the
 * J8Unit test interface {@link ReferenceTests}).
 */

@RunWith(J8Unit4.class)
public class ReferenceTest<T>
implements ReferenceTests<Reference<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ref.Reference]

    @Override
    public Reference<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.ref.Reference], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.ref.Reference]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.ref.Reference]

}
