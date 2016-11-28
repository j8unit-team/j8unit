package org.j8unit.repository.java.util;

import java.util.Collection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Collection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.CollectionTests}).
 */
@RunWith(J8Unit4.class)
public class CollectionTest<E>
implements CollectionTests<Collection<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Collection]

    @Override
    public Collection<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Collection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Collection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Collection]

}
