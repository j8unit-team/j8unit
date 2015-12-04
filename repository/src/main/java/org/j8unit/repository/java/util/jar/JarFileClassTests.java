package org.j8unit.repository.java.util.jar;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.jar.JarFile class java.util.jar.JarFile}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.util.jar.JarFileTests}.
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
 * @see org.j8unit.repository.java.util.jar.JarFileTests
 */
@Category(J8UnitRepository.class)
public abstract interface JarFileClassTests<SUT extends Class<? extends java.util.jar.JarFile>>
extends org.j8unit.repository.java.util.zip.ZipFileClassTests<SUT> {

    /**
     * Test method for {@link java.util.jar.JarFile#JarFile(java.io.File,boolean,int) public
     * java.util.jar.JarFile(java.io.File,boolean,int) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JarFile_File_boolean_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.JarFile sut = null; // = new JarFile(java.io.File,boolean,int);
    }

    /**
     * Test method for {@link java.util.jar.JarFile#JarFile(java.io.File,boolean) public
     * java.util.jar.JarFile(java.io.File,boolean) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JarFile_File_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.JarFile sut = null; // = new JarFile(java.io.File,boolean);
    }

    /**
     * Test method for {@link java.util.jar.JarFile#JarFile(java.io.File) public java.util.jar.JarFile(java.io.File)
     * throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JarFile_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.JarFile sut = null; // = new JarFile(java.io.File);
    }

    /**
     * Test method for {@link java.util.jar.JarFile#JarFile(java.lang.String,boolean) public
     * java.util.jar.JarFile(java.lang.String,boolean) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JarFile_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.JarFile sut = null; // = new JarFile(java.lang.String,boolean);
    }

    /**
     * Test method for {@link java.util.jar.JarFile#JarFile(java.lang.String) public
     * java.util.jar.JarFile(java.lang.String) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JarFile_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.JarFile sut = null; // = new JarFile(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.jar.JarFile> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.jar.JarFile.class.isAssignableFrom(sut));
    }

}
