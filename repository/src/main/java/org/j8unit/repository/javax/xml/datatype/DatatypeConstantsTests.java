package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.datatype.DatatypeConstants class javax.xml.datatype.DatatypeConstants},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DatatypeConstantsTests<SUT extends javax.xml.datatype.DatatypeConstants>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test class for {@link javax.xml.datatype.DatatypeConstants$Field class javax.xml.datatype.DatatypeConstants$Field},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests.FieldClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FieldTests<SUT extends javax.xml.datatype.DatatypeConstants.Field>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#toString() public java.lang.String javax.xml.datatype.DatatypeConstants$Field.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#getId() public int javax.xml.datatype.DatatypeConstants$Field.getId()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getId() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
