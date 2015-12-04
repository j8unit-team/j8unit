package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.PageAttributes class java.awt.PageAttributes}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.PageAttributesTests}.
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
 * @see org.j8unit.repository.java.awt.PageAttributesTests
 */
@Category(J8UnitRepository.class)
public abstract interface PageAttributesClassTests<SUT extends Class<? extends java.awt.PageAttributes>>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.awt.PageAttributes$ColorType class java.awt.PageAttributes$ColorType}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.PageAttributesTests.ColorTypeTests}.
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
     * @see org.j8unit.repository.java.awt.PageAttributesTests.ColorTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ColorTypeClassTests<SUT extends Class<? extends java.awt.PageAttributes.ColorType>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.PageAttributes.ColorType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.PageAttributes.ColorType.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.PageAttributes$MediaType class java.awt.PageAttributes$MediaType}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.PageAttributesTests.MediaTypeTests}.
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
     * @see org.j8unit.repository.java.awt.PageAttributesTests.MediaTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MediaTypeClassTests<SUT extends Class<? extends java.awt.PageAttributes.MediaType>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.PageAttributes.MediaType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.PageAttributes.MediaType.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.PageAttributes$OrientationRequestedType class
     * java.awt.PageAttributes$OrientationRequestedType}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.PageAttributesTests.OrientationRequestedTypeTests}.
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
     * @see org.j8unit.repository.java.awt.PageAttributesTests.OrientationRequestedTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OrientationRequestedTypeClassTests<SUT extends Class<? extends java.awt.PageAttributes.OrientationRequestedType>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.PageAttributes.OrientationRequestedType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.PageAttributes.OrientationRequestedType.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.PageAttributes$OriginType class java.awt.PageAttributes$OriginType}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.PageAttributesTests.OriginTypeTests}.
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
     * @see org.j8unit.repository.java.awt.PageAttributesTests.OriginTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OriginTypeClassTests<SUT extends Class<? extends java.awt.PageAttributes.OriginType>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.PageAttributes.OriginType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.PageAttributes.OriginType.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.PageAttributes$PrintQualityType class java.awt.PageAttributes$PrintQualityType},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.PageAttributesTests.PrintQualityTypeTests}.
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
     * @see org.j8unit.repository.java.awt.PageAttributesTests.PrintQualityTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PrintQualityTypeClassTests<SUT extends Class<? extends java.awt.PageAttributes.PrintQualityType>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.PageAttributes.PrintQualityType> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.PageAttributes.PrintQualityType.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.awt.PageAttributes#PageAttributes() public java.awt.PageAttributes()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageAttributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.PageAttributes sut = null; // = new PageAttributes();
    }

    /**
     * Test method for
     * {@link java.awt.PageAttributes#PageAttributes(java.awt.PageAttributes.ColorType,java.awt.PageAttributes.MediaType,java.awt.PageAttributes.OrientationRequestedType,java.awt.PageAttributes.OriginType,java.awt.PageAttributes.PrintQualityType,int[])
     * public
     * java.awt.PageAttributes(java.awt.PageAttributes$ColorType,java.awt.PageAttributes$MediaType,java.awt.PageAttributes$OrientationRequestedType,java.awt.PageAttributes$OriginType,java.awt.PageAttributes$PrintQualityType,int[])}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageAttributes_ColorType_MediaType_OrientationRequestedType_OriginType_PrintQualityType_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.PageAttributes sut = null; // = new
                                                  // PageAttributes(java.awt.PageAttributes.ColorType,java.awt.PageAttributes.MediaType,java.awt.PageAttributes.OrientationRequestedType,java.awt.PageAttributes.OriginType,java.awt.PageAttributes.PrintQualityType,int[]);
    }

    /**
     * Test method for {@link java.awt.PageAttributes#PageAttributes(java.awt.PageAttributes) public
     * java.awt.PageAttributes(java.awt.PageAttributes)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageAttributes_PageAttributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.PageAttributes sut = null; // = new PageAttributes(java.awt.PageAttributes);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.PageAttributes> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.PageAttributes.class.isAssignableFrom(sut));
    }

}
