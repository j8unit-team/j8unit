package org.j8unit.repository.java.util.zip;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.zip.ZipFile class java.util.zip.ZipFile},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.zip.ZipFileTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.zip.ZipFileTests
 */
@Category(J8UnitRepository.class)
public abstract interface ZipFileClassTests<SUT extends Class<? extends java.util.zip.ZipFile>>
extends org.j8unit.repository.java.io.CloseableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link java.util.zip.ZipFile#ZipFile(java.lang.String,java.nio.charset.Charset) public java.util.zip.ZipFile(java.lang.String,java.nio.charset.Charset) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ZipFile_String_Charset() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.zip.ZipFile sut = null; // = new ZipFile(java.lang.String,java.nio.charset.Charset);
    }

    /**
     * Test method for {@link java.util.zip.ZipFile#ZipFile(java.io.File,int,java.nio.charset.Charset) public java.util.zip.ZipFile(java.io.File,int,java.nio.charset.Charset) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ZipFile_File_int_Charset() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.zip.ZipFile sut = null; // = new ZipFile(java.io.File,int,java.nio.charset.Charset);
    }

    /**
     * Test method for {@link java.util.zip.ZipFile#ZipFile(java.io.File) public java.util.zip.ZipFile(java.io.File) throws java.util.zip.ZipException,java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ZipFile_File() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.zip.ZipFile sut = null; // = new ZipFile(java.io.File);
    }

    /**
     * Test method for {@link java.util.zip.ZipFile#ZipFile(java.io.File,java.nio.charset.Charset) public java.util.zip.ZipFile(java.io.File,java.nio.charset.Charset) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ZipFile_File_Charset() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.zip.ZipFile sut = null; // = new ZipFile(java.io.File,java.nio.charset.Charset);
    }

    /**
     * Test method for {@link java.util.zip.ZipFile#ZipFile(java.lang.String) public java.util.zip.ZipFile(java.lang.String) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ZipFile_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.zip.ZipFile sut = null; // = new ZipFile(java.lang.String);
    }

    /**
     * Test method for {@link java.util.zip.ZipFile#ZipFile(java.io.File,int) public java.util.zip.ZipFile(java.io.File,int) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ZipFile_File_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.zip.ZipFile sut = null; // = new ZipFile(java.io.File,int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.zip.ZipFile> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.zip.ZipFile.class.isAssignableFrom(sut));
    }

}
