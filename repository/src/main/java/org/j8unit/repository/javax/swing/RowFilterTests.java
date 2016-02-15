package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.RowFilter class javax.swing.RowFilter}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link RowFilterClassTests}.
 * </p>
 *
 * @see javax.swing.RowFilter class javax.swing.RowFilter (the hereby targeted class-under-test class)
 * @see RowFilterClassTests RowFilterClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowFilterTests<SUT extends javax.swing.RowFilter<M, I>, M, I>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#include(javax.swing.RowFilter.Entry) public abstract boolean
     * javax.swing.RowFilter.include(javax.swing.RowFilter.javax.swing.RowFilter$Entry<? extends M, ? extends I>)}.
     *
     * <p>
     * Test method for {@link javax.swing.RowFilter#include(javax.swing.RowFilter.Entry) public abstract boolean
     * javax.swing.RowFilter.include(javax.swing.RowFilter$Entry)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.RowFilter#include(javax.swing.RowFilter.Entry) public abstract boolean
     *      javax.swing.RowFilter.include(javax.swing.RowFilter$Entry) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_include_Entry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.RowFilter.Entry class javax.swing.RowFilter$Entry}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link RowFilterClassTests.EntryClassTests}.
     * </p>
     *
     * @see javax.swing.RowFilter.Entry class javax.swing.RowFilter$Entry (the hereby targeted class-under-test class)
     * @see RowFilterClassTests.EntryClassTests RowFilterClassTests.EntryClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EntryTests<SUT extends javax.swing.RowFilter.Entry<M, I>, M, I>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getValueCount() public abstract int
         * javax.swing.RowFilter$Entry.getValueCount()}.
         *
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getValueCount() public abstract int
         * javax.swing.RowFilter$Entry.getValueCount()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.RowFilter.Entry#getValueCount() public abstract int
         *      javax.swing.RowFilter$Entry.getValueCount() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getValueCount()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getValue(int) public abstract java.lang.Object
         * javax.swing.RowFilter$Entry.getValue(int)}.
         *
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getValue(int) public abstract java.lang.Object
         * javax.swing.RowFilter$Entry.getValue(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.RowFilter.Entry#getValue(int) public abstract java.lang.Object
         *      javax.swing.RowFilter$Entry.getValue(int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getValue_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getStringValue(int) public java.lang.String
         * javax.swing.RowFilter$Entry.getStringValue(int)}.
         *
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getStringValue(int) public java.lang.String
         * javax.swing.RowFilter$Entry.getStringValue(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.RowFilter.Entry#getStringValue(int) public java.lang.String
         *      javax.swing.RowFilter$Entry.getStringValue(int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getStringValue_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getModel() public abstract M
         * javax.swing.RowFilter$Entry.getModel()}.
         *
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getModel() public abstract java.lang.Object
         * javax.swing.RowFilter$Entry.getModel()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.RowFilter.Entry#getModel() public abstract java.lang.Object
         *      javax.swing.RowFilter$Entry.getModel() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getModel()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getIdentifier() public abstract I
         * javax.swing.RowFilter$Entry.getIdentifier()}.
         *
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getIdentifier() public abstract java.lang.Object
         * javax.swing.RowFilter$Entry.getIdentifier()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.RowFilter.Entry#getIdentifier() public abstract java.lang.Object
         *      javax.swing.RowFilter$Entry.getIdentifier() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getIdentifier()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.RowFilter.ComparisonType class
     * javax.swing.RowFilter$ComparisonType}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link RowFilterClassTests.ComparisonTypeClassTests}.
     * </p>
     *
     * @see javax.swing.RowFilter.ComparisonType class javax.swing.RowFilter$ComparisonType (the hereby targeted
     *      class-under-test class)
     * @see RowFilterClassTests.ComparisonTypeClassTests RowFilterClassTests.ComparisonTypeClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComparisonTypeTests<SUT extends javax.swing.RowFilter.ComparisonType>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.RowFilter.ComparisonType> {

    }

}
