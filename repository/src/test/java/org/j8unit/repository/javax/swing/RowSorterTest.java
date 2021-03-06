package org.j8unit.repository.javax.swing;

import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RowSorter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.RowSorterTests}).
 */
@RunWith(J8Unit4.class)
public class RowSorterTest<M>
implements RowSorterTests<RowSorter<M>, M> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowSorter]

    @Override
    public RowSorter<M> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.RowSorter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.RowSorter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.RowSorter]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SortKey} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.RowSorterTests.SortKeyTests}).
     */
    @RunWith(J8Unit4.class)
    public static class SortKeyTest
    implements SortKeyTests<SortKey> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowSorter$SortKey]

        @Override
        public SortKey createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.RowSorter.SortKey], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.RowSorter$SortKey]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.RowSorter$SortKey]

    }

}
