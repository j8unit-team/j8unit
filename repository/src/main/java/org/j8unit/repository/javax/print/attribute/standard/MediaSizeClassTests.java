package org.j8unit.repository.javax.print.attribute.standard;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.attribute.standard.MediaSize class javax.print.attribute.standard.MediaSize},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MediaSizeClassTests<SUT extends javax.print.attribute.standard.MediaSize>
extends org.j8unit.repository.javax.print.attribute.AttributeClassTests<SUT>, org.j8unit.repository.javax.print.attribute.Size2DSyntaxClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$Engineering class
     * javax.print.attribute.standard.MediaSize$Engineering}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.EngineeringTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.EngineeringTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EngineeringClassTests<SUT extends javax.print.attribute.standard.MediaSize.Engineering>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.attribute.standard.MediaSize.Engineering.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$ISO class
     * javax.print.attribute.standard.MediaSize$ISO}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.ISOTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.ISOTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ISOClassTests<SUT extends javax.print.attribute.standard.MediaSize.ISO>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.attribute.standard.MediaSize.ISO.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$JIS class
     * javax.print.attribute.standard.MediaSize$JIS}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.JISTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.JISTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface JISClassTests<SUT extends javax.print.attribute.standard.MediaSize.JIS>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.attribute.standard.MediaSize.JIS.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$NA class
     * javax.print.attribute.standard.MediaSize$NA}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.NATests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.NATests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface NAClassTests<SUT extends javax.print.attribute.standard.MediaSize.NA>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.attribute.standard.MediaSize.NA.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.print.attribute.standard.MediaSize$Other class
     * javax.print.attribute.standard.MediaSize$Other}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.OtherTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.OtherTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OtherClassTests<SUT extends javax.print.attribute.standard.MediaSize.Other>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.attribute.standard.MediaSize.Other.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.print.attribute.standard.MediaSize#MediaSize(float,float,int) public
     * javax.print.attribute.standard.MediaSize(float,float,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_float_float_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new MediaSize(float,float,int);
    }

    /**
     * Test method for
     * {@link javax.print.attribute.standard.MediaSize#MediaSize(float,float,int,javax.print.attribute.standard.MediaSizeName)
     * public javax.print.attribute.standard.MediaSize(float,float,int,javax.print.attribute.standard.MediaSizeName)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_float_float_int_MediaSizeName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new
                                                                   // MediaSize(float,float,int,javax.print.attribute.standard.MediaSizeName);
    }

    /**
     * Test method for {@link javax.print.attribute.standard.MediaSize#MediaSize(int,int,int) public
     * javax.print.attribute.standard.MediaSize(int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new MediaSize(int,int,int);
    }

    /**
     * Test method for
     * {@link javax.print.attribute.standard.MediaSize#MediaSize(int,int,int,javax.print.attribute.standard.MediaSizeName)
     * public javax.print.attribute.standard.MediaSize(int,int,int,javax.print.attribute.standard.MediaSizeName)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_int_int_int_MediaSizeName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new
                                                                   // MediaSize(int,int,int,javax.print.attribute.standard.MediaSizeName);
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#findMedia(float,float,int) public static
     * javax.print.attribute.standard.MediaSizeName javax.print.attribute.standard.MediaSize.findMedia(float,float,int)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findMedia_float_float_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.attribute.standard.MediaSize#getMediaSizeForName(javax.print.attribute.standard.MediaSizeName)
     * public static javax.print.attribute.standard.MediaSize
     * javax.print.attribute.standard.MediaSize.getMediaSizeForName(javax.print.attribute.standard.MediaSizeName)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMediaSizeForName_MediaSizeName()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.attribute.standard.MediaSize.class.isAssignableFrom(sut));
    }

}
