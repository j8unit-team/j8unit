package org.j8unit.repository.javax.print.attribute.standard;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.MediaSize class
 * javax.print.attribute.standard.MediaSize}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.attribute.standard.MediaSize
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MediaSizeClassTests<SUT extends javax.print.attribute.standard.MediaSize>
extends org.j8unit.repository.javax.print.attribute.AttributeClassTests<SUT>, org.j8unit.repository.javax.print.attribute.Size2DSyntaxClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.MediaSize.Engineering class
     * javax.print.attribute.standard.MediaSize$Engineering}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.EngineeringTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.EngineeringTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize.Engineering
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EngineeringClassTests<SUT extends javax.print.attribute.standard.MediaSize.Engineering>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.attribute.standard.MediaSize.Engineering#isAssignableFrom(java.lang.Class)
         */
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
     * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.MediaSize.ISO class
     * javax.print.attribute.standard.MediaSize$ISO}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.ISOTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.ISOTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize.ISO
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ISOClassTests<SUT extends javax.print.attribute.standard.MediaSize.ISO>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.attribute.standard.MediaSize.ISO#isAssignableFrom(java.lang.Class)
         */
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
     * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.MediaSize.JIS class
     * javax.print.attribute.standard.MediaSize$JIS}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.JISTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.JISTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize.JIS
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface JISClassTests<SUT extends javax.print.attribute.standard.MediaSize.JIS>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.attribute.standard.MediaSize.JIS#isAssignableFrom(java.lang.Class)
         */
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
     * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.MediaSize.NA class
     * javax.print.attribute.standard.MediaSize$NA}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.NATests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.NATests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize.NA
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface NAClassTests<SUT extends javax.print.attribute.standard.MediaSize.NA>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.attribute.standard.MediaSize.NA#isAssignableFrom(java.lang.Class)
         */
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
     * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.MediaSize.Other class
     * javax.print.attribute.standard.MediaSize$Other}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.OtherTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.print.attribute.standard.MediaSizeTests.OtherTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize.Other
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OtherClassTests<SUT extends javax.print.attribute.standard.MediaSize.Other>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.attribute.standard.MediaSize.Other#isAssignableFrom(java.lang.Class)
         */
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
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#MediaSize(float, float, int) public
     * javax.print.attribute.standard.MediaSize(float,float,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize#MediaSize(float, float, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_float_float_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new MediaSize(float, float, int);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.attribute.standard.MediaSize#MediaSize(float, float, int, javax.print.attribute.standard.MediaSizeName)
     * public javax.print.attribute.standard.MediaSize(float,float,int,javax.print.attribute.standard.MediaSizeName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize#MediaSize(float, float, int,
     *             javax.print.attribute.standard.MediaSizeName)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_float_float_int_MediaSizeName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new MediaSize(float, float, int,
                                                                   // javax.print.attribute.standard.MediaSizeName);
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#MediaSize(int, int, int) public
     * javax.print.attribute.standard.MediaSize(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize#MediaSize(int, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new MediaSize(int, int, int);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.attribute.standard.MediaSize#MediaSize(int, int, int, javax.print.attribute.standard.MediaSizeName)
     * public javax.print.attribute.standard.MediaSize(int,int,int,javax.print.attribute.standard.MediaSizeName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize#MediaSize(int, int, int,
     *             javax.print.attribute.standard.MediaSizeName)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MediaSize_int_int_int_MediaSizeName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.MediaSize sut = null; // = new MediaSize(int, int, int,
                                                                   // javax.print.attribute.standard.MediaSizeName);
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.MediaSize#findMedia(float, float, int) public static
     * javax.print.attribute.standard.MediaSizeName javax.print.attribute.standard.MediaSize.findMedia(float,float,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize#findMedia(float, float, int)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize#getMediaSizeForName(javax.print.attribute.standard.
     *             MediaSizeName)
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

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.print.attribute.standard.MediaSize#isAssignableFrom(java.lang.Class)
     */
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
