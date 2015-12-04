package org.j8unit.repository.javax.swing.plaf;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.BorderUIResource class javax.swing.plaf.BorderUIResource}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource>>
extends org.j8unit.repository.javax.swing.border.BorderClassTests<SUT>, org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>,
org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.BorderUIResource$BevelBorderUIResource class
     * javax.swing.plaf.BorderUIResource$BevelBorderUIResource}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.BevelBorderUIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.BevelBorderUIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BevelBorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource.BevelBorderUIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.BevelBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.BorderUIResource.BevelBorderUIResource#BevelBorderUIResource(int)
         * public javax.swing.plaf.BorderUIResource$BevelBorderUIResource(int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BevelBorderUIResource_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.BevelBorderUIResource sut = null; // = new
                                                                                      // BevelBorderUIResource(int);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.BevelBorderUIResource#BevelBorderUIResource(int,java.awt.Color,java.awt.Color)
         * public javax.swing.plaf.BorderUIResource$BevelBorderUIResource(int,java.awt.Color,java.awt.Color)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BevelBorderUIResource_int_Color_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.BevelBorderUIResource sut = null; // = new
                                                                                      // BevelBorderUIResource(int,java.awt.Color,java.awt.Color);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.BevelBorderUIResource#BevelBorderUIResource(int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)
         * public
         * javax.swing.plaf.BorderUIResource$BevelBorderUIResource(int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BevelBorderUIResource_int_Color_Color_Color_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.BevelBorderUIResource sut = null; // = new
                                                                                      // BevelBorderUIResource(int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.BorderUIResource.BevelBorderUIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.BorderUIResource.BevelBorderUIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.BorderUIResource$CompoundBorderUIResource class
     * javax.swing.plaf.BorderUIResource$CompoundBorderUIResource}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.CompoundBorderUIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.CompoundBorderUIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CompoundBorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource.CompoundBorderUIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.CompoundBorderClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.CompoundBorderUIResource#CompoundBorderUIResource(javax.swing.border.Border,javax.swing.border.Border)
         * public
         * javax.swing.plaf.BorderUIResource$CompoundBorderUIResource(javax.swing.border.Border,javax.swing.border.Border)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CompoundBorderUIResource_Border_Border()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.CompoundBorderUIResource sut = null; // = new
                                                                                         // CompoundBorderUIResource(javax.swing.border.Border,javax.swing.border.Border);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.BorderUIResource.CompoundBorderUIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.BorderUIResource.CompoundBorderUIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.BorderUIResource$EmptyBorderUIResource class
     * javax.swing.plaf.BorderUIResource$EmptyBorderUIResource}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.EmptyBorderUIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.EmptyBorderUIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EmptyBorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource.EmptyBorderUIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.EmptyBorderClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.EmptyBorderUIResource#EmptyBorderUIResource(java.awt.Insets) public
         * javax.swing.plaf.BorderUIResource$EmptyBorderUIResource(java.awt.Insets)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_EmptyBorderUIResource_Insets()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.EmptyBorderUIResource sut = null; // = new
                                                                                      // EmptyBorderUIResource(java.awt.Insets);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.EmptyBorderUIResource#EmptyBorderUIResource(int,int,int,int) public
         * javax.swing.plaf.BorderUIResource$EmptyBorderUIResource(int,int,int,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_EmptyBorderUIResource_int_int_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.EmptyBorderUIResource sut = null; // = new
                                                                                      // EmptyBorderUIResource(int,int,int,int);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.BorderUIResource.EmptyBorderUIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.BorderUIResource.EmptyBorderUIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.BorderUIResource$EtchedBorderUIResource class
     * javax.swing.plaf.BorderUIResource$EtchedBorderUIResource}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.EtchedBorderUIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.EtchedBorderUIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EtchedBorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource.EtchedBorderUIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.EtchedBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.BorderUIResource.EtchedBorderUIResource#EtchedBorderUIResource()
         * public javax.swing.plaf.BorderUIResource$EtchedBorderUIResource()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_EtchedBorderUIResource()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.EtchedBorderUIResource sut = null; // = new
                                                                                       // EtchedBorderUIResource();
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.EtchedBorderUIResource#EtchedBorderUIResource(java.awt.Color,java.awt.Color)
         * public javax.swing.plaf.BorderUIResource$EtchedBorderUIResource(java.awt.Color,java.awt.Color)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_EtchedBorderUIResource_Color_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.EtchedBorderUIResource sut = null; // = new
                                                                                       // EtchedBorderUIResource(java.awt.Color,java.awt.Color);
        }

        /**
         * Test method for {@link javax.swing.plaf.BorderUIResource.EtchedBorderUIResource#EtchedBorderUIResource(int)
         * public javax.swing.plaf.BorderUIResource$EtchedBorderUIResource(int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_EtchedBorderUIResource_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.EtchedBorderUIResource sut = null; // = new
                                                                                       // EtchedBorderUIResource(int);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.EtchedBorderUIResource#EtchedBorderUIResource(int,java.awt.Color,java.awt.Color)
         * public javax.swing.plaf.BorderUIResource$EtchedBorderUIResource(int,java.awt.Color,java.awt.Color)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_EtchedBorderUIResource_int_Color_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.EtchedBorderUIResource sut = null; // = new
                                                                                       // EtchedBorderUIResource(int,java.awt.Color,java.awt.Color);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.BorderUIResource.EtchedBorderUIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.BorderUIResource.EtchedBorderUIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.BorderUIResource$LineBorderUIResource class
     * javax.swing.plaf.BorderUIResource$LineBorderUIResource}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.LineBorderUIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.LineBorderUIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LineBorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource.LineBorderUIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.LineBorderClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.LineBorderUIResource#LineBorderUIResource(java.awt.Color) public
         * javax.swing.plaf.BorderUIResource$LineBorderUIResource(java.awt.Color)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LineBorderUIResource_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.LineBorderUIResource sut = null; // = new
                                                                                     // LineBorderUIResource(java.awt.Color);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.LineBorderUIResource#LineBorderUIResource(java.awt.Color,int) public
         * javax.swing.plaf.BorderUIResource$LineBorderUIResource(java.awt.Color,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LineBorderUIResource_Color_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.LineBorderUIResource sut = null; // = new
                                                                                     // LineBorderUIResource(java.awt.Color,int);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.BorderUIResource.LineBorderUIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.BorderUIResource.LineBorderUIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.BorderUIResource$MatteBorderUIResource class
     * javax.swing.plaf.BorderUIResource$MatteBorderUIResource}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.MatteBorderUIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.MatteBorderUIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MatteBorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource.MatteBorderUIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.MatteBorderClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.MatteBorderUIResource#MatteBorderUIResource(javax.swing.Icon) public
         * javax.swing.plaf.BorderUIResource$MatteBorderUIResource(javax.swing.Icon)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MatteBorderUIResource_Icon()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.MatteBorderUIResource sut = null; // = new
                                                                                      // MatteBorderUIResource(javax.swing.Icon);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.MatteBorderUIResource#MatteBorderUIResource(int,int,int,int,java.awt.Color)
         * public javax.swing.plaf.BorderUIResource$MatteBorderUIResource(int,int,int,int,java.awt.Color)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MatteBorderUIResource_int_int_int_int_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.MatteBorderUIResource sut = null; // = new
                                                                                      // MatteBorderUIResource(int,int,int,int,java.awt.Color);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.MatteBorderUIResource#MatteBorderUIResource(int,int,int,int,javax.swing.Icon)
         * public javax.swing.plaf.BorderUIResource$MatteBorderUIResource(int,int,int,int,javax.swing.Icon)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MatteBorderUIResource_int_int_int_int_Icon()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.MatteBorderUIResource sut = null; // = new
                                                                                      // MatteBorderUIResource(int,int,int,int,javax.swing.Icon);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.BorderUIResource.MatteBorderUIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.BorderUIResource.MatteBorderUIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.BorderUIResource$TitledBorderUIResource class
     * javax.swing.plaf.BorderUIResource$TitledBorderUIResource}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.TitledBorderUIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.TitledBorderUIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TitledBorderUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.BorderUIResource.TitledBorderUIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.TitledBorderClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.TitledBorderUIResource#TitledBorderUIResource(javax.swing.border.Border)
         * public javax.swing.plaf.BorderUIResource$TitledBorderUIResource(javax.swing.border.Border)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TitledBorderUIResource_Border()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.TitledBorderUIResource sut = null; // = new
                                                                                       // TitledBorderUIResource(javax.swing.border.Border);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.TitledBorderUIResource#TitledBorderUIResource(javax.swing.border.Border,java.lang.String)
         * public javax.swing.plaf.BorderUIResource$TitledBorderUIResource(javax.swing.border.Border,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TitledBorderUIResource_Border_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.TitledBorderUIResource sut = null; // = new
                                                                                       // TitledBorderUIResource(javax.swing.border.Border,java.lang.String);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.TitledBorderUIResource#TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int)
         * public
         * javax.swing.plaf.BorderUIResource$TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TitledBorderUIResource_Border_String_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.TitledBorderUIResource sut = null; // = new
                                                                                       // TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.TitledBorderUIResource#TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font)
         * public
         * javax.swing.plaf.BorderUIResource$TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TitledBorderUIResource_Border_String_int_int_Font()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.TitledBorderUIResource sut = null; // = new
                                                                                       // TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.TitledBorderUIResource#TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font,java.awt.Color)
         * public
         * javax.swing.plaf.BorderUIResource$TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font,java.awt.Color)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TitledBorderUIResource_Border_String_int_int_Font_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.TitledBorderUIResource sut = null; // = new
                                                                                       // TitledBorderUIResource(javax.swing.border.Border,java.lang.String,int,int,java.awt.Font,java.awt.Color);
        }

        /**
         * Test method for
         * {@link javax.swing.plaf.BorderUIResource.TitledBorderUIResource#TitledBorderUIResource(java.lang.String)
         * public javax.swing.plaf.BorderUIResource$TitledBorderUIResource(java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TitledBorderUIResource_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.BorderUIResource.TitledBorderUIResource sut = null; // = new
                                                                                       // TitledBorderUIResource(java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.BorderUIResource.TitledBorderUIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.BorderUIResource.TitledBorderUIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.plaf.BorderUIResource#BorderUIResource(javax.swing.border.Border) public
     * javax.swing.plaf.BorderUIResource(javax.swing.border.Border)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BorderUIResource_Border()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.BorderUIResource sut = null; // = new BorderUIResource(javax.swing.border.Border);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#getBlackLineBorderUIResource() public static
     * javax.swing.border.Border javax.swing.plaf.BorderUIResource.getBlackLineBorderUIResource()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBlackLineBorderUIResource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#getEtchedBorderUIResource() public static
     * javax.swing.border.Border javax.swing.plaf.BorderUIResource.getEtchedBorderUIResource()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEtchedBorderUIResource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#getLoweredBevelBorderUIResource() public static
     * javax.swing.border.Border javax.swing.plaf.BorderUIResource.getLoweredBevelBorderUIResource()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoweredBevelBorderUIResource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.BorderUIResource#getRaisedBevelBorderUIResource() public static
     * javax.swing.border.Border javax.swing.plaf.BorderUIResource.getRaisedBevelBorderUIResource()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRaisedBevelBorderUIResource()
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
        final Class<? extends javax.swing.plaf.BorderUIResource> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.BorderUIResource.class.isAssignableFrom(sut));
    }

}
