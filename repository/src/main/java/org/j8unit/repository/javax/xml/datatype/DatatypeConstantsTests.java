package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeConstants.Field;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link DatatypeConstants public final class javax.xml.datatype.DatatypeConstants}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatatypeConstantsTests<SUT extends DatatypeConstants>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Field
     * public static final class javax.xml.datatype.DatatypeConstants$Field}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests.FieldClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FieldTests<SUT extends Field>
    extends ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.xml.datatype.DatatypeConstants.Field#getId() public int
         * javax.xml.datatype.DatatypeConstants$Field.getId()}.
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
        public default void test_getId()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.xml.datatype.DatatypeConstants.Field#toString() public java.lang.String
         * javax.xml.datatype.DatatypeConstants$Field.toString()}.
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
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

    }

}
