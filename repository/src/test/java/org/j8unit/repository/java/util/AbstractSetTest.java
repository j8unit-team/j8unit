package org.j8unit.repository.java.util;

import java.util.AbstractSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.AbstractSetTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractSetTest<E>
implements AbstractSetTests<AbstractSet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractSet]

    @Override
    public AbstractSet<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractSet]

}
