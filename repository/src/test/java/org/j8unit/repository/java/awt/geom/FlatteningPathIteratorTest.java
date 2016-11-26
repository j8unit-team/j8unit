package org.j8unit.repository.java.awt.geom;

import java.awt.geom.FlatteningPathIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FlatteningPathIterator} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.geom.FlatteningPathIteratorTests}).
 */
@RunWith(J8Unit4.class)
public class FlatteningPathIteratorTest
implements FlatteningPathIteratorTests<FlatteningPathIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.FlatteningPathIterator]

    @Override
    public FlatteningPathIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.geom.FlatteningPathIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.geom.FlatteningPathIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.geom.FlatteningPathIterator]

}
