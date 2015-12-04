package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.CSS class javax.swing.text.html.CSS},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.CSSClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CSSTests<SUT extends javax.swing.text.html.CSS>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.CSS$Attribute class javax.swing.text.html.CSS$Attribute},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.CSSClassTests.AttributeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AttributeTests<SUT extends javax.swing.text.html.CSS.Attribute>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.CSS.Attribute#isInherited() public boolean javax.swing.text.html.CSS$Attribute.isInherited()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isInherited() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.CSS.Attribute#toString() public java.lang.String javax.swing.text.html.CSS$Attribute.toString()}.
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
         * Test method for {@link javax.swing.text.html.CSS.Attribute#getDefaultValue() public java.lang.String javax.swing.text.html.CSS$Attribute.getDefaultValue()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getDefaultValue() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
