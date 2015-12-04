package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.RowFilter class javax.swing.RowFilter}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.RowFilterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowFilterTests<SUT extends javax.swing.RowFilter<M, I>, M, I>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.RowFilter$ComparisonType class javax.swing.RowFilter$ComparisonType},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.RowFilterClassTests.ComparisonTypeClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComparisonTypeTests<SUT extends javax.swing.RowFilter.ComparisonType>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.RowFilter.ComparisonType> {

    }

    /**
     * <p>
     * Test class for {@link javax.swing.RowFilter$Entry class javax.swing.RowFilter$Entry}, containing all instance
     * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.RowFilterClassTests.EntryClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EntryTests<SUT extends javax.swing.RowFilter.Entry<M, I>, M, I>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getIdentifier() public abstract java.lang.Object
         * javax.swing.RowFilter$Entry.getIdentifier()}.
         * </p>
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

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.Entry#getModel() public abstract java.lang.Object
         * javax.swing.RowFilter$Entry.getModel()}.
         * </p>
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
         * Test method for {@link javax.swing.RowFilter.Entry#getStringValue(int) public java.lang.String
         * javax.swing.RowFilter$Entry.getStringValue(int)}.
         * </p>
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
         * Test method for {@link javax.swing.RowFilter.Entry#getValue(int) public abstract java.lang.Object
         * javax.swing.RowFilter$Entry.getValue(int)}.
         * </p>
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
         * Test method for {@link javax.swing.RowFilter.Entry#getValueCount() public abstract int
         * javax.swing.RowFilter$Entry.getValueCount()}.
         * </p>
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

    }

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#include(javax.swing.RowFilter.Entry) public abstract boolean
     * javax.swing.RowFilter.include(javax.swing.RowFilter$Entry)}.
     * </p>
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

}
