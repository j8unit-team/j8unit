package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.StyleContext class javax.swing.text.StyleContext}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.StyleContextTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.StyleContextTests
 */
@Category(J8UnitRepository.class)
public abstract interface StyleContextClassTests<SUT extends Class<? extends javax.swing.text.StyleContext>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.AttributeContextClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleContext$NamedStyle class javax.swing.text.StyleContext$NamedStyle},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyleContextTests.NamedStyleTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleContextTests.NamedStyleTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface NamedStyleClassTests<SUT extends Class<? extends javax.swing.text.StyleContext.NamedStyle>>
    extends org.j8unit.repository.javax.swing.text.StyleClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.StyleContext.NamedStyle#NamedStyle(javax.swing.text.StyleContext)
         * public javax.swing.text.StyleContext$NamedStyle(javax.swing.text.StyleContext)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_NamedStyle_StyleContext()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyleContext.NamedStyle sut = null; // = new
                                                                       // NamedStyle(javax.swing.text.StyleContext);
        }

        /**
         * Test method for
         * {@link javax.swing.text.StyleContext.NamedStyle#NamedStyle(javax.swing.text.StyleContext,java.lang.String,javax.swing.text.Style)
         * public
         * javax.swing.text.StyleContext$NamedStyle(javax.swing.text.StyleContext,java.lang.String,javax.swing.text.Style)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_NamedStyle_StyleContext_String_Style()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyleContext.NamedStyle sut = null; // = new
                                                                       // NamedStyle(javax.swing.text.StyleContext,java.lang.String,javax.swing.text.Style);
        }

        /**
         * Test method for
         * {@link javax.swing.text.StyleContext.NamedStyle#NamedStyle(javax.swing.text.StyleContext,javax.swing.text.Style)
         * public javax.swing.text.StyleContext$NamedStyle(javax.swing.text.StyleContext,javax.swing.text.Style)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_NamedStyle_StyleContext_Style()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyleContext.NamedStyle sut = null; // = new
                                                                       // NamedStyle(javax.swing.text.StyleContext,javax.swing.text.Style);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyleContext.NamedStyle> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyleContext.NamedStyle.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.StyleContext$SmallAttributeSet class
     * javax.swing.text.StyleContext$SmallAttributeSet}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.StyleContextTests.SmallAttributeSetTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.StyleContextTests.SmallAttributeSetTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SmallAttributeSetClassTests<SUT extends Class<? extends javax.swing.text.StyleContext.SmallAttributeSet>>
    extends org.j8unit.repository.javax.swing.text.AttributeSetClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.text.StyleContext.SmallAttributeSet#SmallAttributeSet(javax.swing.text.StyleContext,javax.swing.text.AttributeSet)
         * public
         * javax.swing.text.StyleContext$SmallAttributeSet(javax.swing.text.StyleContext,javax.swing.text.AttributeSet)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SmallAttributeSet_StyleContext_AttributeSet()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyleContext.SmallAttributeSet sut = null; // = new
                                                                              // SmallAttributeSet(javax.swing.text.StyleContext,javax.swing.text.AttributeSet);
        }

        /**
         * Test method for
         * {@link javax.swing.text.StyleContext.SmallAttributeSet#SmallAttributeSet(javax.swing.text.StyleContext,java.lang.Object[])
         * public javax.swing.text.StyleContext$SmallAttributeSet(javax.swing.text.StyleContext,java.lang.Object[])}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SmallAttributeSet_StyleContext_ObjectArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.StyleContext.SmallAttributeSet sut = null; // = new
                                                                              // SmallAttributeSet(javax.swing.text.StyleContext,java.lang.Object[]);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.StyleContext.SmallAttributeSet> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.StyleContext.SmallAttributeSet.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.text.StyleContext#StyleContext() public javax.swing.text.StyleContext()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StyleContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.StyleContext sut = null; // = new StyleContext();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleContext#getDefaultStyleContext() public static final
     * javax.swing.text.StyleContext javax.swing.text.StyleContext.getDefaultStyleContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultStyleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleContext#getStaticAttribute(java.lang.Object) public static
     * java.lang.Object javax.swing.text.StyleContext.getStaticAttribute(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStaticAttribute_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleContext#getStaticAttributeKey(java.lang.Object) public static
     * java.lang.Object javax.swing.text.StyleContext.getStaticAttributeKey(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStaticAttributeKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleContext#readAttributeSet(java.io.ObjectInputStream,javax.swing.text.MutableAttributeSet)
     * public static void
     * javax.swing.text.StyleContext.readAttributeSet(java.io.ObjectInputStream,javax.swing.text.MutableAttributeSet)
     * throws java.lang.ClassNotFoundException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAttributeSet_ObjectInputStream_MutableAttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyleContext#registerStaticAttributeKey(java.lang.Object) public static
     * void javax.swing.text.StyleContext.registerStaticAttributeKey(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerStaticAttributeKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.StyleContext#writeAttributeSet(java.io.ObjectOutputStream,javax.swing.text.AttributeSet)
     * public static void
     * javax.swing.text.StyleContext.writeAttributeSet(java.io.ObjectOutputStream,javax.swing.text.AttributeSet) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeAttributeSet_ObjectOutputStream_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.text.StyleContext> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.StyleContext.class.isAssignableFrom(sut));
    }

}
