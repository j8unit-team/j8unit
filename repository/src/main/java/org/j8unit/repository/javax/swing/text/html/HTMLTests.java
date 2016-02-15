package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.html.HTML class javax.swing.text.html.HTML}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link HTMLClassTests}.
 * </p>
 *
 * @see javax.swing.text.html.HTML class javax.swing.text.html.HTML (the hereby targeted class-under-test class)
 * @see HTMLClassTests HTMLClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLTests<SUT extends javax.swing.text.html.HTML>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.html.HTML.UnknownTag class
     * javax.swing.text.html.HTML$UnknownTag}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link HTMLClassTests.UnknownTagClassTests}.
     * </p>
     *
     * @see javax.swing.text.html.HTML.UnknownTag class javax.swing.text.html.HTML$UnknownTag (the hereby targeted
     *      class-under-test class)
     * @see HTMLClassTests.UnknownTagClassTests HTMLClassTests.UnknownTagClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnknownTagTests<SUT extends javax.swing.text.html.HTML.UnknownTag>
    extends org.j8unit.repository.java.io.SerializableTests<SUT>, HTMLTests.TagTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.UnknownTag#hashCode() public int
         * javax.swing.text.html.HTML$UnknownTag.hashCode()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.UnknownTag#hashCode() public int
         * javax.swing.text.html.HTML$UnknownTag.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.HTML.UnknownTag#hashCode() public int
         *      javax.swing.text.html.HTML$UnknownTag.hashCode() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_hashCode()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.UnknownTag#equals(Object) public boolean
         * javax.swing.text.html.HTML$UnknownTag.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.UnknownTag#equals(Object) public boolean
         * javax.swing.text.html.HTML$UnknownTag.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.HTML.UnknownTag#equals(Object) public boolean
         *      javax.swing.text.html.HTML$UnknownTag.equals(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_equals_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.html.HTML.Attribute class
     * javax.swing.text.html.HTML$Attribute}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link HTMLClassTests.AttributeClassTests}.
     * </p>
     *
     * @see javax.swing.text.html.HTML.Attribute class javax.swing.text.html.HTML$Attribute (the hereby targeted
     *      class-under-test class)
     * @see HTMLClassTests.AttributeClassTests HTMLClassTests.AttributeClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AttributeTests<SUT extends javax.swing.text.html.HTML.Attribute>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Attribute#toString() public java.lang.String
         * javax.swing.text.html.HTML$Attribute.toString()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Attribute#toString() public java.lang.String
         * javax.swing.text.html.HTML$Attribute.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.HTML.Attribute#toString() public java.lang.String
         *      javax.swing.text.html.HTML$Attribute.toString() (the hereby targeted method-under-test)
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

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.html.HTML.Tag class javax.swing.text.html.HTML$Tag}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link HTMLClassTests.TagClassTests}.
     * </p>
     *
     * @see javax.swing.text.html.HTML.Tag class javax.swing.text.html.HTML$Tag (the hereby targeted class-under-test
     *      class)
     * @see HTMLClassTests.TagClassTests HTMLClassTests.TagClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TagTests<SUT extends javax.swing.text.html.HTML.Tag>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#breaksFlow() public boolean
         * javax.swing.text.html.HTML$Tag.breaksFlow()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#breaksFlow() public boolean
         * javax.swing.text.html.HTML$Tag.breaksFlow()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.HTML.Tag#breaksFlow() public boolean javax.swing.text.html.HTML$Tag.breaksFlow()
         *      (the hereby targeted method-under-test)
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
         * Test method for {@link javax.swing.text.html.HTML.Tag#isPreformatted() public boolean
         * javax.swing.text.html.HTML$Tag.isPreformatted()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#isPreformatted() public boolean
         * javax.swing.text.html.HTML$Tag.isPreformatted()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.HTML.Tag#isPreformatted() public boolean
         *      javax.swing.text.html.HTML$Tag.isPreformatted() (the hereby targeted method-under-test)
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
         * Test method for {@link javax.swing.text.html.HTML.Tag#isBlock() public boolean
         * javax.swing.text.html.HTML$Tag.isBlock()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#isBlock() public boolean
         * javax.swing.text.html.HTML$Tag.isBlock()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.HTML.Tag#isBlock() public boolean javax.swing.text.html.HTML$Tag.isBlock() (the
         *      hereby targeted method-under-test)
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
         * Test method for {@link javax.swing.text.html.HTML.Tag#toString() public java.lang.String
         * javax.swing.text.html.HTML$Tag.toString()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.html.HTML.Tag#toString() public java.lang.String
         * javax.swing.text.html.HTML$Tag.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.html.HTML.Tag#toString() public java.lang.String
         *      javax.swing.text.html.HTML$Tag.toString() (the hereby targeted method-under-test)
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

    }

}
