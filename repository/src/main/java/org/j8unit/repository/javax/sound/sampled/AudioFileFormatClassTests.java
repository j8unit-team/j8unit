package org.j8unit.repository.javax.sound.sampled;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.AudioFileFormat class javax.sound.sampled.AudioFileFormat}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests}.
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
 * @see org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests
 */
@Category(J8UnitRepository.class)
public abstract interface AudioFileFormatClassTests<SUT extends Class<? extends javax.sound.sampled.AudioFileFormat>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.sound.sampled.AudioFileFormat$Type class javax.sound.sampled.AudioFileFormat$Type},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests.TypeTests}.
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
     * @see org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests.TypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TypeClassTests<SUT extends Class<? extends javax.sound.sampled.AudioFileFormat.Type>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.sound.sampled.AudioFileFormat.Type#Type(java.lang.String,java.lang.String)
         * public javax.sound.sampled.AudioFileFormat$Type(java.lang.String,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Type_String_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.sound.sampled.AudioFileFormat.Type sut = null; // = new Type(java.lang.String,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.sound.sampled.AudioFileFormat.Type> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.sound.sampled.AudioFileFormat.Type.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for
     * {@link javax.sound.sampled.AudioFileFormat#AudioFileFormat(javax.sound.sampled.AudioFileFormat.Type,javax.sound.sampled.AudioFormat,int)
     * public
     * javax.sound.sampled.AudioFileFormat(javax.sound.sampled.AudioFileFormat$Type,javax.sound.sampled.AudioFormat,int)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AudioFileFormat_Type_AudioFormat_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.sound.sampled.AudioFileFormat sut = null; // = new
                                                              // AudioFileFormat(javax.sound.sampled.AudioFileFormat.Type,javax.sound.sampled.AudioFormat,int);
    }

    /**
     * Test method for
     * {@link javax.sound.sampled.AudioFileFormat#AudioFileFormat(javax.sound.sampled.AudioFileFormat.Type,javax.sound.sampled.AudioFormat,int,java.util.Map)
     * public
     * javax.sound.sampled.AudioFileFormat(javax.sound.sampled.AudioFileFormat$Type,javax.sound.sampled.AudioFormat,int,java.util.Map)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AudioFileFormat_Type_AudioFormat_int_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.sound.sampled.AudioFileFormat sut = null; // = new
                                                              // AudioFileFormat(javax.sound.sampled.AudioFileFormat.Type,javax.sound.sampled.AudioFormat,int,java.util.Map);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.sound.sampled.AudioFileFormat> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.sound.sampled.AudioFileFormat.class.isAssignableFrom(sut));
    }

}
