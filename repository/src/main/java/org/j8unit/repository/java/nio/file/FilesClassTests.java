package org.j8unit.repository.java.nio.file;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.Files class java.nio.file.Files}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.nio.file.FilesTests}.
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
 * @see org.j8unit.repository.java.nio.file.FilesTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilesClassTests<SUT extends java.nio.file.Files>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#copy(java.io.InputStream,java.nio.file.Path,java.nio.file.CopyOption...) public static
     * long java.nio.file.Files.copy(java.io.InputStream,java.nio.file.Path,java.nio.file.CopyOption...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copy_InputStream_Path_CopyOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#copy(java.nio.file.Path,java.io.OutputStream) public static long
     * java.nio.file.Files.copy(java.nio.file.Path,java.io.OutputStream) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copy_Path_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#copy(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...) public static
     * java.nio.file.Path java.nio.file.Files.copy(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copy_Path_Path_CopyOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createDirectories(java.nio.file.Path,java.nio.file.attribute.FileAttribute...) public
     * static java.nio.file.Path
     * java.nio.file.Files.createDirectories(java.nio.file.Path,java.nio.file.attribute.FileAttribute...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDirectories_Path_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createDirectory(java.nio.file.Path,java.nio.file.attribute.FileAttribute...) public
     * static java.nio.file.Path
     * java.nio.file.Files.createDirectory(java.nio.file.Path,java.nio.file.attribute.FileAttribute...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDirectory_Path_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createFile(java.nio.file.Path,java.nio.file.attribute.FileAttribute...) public static
     * java.nio.file.Path java.nio.file.Files.createFile(java.nio.file.Path,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createFile_Path_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#createLink(java.nio.file.Path,java.nio.file.Path) public static
     * java.nio.file.Path java.nio.file.Files.createLink(java.nio.file.Path,java.nio.file.Path) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createLink_Path_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createSymbolicLink(java.nio.file.Path,java.nio.file.Path,java.nio.file.attribute.FileAttribute...)
     * public static java.nio.file.Path
     * java.nio.file.Files.createSymbolicLink(java.nio.file.Path,java.nio.file.Path,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSymbolicLink_Path_Path_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createTempDirectory(java.nio.file.Path,java.lang.String,java.nio.file.attribute.FileAttribute...)
     * public static java.nio.file.Path
     * java.nio.file.Files.createTempDirectory(java.nio.file.Path,java.lang.String,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTempDirectory_Path_String_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createTempDirectory(java.lang.String,java.nio.file.attribute.FileAttribute...) public
     * static java.nio.file.Path
     * java.nio.file.Files.createTempDirectory(java.lang.String,java.nio.file.attribute.FileAttribute...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTempDirectory_String_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createTempFile(java.nio.file.Path,java.lang.String,java.lang.String,java.nio.file.attribute.FileAttribute...)
     * public static java.nio.file.Path
     * java.nio.file.Files.createTempFile(java.nio.file.Path,java.lang.String,java.lang.String,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTempFile_Path_String_String_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#createTempFile(java.lang.String,java.lang.String,java.nio.file.attribute.FileAttribute...)
     * public static java.nio.file.Path
     * java.nio.file.Files.createTempFile(java.lang.String,java.lang.String,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTempFile_String_String_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#delete(java.nio.file.Path) public static void
     * java.nio.file.Files.delete(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_delete_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#deleteIfExists(java.nio.file.Path) public static boolean
     * java.nio.file.Files.deleteIfExists(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteIfExists_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#exists(java.nio.file.Path,java.nio.file.LinkOption...) public static
     * boolean java.nio.file.Files.exists(java.nio.file.Path,java.nio.file.LinkOption...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exists_Path_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#find(java.nio.file.Path,int,java.util.function.BiPredicate,java.nio.file.FileVisitOption...)
     * public static java.util.stream.Stream
     * java.nio.file.Files.find(java.nio.file.Path,int,java.util.function.BiPredicate,java.nio.file.FileVisitOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_find_Path_int_BiPredicate_FileVisitOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#getAttribute(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...) public
     * static java.lang.Object
     * java.nio.file.Files.getAttribute(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_Path_String_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#getFileAttributeView(java.nio.file.Path,java.lang.Class,java.nio.file.LinkOption...)
     * public static java.nio.file.attribute.FileAttributeView
     * java.nio.file.Files.getFileAttributeView(java.nio.file.Path,java.lang.Class,java.nio.file.LinkOption...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileAttributeView_Path_Class_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#getFileStore(java.nio.file.Path) public static java.nio.file.FileStore
     * java.nio.file.Files.getFileStore(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileStore_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#getLastModifiedTime(java.nio.file.Path,java.nio.file.LinkOption...)
     * public static java.nio.file.attribute.FileTime
     * java.nio.file.Files.getLastModifiedTime(java.nio.file.Path,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLastModifiedTime_Path_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#getOwner(java.nio.file.Path,java.nio.file.LinkOption...) public static
     * java.nio.file.attribute.UserPrincipal
     * java.nio.file.Files.getOwner(java.nio.file.Path,java.nio.file.LinkOption...) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOwner_Path_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#getPosixFilePermissions(java.nio.file.Path,java.nio.file.LinkOption...) public static
     * java.util.Set java.nio.file.Files.getPosixFilePermissions(java.nio.file.Path,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPosixFilePermissions_Path_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isDirectory(java.nio.file.Path,java.nio.file.LinkOption...) public
     * static boolean java.nio.file.Files.isDirectory(java.nio.file.Path,java.nio.file.LinkOption...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDirectory_Path_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isExecutable(java.nio.file.Path) public static boolean
     * java.nio.file.Files.isExecutable(java.nio.file.Path)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isExecutable_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isHidden(java.nio.file.Path) public static boolean
     * java.nio.file.Files.isHidden(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isHidden_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isReadable(java.nio.file.Path) public static boolean
     * java.nio.file.Files.isReadable(java.nio.file.Path)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isReadable_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isRegularFile(java.nio.file.Path,java.nio.file.LinkOption...) public
     * static boolean java.nio.file.Files.isRegularFile(java.nio.file.Path,java.nio.file.LinkOption...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRegularFile_Path_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isSameFile(java.nio.file.Path,java.nio.file.Path) public static
     * boolean java.nio.file.Files.isSameFile(java.nio.file.Path,java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSameFile_Path_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isSymbolicLink(java.nio.file.Path) public static boolean
     * java.nio.file.Files.isSymbolicLink(java.nio.file.Path)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSymbolicLink_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#isWritable(java.nio.file.Path) public static boolean
     * java.nio.file.Files.isWritable(java.nio.file.Path)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWritable_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#lines(java.nio.file.Path) public static java.util.stream.Stream
     * java.nio.file.Files.lines(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lines_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#lines(java.nio.file.Path,java.nio.charset.Charset) public static
     * java.util.stream.Stream java.nio.file.Files.lines(java.nio.file.Path,java.nio.charset.Charset) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lines_Path_Charset()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#list(java.nio.file.Path) public static java.util.stream.Stream
     * java.nio.file.Files.list(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_list_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#move(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...) public static
     * java.nio.file.Path java.nio.file.Files.move(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_move_Path_Path_CopyOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newBufferedReader(java.nio.file.Path) public static
     * java.io.BufferedReader java.nio.file.Files.newBufferedReader(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newBufferedReader_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newBufferedReader(java.nio.file.Path,java.nio.charset.Charset) public
     * static java.io.BufferedReader java.nio.file.Files.newBufferedReader(java.nio.file.Path,java.nio.charset.Charset)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newBufferedReader_Path_Charset()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#newBufferedWriter(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
     * public static java.io.BufferedWriter
     * java.nio.file.Files.newBufferedWriter(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newBufferedWriter_Path_Charset_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newBufferedWriter(java.nio.file.Path,java.nio.file.OpenOption...)
     * public static java.io.BufferedWriter
     * java.nio.file.Files.newBufferedWriter(java.nio.file.Path,java.nio.file.OpenOption...) throws java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newBufferedWriter_Path_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newByteChannel(java.nio.file.Path,java.nio.file.OpenOption...) public
     * static java.nio.channels.SeekableByteChannel
     * java.nio.file.Files.newByteChannel(java.nio.file.Path,java.nio.file.OpenOption...) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newByteChannel_Path_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#newByteChannel(java.nio.file.Path,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * public static java.nio.channels.SeekableByteChannel
     * java.nio.file.Files.newByteChannel(java.nio.file.Path,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newByteChannel_Path_Set_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newDirectoryStream(java.nio.file.Path) public static
     * java.nio.file.DirectoryStream java.nio.file.Files.newDirectoryStream(java.nio.file.Path) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newDirectoryStream_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#newDirectoryStream(java.nio.file.Path,java.nio.file.DirectoryStream.Filter) public
     * static java.nio.file.DirectoryStream
     * java.nio.file.Files.newDirectoryStream(java.nio.file.Path,java.nio.file.DirectoryStream$Filter) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newDirectoryStream_Path_Filter()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newDirectoryStream(java.nio.file.Path,java.lang.String) public static
     * java.nio.file.DirectoryStream java.nio.file.Files.newDirectoryStream(java.nio.file.Path,java.lang.String) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newDirectoryStream_Path_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newInputStream(java.nio.file.Path,java.nio.file.OpenOption...) public
     * static java.io.InputStream java.nio.file.Files.newInputStream(java.nio.file.Path,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInputStream_Path_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#newOutputStream(java.nio.file.Path,java.nio.file.OpenOption...) public
     * static java.io.OutputStream java.nio.file.Files.newOutputStream(java.nio.file.Path,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newOutputStream_Path_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#notExists(java.nio.file.Path,java.nio.file.LinkOption...) public
     * static boolean java.nio.file.Files.notExists(java.nio.file.Path,java.nio.file.LinkOption...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_notExists_Path_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#probeContentType(java.nio.file.Path) public static java.lang.String
     * java.nio.file.Files.probeContentType(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_probeContentType_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#readAllBytes(java.nio.file.Path) public static byte[]
     * java.nio.file.Files.readAllBytes(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAllBytes_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#readAllLines(java.nio.file.Path) public static java.util.List
     * java.nio.file.Files.readAllLines(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAllLines_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#readAllLines(java.nio.file.Path,java.nio.charset.Charset) public
     * static java.util.List java.nio.file.Files.readAllLines(java.nio.file.Path,java.nio.charset.Charset) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAllLines_Path_Charset()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#readAttributes(java.nio.file.Path,java.lang.Class,java.nio.file.LinkOption...) public
     * static java.nio.file.attribute.BasicFileAttributes
     * java.nio.file.Files.readAttributes(java.nio.file.Path,java.lang.Class,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAttributes_Path_Class_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#readAttributes(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...) public
     * static java.util.Map
     * java.nio.file.Files.readAttributes(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAttributes_Path_String_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#readSymbolicLink(java.nio.file.Path) public static java.nio.file.Path
     * java.nio.file.Files.readSymbolicLink(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readSymbolicLink_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#setAttribute(java.nio.file.Path,java.lang.String,java.lang.Object,java.nio.file.LinkOption...)
     * public static java.nio.file.Path
     * java.nio.file.Files.setAttribute(java.nio.file.Path,java.lang.String,java.lang.Object,java.nio.file.LinkOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_Path_String_Object_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#setLastModifiedTime(java.nio.file.Path,java.nio.file.attribute.FileTime) public static
     * java.nio.file.Path java.nio.file.Files.setLastModifiedTime(java.nio.file.Path,java.nio.file.attribute.FileTime)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLastModifiedTime_Path_FileTime()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#setOwner(java.nio.file.Path,java.nio.file.attribute.UserPrincipal)
     * public static java.nio.file.Path
     * java.nio.file.Files.setOwner(java.nio.file.Path,java.nio.file.attribute.UserPrincipal) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOwner_Path_UserPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#setPosixFilePermissions(java.nio.file.Path,java.util.Set) public
     * static java.nio.file.Path java.nio.file.Files.setPosixFilePermissions(java.nio.file.Path,java.util.Set) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPosixFilePermissions_Path_Set()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#size(java.nio.file.Path) public static long
     * java.nio.file.Files.size(java.nio.file.Path) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_size_Path()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#walk(java.nio.file.Path,java.nio.file.FileVisitOption...) public
     * static java.util.stream.Stream java.nio.file.Files.walk(java.nio.file.Path,java.nio.file.FileVisitOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_walk_Path_FileVisitOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#walk(java.nio.file.Path,int,java.nio.file.FileVisitOption...) public
     * static java.util.stream.Stream java.nio.file.Files.walk(java.nio.file.Path,int,java.nio.file.FileVisitOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_walk_Path_int_FileVisitOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#walkFileTree(java.nio.file.Path,java.nio.file.FileVisitor) public
     * static java.nio.file.Path java.nio.file.Files.walkFileTree(java.nio.file.Path,java.nio.file.FileVisitor) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_walkFileTree_Path_FileVisitor()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#walkFileTree(java.nio.file.Path,java.util.Set,int,java.nio.file.FileVisitor) public
     * static java.nio.file.Path
     * java.nio.file.Files.walkFileTree(java.nio.file.Path,java.util.Set,int,java.nio.file.FileVisitor) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_walkFileTree_Path_Set_int_FileVisitor()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.Files#write(java.nio.file.Path,byte[],java.nio.file.OpenOption...) public
     * static java.nio.file.Path java.nio.file.Files.write(java.nio.file.Path,byte[],java.nio.file.OpenOption...) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_Path_byteArray_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#write(java.nio.file.Path,java.lang.Iterable,java.nio.charset.Charset,java.nio.file.OpenOption...)
     * public static java.nio.file.Path
     * java.nio.file.Files.write(java.nio.file.Path,java.lang.Iterable,java.nio.charset.Charset,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_Path_Iterable_Charset_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Files#write(java.nio.file.Path,java.lang.Iterable,java.nio.file.OpenOption...) public static
     * java.nio.file.Path java.nio.file.Files.write(java.nio.file.Path,java.lang.Iterable,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_Path_Iterable_OpenOptionArray()
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
        assertTrue(java.nio.file.Files.class.isAssignableFrom(sut));
    }

}
