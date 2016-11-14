package org.j8unit.repository.javax.swing;

import javax.swing.DefaultRowSorter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultRowSorter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.DefaultRowSorterTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultRowSorterTest<M, I>
implements DefaultRowSorterTests<DefaultRowSorter<M, I>, M, I> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DefaultRowSorter]

    @Override
    public DefaultRowSorter<M, I> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.DefaultRowSorter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DefaultRowSorter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DefaultRowSorter]

}
