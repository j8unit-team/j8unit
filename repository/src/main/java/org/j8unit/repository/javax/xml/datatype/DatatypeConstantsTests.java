package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.datatype.DatatypeConstants class
 * javax.xml.datatype.DatatypeConstants}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DatatypeConstantsClassTests}.
 * </p>
 *
 * @see javax.xml.datatype.DatatypeConstants class javax.xml.datatype.DatatypeConstants (the hereby targeted
 *      class-under-test class)
 * @see DatatypeConstantsClassTests DatatypeConstantsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatatypeConstantsTests<SUT extends javax.xml.datatype.DatatypeConstants>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.datatype.DatatypeConstants.Field class
     * javax.xml.datatype.DatatypeConstants$Field}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link DatatypeConstantsClassTests.FieldClassTests}.
     * </p>
     *
     * @see javax.xml.datatype.DatatypeConstants.Field class javax.xml.datatype.DatatypeConstants$Field (the hereby
     *      targeted class-under-test class)
     * @see DatatypeConstantsClassTests.FieldClassTests DatatypeConstantsClassTests.FieldClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FieldTests<SUT extends javax.xml.datatype.DatatypeConstants.Field>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#toString() public java.lang.String
         * javax.xml.datatype.DatatypeConstants$Field.toString()}.
         *
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#toString() public java.lang.String
         * javax.xml.datatype.DatatypeConstants$Field.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.datatype.DatatypeConstants.Field#toString() public java.lang.String
         *      javax.xml.datatype.DatatypeConstants$Field.toString() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#getId() public int
         * javax.xml.datatype.DatatypeConstants$Field.getId()}.
         *
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#getId() public int
         * javax.xml.datatype.DatatypeConstants$Field.getId()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.datatype.DatatypeConstants.Field#getId() public int
         *      javax.xml.datatype.DatatypeConstants$Field.getId() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getId()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
