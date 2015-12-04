package org.j8unit.repository.java.io;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.io.FileWriter class java.io.FileWriter}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.io.FileWriterTests}.
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
 * @see org.j8unit.repository.java.io.FileWriterTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileWriterClassTests<SUT extends Class<? extends java.io.FileWriter>>
extends org.j8unit.repository.java.io.OutputStreamWriterClassTests<SUT> {

    /**
     * Test method for {@link java.io.FileWriter#FileWriter(java.io.File) public java.io.FileWriter(java.io.File) throws
     * java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileWriter_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.FileWriter sut = null; // = new FileWriter(java.io.File);
    }

    /**
     * Test method for {@link java.io.FileWriter#FileWriter(java.io.File,boolean) public
     * java.io.FileWriter(java.io.File,boolean) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileWriter_File_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.FileWriter sut = null; // = new FileWriter(java.io.File,boolean);
    }

    /**
     * Test method for {@link java.io.FileWriter#FileWriter(java.io.FileDescriptor) public
     * java.io.FileWriter(java.io.FileDescriptor)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileWriter_FileDescriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.FileWriter sut = null; // = new FileWriter(java.io.FileDescriptor);
    }

    /**
     * Test method for {@link java.io.FileWriter#FileWriter(java.lang.String) public
     * java.io.FileWriter(java.lang.String) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileWriter_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.FileWriter sut = null; // = new FileWriter(java.lang.String);
    }

    /**
     * Test method for {@link java.io.FileWriter#FileWriter(java.lang.String,boolean) public
     * java.io.FileWriter(java.lang.String,boolean) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileWriter_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.FileWriter sut = null; // = new FileWriter(java.lang.String,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.io.FileWriter> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.FileWriter.class.isAssignableFrom(sut));
    }

}
