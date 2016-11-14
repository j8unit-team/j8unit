package org.j8unit.repository.javax.swing.event;

import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterEvent.Type;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSorterEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.RowSorterEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSorterEventClassTest
implements RowSorterEventClassTests<RowSorterEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.RowSorterEvent]

    @Override
    public Class<RowSorterEvent> createNewSUT() {
        return RowSorterEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.RowSorterEvent#RowSorterEvent(javax.swing.RowSorter) public
     * javax.swing.event.RowSorterEvent(javax.swing.RowSorter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_RowSorterEvent_RowSorter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RowSorterEvent sut = null; // = new RowSorterEvent(javax.swing.RowSorter);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.RowSorterEvent#RowSorterEvent(javax.swing.RowSorter, javax.swing.event.RowSorterEvent.Type, int[])
     * public javax.swing.event.RowSorterEvent(javax.swing.RowSorter,javax.swing.event.RowSorterEvent$Type,int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_RowSorterEvent_RowSorter_Type_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RowSorterEvent sut = null; // = new RowSorterEvent(javax.swing.RowSorter,
                                         // javax.swing.event.RowSorterEvent.Type, int[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.RowSorterEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.RowSorterEvent]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Type} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.swing.event.RowSorterEventClassTests.TypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.RowSorterEvent$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.swing.event.RowSorterEvent.Type#values()
         * public static javax.swing.event.RowSorterEvent$Type[] javax.swing.event.RowSorterEvent$Type.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link javax.swing.event.RowSorterEvent.Type#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.event.RowSorterEvent.Type#valueOf(String) public static
         * javax.swing.event.RowSorterEvent$Type javax.swing.event.RowSorterEvent$Type.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link javax.swing.event.RowSorterEvent.Type#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.RowSorterEvent$Type]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.RowSorterEvent$Type]

    }

}
