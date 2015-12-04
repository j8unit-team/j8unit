package org.j8unit.repository.javax.sound.sampled;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.DataLine interface javax.sound.sampled.DataLine}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.DataLineTests}.
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
 * @see org.j8unit.repository.javax.sound.sampled.DataLineTests
 */
@Category(J8UnitRepository.class)
public abstract interface DataLineClassTests<SUT extends Class<? extends javax.sound.sampled.DataLine>>
extends org.j8unit.repository.javax.sound.sampled.LineClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.sound.sampled.DataLine$Info class javax.sound.sampled.DataLine$Info}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.sound.sampled.DataLineTests.InfoTests}.
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
     * @see org.j8unit.repository.javax.sound.sampled.DataLineTests.InfoTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InfoClassTests<SUT extends Class<? extends javax.sound.sampled.DataLine.Info>>
    extends org.j8unit.repository.javax.sound.sampled.LineClassTests.InfoClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.sound.sampled.DataLine.Info#Info(java.lang.Class,javax.sound.sampled.AudioFormat) public
         * javax.sound.sampled.DataLine$Info(java.lang.Class,javax.sound.sampled.AudioFormat)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Info_Class_AudioFormat()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.sound.sampled.DataLine.Info sut = null; // = new
                                                                // Info(java.lang.Class,javax.sound.sampled.AudioFormat);
        }

        /**
         * Test method for
         * {@link javax.sound.sampled.DataLine.Info#Info(java.lang.Class,javax.sound.sampled.AudioFormat,int) public
         * javax.sound.sampled.DataLine$Info(java.lang.Class,javax.sound.sampled.AudioFormat,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Info_Class_AudioFormat_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.sound.sampled.DataLine.Info sut = null; // = new
                                                                // Info(java.lang.Class,javax.sound.sampled.AudioFormat,int);
        }

        /**
         * Test method for
         * {@link javax.sound.sampled.DataLine.Info#Info(java.lang.Class,javax.sound.sampled.AudioFormat[],int,int)
         * public javax.sound.sampled.DataLine$Info(java.lang.Class,javax.sound.sampled.AudioFormat[],int,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Info_Class_AudioFormatArray_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.sound.sampled.DataLine.Info sut = null; // = new
                                                                // Info(java.lang.Class,javax.sound.sampled.AudioFormat[],int,int);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.sound.sampled.DataLine.Info> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.sound.sampled.DataLine.Info.class.isAssignableFrom(sut));
        }

    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.sound.sampled.DataLine> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.sound.sampled.DataLine.class.isAssignableFrom(sut));
    }

}
