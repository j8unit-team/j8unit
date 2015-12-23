package org.j8unit.repository.javax.print;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor class javax.print.DocFlavor}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.print.DocFlavorTests}.
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
 * @see org.j8unit.repository.javax.print.DocFlavorTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.DocFlavor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocFlavorClassTests<SUT extends javax.print.DocFlavor>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor.BYTE_ARRAY class
     * javax.print.DocFlavor$BYTE_ARRAY}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.DocFlavorTests.BYTE_ARRAYTests}.
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
     * @see org.j8unit.repository.javax.print.DocFlavorTests.BYTE_ARRAYTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.DocFlavor.BYTE_ARRAY
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BYTE_ARRAYClassTests<SUT extends javax.print.DocFlavor.BYTE_ARRAY>
    extends org.j8unit.repository.javax.print.DocFlavorClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.print.DocFlavor.BYTE_ARRAY#BYTE_ARRAY(java.lang.String) public
         * javax.print.DocFlavor$BYTE_ARRAY(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.print.DocFlavor.BYTE_ARRAY#BYTE_ARRAY(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BYTE_ARRAY_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.print.DocFlavor.BYTE_ARRAY sut = null; // = new BYTE_ARRAY(java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.DocFlavor.BYTE_ARRAY#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.DocFlavor.BYTE_ARRAY.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor.CHAR_ARRAY class
     * javax.print.DocFlavor$CHAR_ARRAY}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.DocFlavorTests.CHAR_ARRAYTests}.
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
     * @see org.j8unit.repository.javax.print.DocFlavorTests.CHAR_ARRAYTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.DocFlavor.CHAR_ARRAY
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CHAR_ARRAYClassTests<SUT extends javax.print.DocFlavor.CHAR_ARRAY>
    extends org.j8unit.repository.javax.print.DocFlavorClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.print.DocFlavor.CHAR_ARRAY#CHAR_ARRAY(java.lang.String) public
         * javax.print.DocFlavor$CHAR_ARRAY(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.print.DocFlavor.CHAR_ARRAY#CHAR_ARRAY(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CHAR_ARRAY_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.print.DocFlavor.CHAR_ARRAY sut = null; // = new CHAR_ARRAY(java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.DocFlavor.CHAR_ARRAY#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.DocFlavor.CHAR_ARRAY.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor.INPUT_STREAM class
     * javax.print.DocFlavor$INPUT_STREAM}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.DocFlavorTests.INPUT_STREAMTests}.
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
     * @see org.j8unit.repository.javax.print.DocFlavorTests.INPUT_STREAMTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.DocFlavor.INPUT_STREAM
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface INPUT_STREAMClassTests<SUT extends javax.print.DocFlavor.INPUT_STREAM>
    extends org.j8unit.repository.javax.print.DocFlavorClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.print.DocFlavor.INPUT_STREAM#INPUT_STREAM(java.lang.String) public
         * javax.print.DocFlavor$INPUT_STREAM(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.print.DocFlavor.INPUT_STREAM#INPUT_STREAM(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_INPUT_STREAM_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.print.DocFlavor.INPUT_STREAM sut = null; // = new INPUT_STREAM(java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.DocFlavor.INPUT_STREAM#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.DocFlavor.INPUT_STREAM.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor.READER class javax.print.DocFlavor$READER},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.print.DocFlavorTests.READERTests}.
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
     * @see org.j8unit.repository.javax.print.DocFlavorTests.READERTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.DocFlavor.READER
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface READERClassTests<SUT extends javax.print.DocFlavor.READER>
    extends org.j8unit.repository.javax.print.DocFlavorClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.print.DocFlavor.READER#READER(java.lang.String) public
         * javax.print.DocFlavor$READER(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.print.DocFlavor.READER#READER(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_READER_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.print.DocFlavor.READER sut = null; // = new READER(java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.DocFlavor.READER#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.DocFlavor.READER.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor.SERVICE_FORMATTED class
     * javax.print.DocFlavor$SERVICE_FORMATTED}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.print.DocFlavorTests.SERVICE_FORMATTEDTests}.
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
     * @see org.j8unit.repository.javax.print.DocFlavorTests.SERVICE_FORMATTEDTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.DocFlavor.SERVICE_FORMATTED
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SERVICE_FORMATTEDClassTests<SUT extends javax.print.DocFlavor.SERVICE_FORMATTED>
    extends org.j8unit.repository.javax.print.DocFlavorClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.print.DocFlavor.SERVICE_FORMATTED#SERVICE_FORMATTED(java.lang.String) public
         * javax.print.DocFlavor$SERVICE_FORMATTED(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.print.DocFlavor.SERVICE_FORMATTED#SERVICE_FORMATTED(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SERVICE_FORMATTED_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.print.DocFlavor.SERVICE_FORMATTED sut = null; // = new SERVICE_FORMATTED(java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.DocFlavor.SERVICE_FORMATTED#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.DocFlavor.SERVICE_FORMATTED.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor.STRING class javax.print.DocFlavor$STRING},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.print.DocFlavorTests.STRINGTests}.
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
     * @see org.j8unit.repository.javax.print.DocFlavorTests.STRINGTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.DocFlavor.STRING
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface STRINGClassTests<SUT extends javax.print.DocFlavor.STRING>
    extends org.j8unit.repository.javax.print.DocFlavorClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.print.DocFlavor.STRING#STRING(java.lang.String) public
         * javax.print.DocFlavor$STRING(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.print.DocFlavor.STRING#STRING(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_STRING_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.print.DocFlavor.STRING sut = null; // = new STRING(java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.DocFlavor.STRING#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.DocFlavor.STRING.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.print.DocFlavor.URL class javax.print.DocFlavor$URL},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.print.DocFlavorTests.URLTests}.
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
     * @see org.j8unit.repository.javax.print.DocFlavorTests.URLTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.print.DocFlavor.URL
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface URLClassTests<SUT extends javax.print.DocFlavor.URL>
    extends org.j8unit.repository.javax.print.DocFlavorClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.print.DocFlavor.URL#URL(java.lang.String) public
         * javax.print.DocFlavor$URL(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.print.DocFlavor.URL#URL(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_URL_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.print.DocFlavor.URL sut = null; // = new URL(java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.print.DocFlavor.URL#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.print.DocFlavor.URL.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.print.DocFlavor#DocFlavor(java.lang.String, java.lang.String) public
     * javax.print.DocFlavor(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.DocFlavor#DocFlavor(java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DocFlavor_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.DocFlavor sut = null; // = new DocFlavor(java.lang.String, java.lang.String);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.print.DocFlavor#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.DocFlavor.class.isAssignableFrom(sut));
    }

}
