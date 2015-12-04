package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.HTML class javax.swing.text.html.HTML}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.HTMLClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTMLTests<SUT extends javax.swing.text.html.HTML>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTML$Attribute class javax.swing.text.html.HTML$Attribute},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLClassTests.AttributeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AttributeTests<SUT extends javax.swing.text.html.HTML.Attribute>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Attribute#toString() public java.lang.String
         * javax.swing.text.html.HTML$Attribute.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTML$Tag class javax.swing.text.html.HTML$Tag}, containing all
     * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLClassTests.TagClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TagTests<SUT extends javax.swing.text.html.HTML.Tag>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#breaksFlow() public boolean
         * javax.swing.text.html.HTML$Tag.breaksFlow()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_breaksFlow()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#isBlock() public boolean
         * javax.swing.text.html.HTML$Tag.isBlock()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isBlock()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#isPreformatted() public boolean
         * javax.swing.text.html.HTML$Tag.isPreformatted()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isPreformatted()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#toString() public java.lang.String
         * javax.swing.text.html.HTML$Tag.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTML$UnknownTag class javax.swing.text.html.HTML$UnknownTag},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLClassTests.UnknownTagClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface UnknownTagTests<SUT extends javax.swing.text.html.HTML.UnknownTag>
    extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.javax.swing.text.html.HTMLTests.TagTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.UnknownTag#equals(java.lang.Object) public boolean
         * javax.swing.text.html.HTML$UnknownTag.equals(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_equals_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.UnknownTag#hashCode() public int
         * javax.swing.text.html.HTML$UnknownTag.hashCode()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_hashCode()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
