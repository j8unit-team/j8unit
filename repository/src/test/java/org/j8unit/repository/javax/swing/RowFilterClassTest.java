package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.RowFilter.Entry;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowFilter} (by simply reusing the J8Unit
 * test interface {@link RowFilterClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class RowFilterClassTest
implements RowFilterClassTests<RowFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowFilter]

    @Override
    public Class<RowFilter> createNewSUT() {
        return RowFilter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.RowFilter#RowFilter() public
     * javax.swing.RowFilter()}.
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
    public void create_RowFilter()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.RowFilter#dateFilter(javax.swing.RowFilter.ComparisonType, java.util.Date, int...) public
     * static <M,I> javax.swing.RowFilter<M, I>
     * javax.swing.RowFilter.dateFilter(javax.swing.RowFilter$ComparisonType,java.util.Date,int...)}.
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
    public void test_dateFilter_ComparisonType_Date_intArray()
    throws Exception {
        // write some test for {@link javax.swing.RowFilter#dateFilter(javax.swing.RowFilter.ComparisonType,
        // java.util.Date, int...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.RowFilter#orFilter(Iterable) public
     * static <M,I> javax.swing.RowFilter<M, I> javax.swing.RowFilter.orFilter(java.lang.Iterable<? extends
     * javax.swing.RowFilter<? super M, ? super I>>)}.
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
    public void test_orFilter_Iterable()
    throws Exception {
        // write some test for {@link javax.swing.RowFilter#orFilter(Iterable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.RowFilter#numberFilter(javax.swing.RowFilter.ComparisonType, Number, int...) public static
     * <M,I> javax.swing.RowFilter<M, I>
     * javax.swing.RowFilter.numberFilter(javax.swing.RowFilter$ComparisonType,java.lang.Number,int...)}.
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
    public void test_numberFilter_ComparisonType_Number_intArray()
    throws Exception {
        // write some test for {@link javax.swing.RowFilter#numberFilter(javax.swing.RowFilter.ComparisonType, Number,
        // int...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.RowFilter#andFilter(Iterable) public
     * static <M,I> javax.swing.RowFilter<M, I> javax.swing.RowFilter.andFilter(java.lang.Iterable<? extends
     * javax.swing.RowFilter<? super M, ? super I>>)}.
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
    public void test_andFilter_Iterable()
    throws Exception {
        // write some test for {@link javax.swing.RowFilter#andFilter(Iterable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.RowFilter#notFilter(javax.swing.RowFilter) public static <M,I> javax.swing.RowFilter<M, I>
     * javax.swing.RowFilter.notFilter(javax.swing.RowFilter<M, I>)}.
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
    public void test_notFilter_RowFilter()
    throws Exception {
        // write some test for {@link javax.swing.RowFilter#notFilter(javax.swing.RowFilter)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.RowFilter#regexFilter(String, int...)
     * public static <M,I> javax.swing.RowFilter<M, I> javax.swing.RowFilter.regexFilter(java.lang.String,int...)}.
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
    public void test_regexFilter_String_intArray()
    throws Exception {
        // write some test for {@link javax.swing.RowFilter#regexFilter(String, int...)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowFilter]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ComparisonType} (by simply reusing
     * the J8Unit test interface {@link ComparisonTypeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ComparisonTypeClassTest
    implements ComparisonTypeClassTests<ComparisonType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowFilter$ComparisonType]

        @Override
        public Class<ComparisonType> createNewSUT() {
            return ComparisonType.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.RowFilter.ComparisonType#valueOf(String) public static
         * javax.swing.RowFilter$ComparisonType javax.swing.RowFilter$ComparisonType.valueOf(java.lang.String)}.
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
            // write some test for {@link javax.swing.RowFilter.ComparisonType#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.swing.RowFilter.ComparisonType#values()
         * public static javax.swing.RowFilter$ComparisonType[] javax.swing.RowFilter$ComparisonType.values()}.
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
            // write some test for {@link javax.swing.RowFilter.ComparisonType#values()}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowFilter$ComparisonType]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowFilter$ComparisonType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Entry} (by simply reusing the J8Unit
     * test interface {@link EntryClassTests}).
     */
    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class EntryClassTest
    implements EntryClassTests<Entry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowFilter$Entry]

        @Override
        public Class<Entry> createNewSUT() {
            return Entry.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link javax.swing.RowFilter.Entry#Entry() public
         * javax.swing.RowFilter$Entry()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_Entry()
        throws Exception {
            Assert.fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowFilter$Entry]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowFilter$Entry]

    }

}
