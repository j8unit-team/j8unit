package org.j8unit.repository.java.util;

import java.util.AbstractCollection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractCollection} (by simply
 * reusing the J8Unit test interface {@link AbstractCollectionTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractCollectionTest<E>
implements AbstractCollectionTests<AbstractCollection<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractCollection]

    @Override
    public AbstractCollection<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractCollection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractCollection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractCollection]

}
