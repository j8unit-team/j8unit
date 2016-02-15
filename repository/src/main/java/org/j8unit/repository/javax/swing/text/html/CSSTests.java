package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.html.CSS class javax.swing.text.html.CSS}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CSSClassTests}.
 * </p>
 *
 * @see javax.swing.text.html.CSS class javax.swing.text.html.CSS (the hereby targeted class-under-test class)
 * @see CSSClassTests CSSClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSTests<SUT extends javax.swing.text.html.CSS>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.html.CSS.Attribute class
     * javax.swing.text.html.CSS$Attribute}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link CSSClassTests.AttributeClassTests}.
     * </p>
     *
     * @see javax.swing.text.html.CSS.Attribute class javax.swing.text.html.CSS$Attribute (the hereby targeted
     *      class-under-test class)
     * @see CSSClassTests.AttributeClassTests CSSClassTests.AttributeClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AttributeTests<SUT extends javax.swing.text.html.CSS.Attribute>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.CSS.Attribute#isInherited() public boolean
         * javax.swing.text.html.CSS$Attribute.isInherited()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.CSS.Attribute#isInherited() public boolean
         * javax.swing.text.html.CSS$Attribute.isInherited()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.CSS.Attribute#isInherited() public boolean
         *      javax.swing.text.html.CSS$Attribute.isInherited() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isInherited()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.CSS.Attribute#toString() public java.lang.String
         * javax.swing.text.html.CSS$Attribute.toString()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.CSS.Attribute#toString() public java.lang.String
         * javax.swing.text.html.CSS$Attribute.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.CSS.Attribute#toString() public java.lang.String
         *      javax.swing.text.html.CSS$Attribute.toString() (the hereby targeted method-under-test)
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
         * Test method for {@link javax.swing.text.html.CSS.Attribute#getDefaultValue() public java.lang.String
         * javax.swing.text.html.CSS$Attribute.getDefaultValue()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.CSS.Attribute#getDefaultValue() public java.lang.String
         * javax.swing.text.html.CSS$Attribute.getDefaultValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.CSS.Attribute#getDefaultValue() public java.lang.String
         *      javax.swing.text.html.CSS$Attribute.getDefaultValue() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getDefaultValue()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
