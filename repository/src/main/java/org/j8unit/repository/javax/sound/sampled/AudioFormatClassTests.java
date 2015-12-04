package org.j8unit.repository.javax.sound.sampled;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.AudioFormat class javax.sound.sampled.AudioFormat}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.AudioFormatTests}.
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
 * @see org.j8unit.repository.javax.sound.sampled.AudioFormatTests
 */
@Category(J8UnitRepository.class)
public abstract interface AudioFormatClassTests<SUT extends Class<? extends javax.sound.sampled.AudioFormat>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.sound.sampled.AudioFormat$Encoding class javax.sound.sampled.AudioFormat$Encoding},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.sound.sampled.AudioFormatTests.EncodingTests}.
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
     * @see org.j8unit.repository.javax.sound.sampled.AudioFormatTests.EncodingTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface EncodingClassTests<SUT extends Class<? extends javax.sound.sampled.AudioFormat.Encoding>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.sound.sampled.AudioFormat.Encoding#Encoding(java.lang.String) public
         * javax.sound.sampled.AudioFormat$Encoding(java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Encoding_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.sound.sampled.AudioFormat.Encoding sut = null; // = new Encoding(java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.sound.sampled.AudioFormat.Encoding> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.sound.sampled.AudioFormat.Encoding.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for
     * {@link javax.sound.sampled.AudioFormat#AudioFormat(javax.sound.sampled.AudioFormat.Encoding,float,int,int,int,float,boolean)
     * public javax.sound.sampled.AudioFormat(javax.sound.sampled.AudioFormat$Encoding,float,int,int,int,float,boolean)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AudioFormat_Encoding_float_int_int_int_float_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.sound.sampled.AudioFormat sut = null; // = new
                                                          // AudioFormat(javax.sound.sampled.AudioFormat.Encoding,float,int,int,int,float,boolean);
    }

    /**
     * Test method for
     * {@link javax.sound.sampled.AudioFormat#AudioFormat(javax.sound.sampled.AudioFormat.Encoding,float,int,int,int,float,boolean,java.util.Map)
     * public
     * javax.sound.sampled.AudioFormat(javax.sound.sampled.AudioFormat$Encoding,float,int,int,int,float,boolean,java.util.Map)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AudioFormat_Encoding_float_int_int_int_float_boolean_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.sound.sampled.AudioFormat sut = null; // = new
                                                          // AudioFormat(javax.sound.sampled.AudioFormat.Encoding,float,int,int,int,float,boolean,java.util.Map);
    }

    /**
     * Test method for {@link javax.sound.sampled.AudioFormat#AudioFormat(float,int,int,boolean,boolean) public
     * javax.sound.sampled.AudioFormat(float,int,int,boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AudioFormat_float_int_int_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.sound.sampled.AudioFormat sut = null; // = new AudioFormat(float,int,int,boolean,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.sound.sampled.AudioFormat> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.sound.sampled.AudioFormat.class.isAssignableFrom(sut));
    }

}
