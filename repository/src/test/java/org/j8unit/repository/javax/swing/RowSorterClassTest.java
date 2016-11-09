package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSorter} (by simply reusing the J8Unit
 * test interface {@link RowSorterClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class RowSorterClassTest
implements RowSorterClassTests<RowSorter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowSorter]

    @Override
    public Class<RowSorter> createNewSUT() {
        return RowSorter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.RowSorter#RowSorter() public
     * javax.swing.RowSorter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_RowSorter()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowSorter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowSorter]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link SortKey} (by simply reusing the
     * J8Unit test interface {@link SortKeyClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SortKeyClassTest
    implements SortKeyClassTests<SortKey> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowSorter$SortKey]

        @Override
        public Class<SortKey> createNewSUT() {
            return SortKey.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.RowSorter.SortKey#SortKey(int, javax.swing.SortOrder) public
         * javax.swing.RowSorter$SortKey(int,javax.swing.SortOrder)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_SortKey_int_SortOrder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SortKey sut = null; // = new SortKey(int, javax.swing.SortOrder);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowSorter$SortKey]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowSorter$SortKey]

    }

}
