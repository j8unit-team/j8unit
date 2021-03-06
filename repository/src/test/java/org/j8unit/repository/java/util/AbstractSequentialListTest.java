package org.j8unit.repository.java.util;

import java.util.AbstractSequentialList;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractSequentialList} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.AbstractSequentialListTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractSequentialListTest<E>
implements AbstractSequentialListTests<AbstractSequentialList<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractSequentialList]

    @Override
    public AbstractSequentialList<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractSequentialList], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractSequentialList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractSequentialList]

}
