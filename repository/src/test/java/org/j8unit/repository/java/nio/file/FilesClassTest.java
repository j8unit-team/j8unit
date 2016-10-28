package org.j8unit.repository.java.nio.file;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import java.util.function.BiPredicate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilesClassTest
implements org.j8unit.repository.java.nio.file.FilesClassTests<Files> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.Files]

    @Override
    public Class<Files> createNewSUT() {
        return Files.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#createTempDirectory(Path, String, FileAttribute...) public static java.nio.file.Path
     * java.nio.file.Files.createTempDirectory(java.nio.file.Path,java.lang.String,java.nio.file.attribute.FileAttribute
     * <?>...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createTempDirectory_Path_String_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createTempDirectory(Path, String, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#createTempDirectory(String, FileAttribute...)
     * public static java.nio.file.Path
     * java.nio.file.Files.createTempDirectory(java.lang.String,java.nio.file.attribute.FileAttribute<?>...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createTempDirectory_String_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createTempDirectory(String, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#deleteIfExists(Path) public static boolean
     * java.nio.file.Files.deleteIfExists(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_deleteIfExists_Path()
    throws Exception {
        // write some test for {@link Files#deleteIfExists(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#move(Path, Path, CopyOption...) public static
     * java.nio.file.Path java.nio.file.Files.move(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_move_Path_Path_CopyOptionArray()
    throws Exception {
        // write some test for {@link Files#move(Path, Path, CopyOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isHidden(Path) public static boolean
     * java.nio.file.Files.isHidden(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isHidden_Path()
    throws Exception {
        // write some test for {@link Files#isHidden(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#readSymbolicLink(Path) public static
     * java.nio.file.Path java.nio.file.Files.readSymbolicLink(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_readSymbolicLink_Path()
    throws Exception {
        // write some test for {@link Files#readSymbolicLink(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isRegularFile(Path, LinkOption...) public
     * static boolean java.nio.file.Files.isRegularFile(java.nio.file.Path,java.nio.file.LinkOption...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isRegularFile_Path_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#isRegularFile(Path, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#notExists(Path, LinkOption...) public static
     * boolean java.nio.file.Files.notExists(java.nio.file.Path,java.nio.file.LinkOption...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_notExists_Path_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#notExists(Path, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#getLastModifiedTime(Path, LinkOption...)
     * public static java.nio.file.attribute.FileTime
     * java.nio.file.Files.getLastModifiedTime(java.nio.file.Path,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getLastModifiedTime_Path_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#getLastModifiedTime(Path, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#setLastModifiedTime(Path, FileTime) public
     * static java.nio.file.Path
     * java.nio.file.Files.setLastModifiedTime(java.nio.file.Path,java.nio.file.attribute.FileTime) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_setLastModifiedTime_Path_FileTime()
    throws Exception {
        // write some test for {@link Files#setLastModifiedTime(Path, FileTime)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newDirectoryStream(Path, Filter) public static
     * java.nio.file.DirectoryStream<java.nio.file.Path>
     * java.nio.file.Files.newDirectoryStream(java.nio.file.Path,java.nio.file.DirectoryStream.java.nio.file.DirectoryStream$Filter<?
     * super java.nio.file.Path>) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newDirectoryStream_Path_Filter()
    throws Exception {
        // write some test for {@link Files#newDirectoryStream(Path, Filter)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newDirectoryStream(Path) public static
     * java.nio.file.DirectoryStream<java.nio.file.Path> java.nio.file.Files.newDirectoryStream(java.nio.file.Path)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newDirectoryStream_Path()
    throws Exception {
        // write some test for {@link Files#newDirectoryStream(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newDirectoryStream(Path, String) public static
     * java.nio.file.DirectoryStream
     * <java.nio.file.Path> java.nio.file.Files.newDirectoryStream(java.nio.file.Path,java.lang.String) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newDirectoryStream_Path_String()
    throws Exception {
        // write some test for {@link Files#newDirectoryStream(Path, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#walkFileTree(Path, FileVisitor) public static
     * java.nio.file.Path java.nio.file.Files.walkFileTree(java.nio.file.Path,java.nio.file.FileVisitor<? super
     * java.nio.file.Path>) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_walkFileTree_Path_FileVisitor()
    throws Exception {
        // write some test for {@link Files#walkFileTree(Path, FileVisitor)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#walkFileTree(Path, Set, int, FileVisitor)
     * public static java.nio.file.Path java.nio.file.Files.walkFileTree(java.nio.file.Path,java.util.Set
     * <java.nio.file.FileVisitOption>,int,java.nio.file.FileVisitor<? super java.nio.file.Path>) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_walkFileTree_Path_Set_int_FileVisitor()
    throws Exception {
        // write some test for {@link Files#walkFileTree(Path, Set, int, FileVisitor)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#walk(Path, FileVisitOption...) public static
     * java.util.stream.Stream
     * <java.nio.file.Path> java.nio.file.Files.walk(java.nio.file.Path,java.nio.file.FileVisitOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_walk_Path_FileVisitOptionArray()
    throws Exception {
        // write some test for {@link Files#walk(Path, FileVisitOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#walk(Path, int, FileVisitOption...) public
     * static java.util.stream.Stream
     * <java.nio.file.Path> java.nio.file.Files.walk(java.nio.file.Path,int,java.nio.file.FileVisitOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_walk_Path_int_FileVisitOptionArray()
    throws Exception {
        // write some test for {@link Files#walk(Path, int, FileVisitOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#exists(Path, LinkOption...) public static
     * boolean java.nio.file.Files.exists(java.nio.file.Path,java.nio.file.LinkOption...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_exists_Path_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#exists(Path, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#getFileStore(Path) public static
     * java.nio.file.FileStore java.nio.file.Files.getFileStore(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getFileStore_Path()
    throws Exception {
        // write some test for {@link Files#getFileStore(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newByteChannel(Path, OpenOption...) public
     * static java.nio.channels.SeekableByteChannel
     * java.nio.file.Files.newByteChannel(java.nio.file.Path,java.nio.file.OpenOption...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newByteChannel_Path_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#newByteChannel(Path, OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newByteChannel(Path, Set, FileAttribute...)
     * public static java.nio.channels.SeekableByteChannel
     * java.nio.file.Files.newByteChannel(java.nio.file.Path,java.util.Set<? extends
     * java.nio.file.OpenOption>,java.nio.file.attribute.FileAttribute<?>...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newByteChannel_Path_Set_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#newByteChannel(Path, Set, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#delete(Path) public static void
     * java.nio.file.Files.delete(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_delete_Path()
    throws Exception {
        // write some test for {@link Files#delete(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isWritable(Path) public static boolean
     * java.nio.file.Files.isWritable(java.nio.file.Path)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isWritable_Path()
    throws Exception {
        // write some test for {@link Files#isWritable(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#createSymbolicLink(Path, Path, FileAttribute...) public static java.nio.file.Path
     * java.nio.file.Files.createSymbolicLink(java.nio.file.Path,java.nio.file.Path,java.nio.file.attribute.FileAttribute
     * <?>...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createSymbolicLink_Path_Path_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createSymbolicLink(Path, Path, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#readAllLines(Path) public static
     * java.util.List<java.lang.String> java.nio.file.Files.readAllLines(java.nio.file.Path) throws java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_readAllLines_Path()
    throws Exception {
        // write some test for {@link Files#readAllLines(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#readAllLines(Path, Charset) public static
     * java.util.List<java.lang.String> java.nio.file.Files.readAllLines(java.nio.file.Path,java.nio.charset.Charset)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_readAllLines_Path_Charset()
    throws Exception {
        // write some test for {@link Files#readAllLines(Path, Charset)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#setPosixFilePermissions(Path, Set) public
     * static java.nio.file.Path java.nio.file.Files.setPosixFilePermissions(java.nio.file.Path,java.util.Set
     * <java.nio.file.attribute.PosixFilePermission>) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_setPosixFilePermissions_Path_Set()
    throws Exception {
        // write some test for {@link Files#setPosixFilePermissions(Path, Set)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newBufferedWriter(Path, OpenOption...) public
     * static java.io.BufferedWriter
     * java.nio.file.Files.newBufferedWriter(java.nio.file.Path,java.nio.file.OpenOption...) throws java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newBufferedWriter_Path_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#newBufferedWriter(Path, OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#newBufferedWriter(Path, Charset, OpenOption...) public static java.io.BufferedWriter
     * java.nio.file.Files.newBufferedWriter(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newBufferedWriter_Path_Charset_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#newBufferedWriter(Path, Charset, OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#getAttribute(Path, String, LinkOption...)
     * public static java.lang.Object
     * java.nio.file.Files.getAttribute(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAttribute_Path_String_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#getAttribute(Path, String, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#setAttribute(Path, String, Object, LinkOption...) public static java.nio.file.Path
     * java.nio.file.Files.setAttribute(java.nio.file.Path,java.lang.String,java.lang.Object,java.nio.file.LinkOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_setAttribute_Path_String_Object_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#setAttribute(Path, String, Object, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#lines(Path) public static
     * java.util.stream.Stream<java.lang.String> java.nio.file.Files.lines(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_lines_Path()
    throws Exception {
        // write some test for {@link Files#lines(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#lines(Path, Charset) public static
     * java.util.stream.Stream<java.lang.String> java.nio.file.Files.lines(java.nio.file.Path,java.nio.charset.Charset)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_lines_Path_Charset()
    throws Exception {
        // write some test for {@link Files#lines(Path, Charset)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#readAllBytes(Path) public static byte[]
     * java.nio.file.Files.readAllBytes(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_readAllBytes_Path()
    throws Exception {
        // write some test for {@link Files#readAllBytes(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#copy(InputStream, Path, CopyOption...) public
     * static long java.nio.file.Files.copy(java.io.InputStream,java.nio.file.Path,java.nio.file.CopyOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_copy_InputStream_Path_CopyOptionArray()
    throws Exception {
        // write some test for {@link Files#copy(InputStream, Path, CopyOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#copy(Path, OutputStream) public static long
     * java.nio.file.Files.copy(java.nio.file.Path,java.io.OutputStream) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_copy_Path_OutputStream()
    throws Exception {
        // write some test for {@link Files#copy(Path, OutputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#copy(Path, Path, CopyOption...) public static
     * java.nio.file.Path java.nio.file.Files.copy(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_copy_Path_Path_CopyOptionArray()
    throws Exception {
        // write some test for {@link Files#copy(Path, Path, CopyOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#probeContentType(Path) public static
     * java.lang.String java.nio.file.Files.probeContentType(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_probeContentType_Path()
    throws Exception {
        // write some test for {@link Files#probeContentType(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newBufferedReader(Path) public static
     * java.io.BufferedReader java.nio.file.Files.newBufferedReader(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newBufferedReader_Path()
    throws Exception {
        // write some test for {@link Files#newBufferedReader(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newBufferedReader(Path, Charset) public static
     * java.io.BufferedReader java.nio.file.Files.newBufferedReader(java.nio.file.Path,java.nio.charset.Charset) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newBufferedReader_Path_Charset()
    throws Exception {
        // write some test for {@link Files#newBufferedReader(Path, Charset)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#list(Path) public static
     * java.util.stream.Stream<java.nio.file.Path> java.nio.file.Files.list(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_list_Path()
    throws Exception {
        // write some test for {@link Files#list(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#createTempFile(String, String, FileAttribute...) public static java.nio.file.Path
     * java.nio.file.Files.createTempFile(java.lang.String,java.lang.String,java.nio.file.attribute.FileAttribute<?>...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createTempFile_String_String_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createTempFile(String, String, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#createTempFile(Path, String, String, FileAttribute...) public static java.nio.file.Path
     * java.nio.file.Files.createTempFile(java.nio.file.Path,java.lang.String,java.lang.String,java.nio.file.attribute.FileAttribute
     * <?>...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createTempFile_Path_String_String_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createTempFile(Path, String, String, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#size(Path) public static long
     * java.nio.file.Files.size(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_size_Path()
    throws Exception {
        // write some test for {@link Files#size(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isReadable(Path) public static boolean
     * java.nio.file.Files.isReadable(java.nio.file.Path)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isReadable_Path()
    throws Exception {
        // write some test for {@link Files#isReadable(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isDirectory(Path, LinkOption...) public static
     * boolean java.nio.file.Files.isDirectory(java.nio.file.Path,java.nio.file.LinkOption...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isDirectory_Path_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#isDirectory(Path, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#getPosixFilePermissions(Path, LinkOption...)
     * public static java.util.Set<java.nio.file.attribute.PosixFilePermission>
     * java.nio.file.Files.getPosixFilePermissions(java.nio.file.Path,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getPosixFilePermissions_Path_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#getPosixFilePermissions(Path, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#getFileAttributeView(Path, Class, LinkOption...) public static <V> V
     * java.nio.file.Files.getFileAttributeView(java.nio.file.Path,java.lang.Class<V>,java.nio.file.LinkOption...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getFileAttributeView_Path_Class_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#getFileAttributeView(Path, Class, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isSameFile(Path, Path) public static boolean
     * java.nio.file.Files.isSameFile(java.nio.file.Path,java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isSameFile_Path_Path()
    throws Exception {
        // write some test for {@link Files#isSameFile(Path, Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#getOwner(Path, LinkOption...) public static
     * java.nio.file.attribute.UserPrincipal
     * java.nio.file.Files.getOwner(java.nio.file.Path,java.nio.file.LinkOption...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getOwner_Path_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#getOwner(Path, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#setOwner(Path, UserPrincipal) public static
     * java.nio.file.Path java.nio.file.Files.setOwner(java.nio.file.Path,java.nio.file.attribute.UserPrincipal) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_setOwner_Path_UserPrincipal()
    throws Exception {
        // write some test for {@link Files#setOwner(Path, UserPrincipal)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#createLink(Path, Path) public static
     * java.nio.file.Path java.nio.file.Files.createLink(java.nio.file.Path,java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createLink_Path_Path()
    throws Exception {
        // write some test for {@link Files#createLink(Path, Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#createFile(Path, FileAttribute...) public
     * static java.nio.file.Path java.nio.file.Files.createFile(java.nio.file.Path,java.nio.file.attribute.FileAttribute
     * <?>...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createFile_Path_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createFile(Path, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isSymbolicLink(Path) public static boolean
     * java.nio.file.Files.isSymbolicLink(java.nio.file.Path)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isSymbolicLink_Path()
    throws Exception {
        // write some test for {@link Files#isSymbolicLink(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newInputStream(Path, OpenOption...) public
     * static java.io.InputStream java.nio.file.Files.newInputStream(java.nio.file.Path,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newInputStream_Path_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#newInputStream(Path, OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#readAttributes(Path, String, LinkOption...)
     * public static java.util.Map<java.lang.String, java.lang.Object>
     * java.nio.file.Files.readAttributes(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_readAttributes_Path_String_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#readAttributes(Path, String, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#readAttributes(Path, Class, LinkOption...)
     * public static <A> A java.nio.file.Files.readAttributes(java.nio.file.Path,java.lang.Class
     * <A>,java.nio.file.LinkOption...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_readAttributes_Path_Class_LinkOptionArray()
    throws Exception {
        // write some test for {@link Files#readAttributes(Path, Class, LinkOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#newOutputStream(Path, OpenOption...) public
     * static java.io.OutputStream java.nio.file.Files.newOutputStream(java.nio.file.Path,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newOutputStream_Path_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#newOutputStream(Path, OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Files#find(Path, int, BiPredicate, FileVisitOption...) public static java.util.stream.Stream
     * <java.nio.file.Path>
     * java.nio.file.Files.find(java.nio.file.Path,int,java.util.function.BiPredicate<java.nio.file.Path,
     * java.nio.file.attribute.BasicFileAttributes>,java.nio.file.FileVisitOption...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_find_Path_int_BiPredicate_FileVisitOptionArray()
    throws Exception {
        // write some test for {@link Files#find(Path, int, BiPredicate, FileVisitOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#write(Path, byte[], OpenOption...) public
     * static java.nio.file.Path java.nio.file.Files.write(java.nio.file.Path,byte[],java.nio.file.OpenOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_write_Path_byteArray_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#write(Path, byte[], OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#write(Path, Iterable, OpenOption...) public
     * static java.nio.file.Path java.nio.file.Files.write(java.nio.file.Path,java.lang.Iterable<? extends
     * java.lang.CharSequence>,java.nio.file.OpenOption...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_write_Path_Iterable_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#write(Path, Iterable, OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#write(Path, Iterable, Charset, OpenOption...)
     * public static java.nio.file.Path java.nio.file.Files.write(java.nio.file.Path,java.lang.Iterable<? extends
     * java.lang.CharSequence>,java.nio.charset.Charset,java.nio.file.OpenOption...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_write_Path_Iterable_Charset_OpenOptionArray()
    throws Exception {
        // write some test for {@link Files#write(Path, Iterable, Charset, OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#createDirectories(Path, FileAttribute...)
     * public static java.nio.file.Path
     * java.nio.file.Files.createDirectories(java.nio.file.Path,java.nio.file.attribute.FileAttribute<?>...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createDirectories_Path_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createDirectories(Path, FileAttribute...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#isExecutable(Path) public static boolean
     * java.nio.file.Files.isExecutable(java.nio.file.Path)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isExecutable_Path()
    throws Exception {
        // write some test for {@link Files#isExecutable(Path)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Files#createDirectory(Path, FileAttribute...) public
     * static java.nio.file.Path
     * java.nio.file.Files.createDirectory(java.nio.file.Path,java.nio.file.attribute.FileAttribute<?>...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createDirectory_Path_FileAttributeArray()
    throws Exception {
        // write some test for {@link Files#createDirectory(Path, FileAttribute...)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.Files]

}
