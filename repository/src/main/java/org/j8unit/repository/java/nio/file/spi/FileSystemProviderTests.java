package org.j8unit.repository.java.nio.file.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.spi.FileSystemProvider class
 * java.nio.file.spi.FileSystemProvider}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link FileSystemProviderClassTests}.
 * </p>
 *
 * @see java.nio.file.spi.FileSystemProvider class java.nio.file.spi.FileSystemProvider (the hereby targeted
 *      class-under-test class)
 * @see FileSystemProviderClassTests FileSystemProviderClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileSystemProviderTests<SUT extends java.nio.file.spi.FileSystemProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#delete(java.nio.file.Path) public abstract void
     * java.nio.file.spi.FileSystemProvider.delete(java.nio.file.Path) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#delete(java.nio.file.Path) public abstract void
     * java.nio.file.spi.FileSystemProvider.delete(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#delete(java.nio.file.Path) public abstract void
     *      java.nio.file.spi.FileSystemProvider.delete(java.nio.file.Path) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_delete_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#createLink(java.nio.file.Path, java.nio.file.Path)
     * public void java.nio.file.spi.FileSystemProvider.createLink(java.nio.file.Path,java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#createLink(java.nio.file.Path, java.nio.file.Path)
     * public void java.nio.file.spi.FileSystemProvider.createLink(java.nio.file.Path,java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#createLink(java.nio.file.Path, java.nio.file.Path) public void
     *      java.nio.file.spi.FileSystemProvider.createLink(java.nio.file.Path,java.nio.file.Path) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createLink_Path_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#createSymbolicLink(java.nio.file.Path, java.nio.file.Path, java.nio.file.attribute.FileAttribute...)
     * public void
     * java.nio.file.spi.FileSystemProvider.createSymbolicLink(java.nio.file.Path,java.nio.file.Path,java.nio.file.attribute.FileAttribute
     * <?>...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#createSymbolicLink(java.nio.file.Path, java.nio.file.Path, java.nio.file.attribute.FileAttribute...)
     * public void
     * java.nio.file.spi.FileSystemProvider.createSymbolicLink(java.nio.file.Path,java.nio.file.Path,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#createSymbolicLink(java.nio.file.Path, java.nio.file.Path,
     *      java.nio.file.attribute.FileAttribute...) public void
     *      java.nio.file.spi.FileSystemProvider.createSymbolicLink(java.nio.file.Path,java.nio.file.Path,java.nio.file.
     *      attribute.FileAttribute[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSymbolicLink_Path_Path_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#getFileAttributeView(java.nio.file.Path, Class, java.nio.file.LinkOption...)
     * public abstract <V> V
     * java.nio.file.spi.FileSystemProvider.getFileAttributeView(java.nio.file.Path,java.lang.Class
     * <V>,java.nio.file.LinkOption...)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#getFileAttributeView(java.nio.file.Path, Class, java.nio.file.LinkOption...)
     * public abstract java.nio.file.attribute.FileAttributeView
     * java.nio.file.spi.FileSystemProvider.getFileAttributeView(java.nio.file.Path,java.lang.Class,java.nio.file.LinkOption...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#getFileAttributeView(java.nio.file.Path, Class,
     *      java.nio.file.LinkOption...) public abstract java.nio.file.attribute.FileAttributeView
     *      java.nio.file.spi.FileSystemProvider.getFileAttributeView(java.nio.file.Path,java.lang.Class,java.nio.file.
     *      LinkOption[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileAttributeView_Path_Class_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newAsynchronousFileChannel(java.nio.file.Path, java.util.Set, java.util.concurrent.ExecutorService, java.nio.file.attribute.FileAttribute...)
     * public java.nio.channels.AsynchronousFileChannel
     * java.nio.file.spi.FileSystemProvider.newAsynchronousFileChannel(java.nio.file.Path,java.util.Set<? extends
     * java.nio.file.OpenOption>,java.util.concurrent.ExecutorService,java.nio.file.attribute.FileAttribute<?>...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newAsynchronousFileChannel(java.nio.file.Path, java.util.Set, java.util.concurrent.ExecutorService, java.nio.file.attribute.FileAttribute...)
     * public java.nio.channels.AsynchronousFileChannel
     * java.nio.file.spi.FileSystemProvider.newAsynchronousFileChannel(java.nio.file.Path,java.util.Set,java.util.concurrent.ExecutorService,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newAsynchronousFileChannel(java.nio.file.Path, java.util.Set,
     *      java.util.concurrent.ExecutorService, java.nio.file.attribute.FileAttribute...) public
     *      java.nio.channels.AsynchronousFileChannel
     *      java.nio.file.spi.FileSystemProvider.newAsynchronousFileChannel(java.nio.file.Path,java.util.Set,java.util.
     *      concurrent.ExecutorService,java.nio.file.attribute.FileAttribute[]) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newAsynchronousFileChannel_Path_Set_ExecutorService_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#isSameFile(java.nio.file.Path, java.nio.file.Path)
     * public abstract boolean java.nio.file.spi.FileSystemProvider.isSameFile(java.nio.file.Path,java.nio.file.Path)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#isSameFile(java.nio.file.Path, java.nio.file.Path)
     * public abstract boolean java.nio.file.spi.FileSystemProvider.isSameFile(java.nio.file.Path,java.nio.file.Path)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#isSameFile(java.nio.file.Path, java.nio.file.Path) public abstract
     *      boolean java.nio.file.spi.FileSystemProvider.isSameFile(java.nio.file.Path,java.nio.file.Path) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSameFile_Path_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getFileStore(java.nio.file.Path) public abstract
     * java.nio.file.FileStore java.nio.file.spi.FileSystemProvider.getFileStore(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getFileStore(java.nio.file.Path) public abstract
     * java.nio.file.FileStore java.nio.file.spi.FileSystemProvider.getFileStore(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#getFileStore(java.nio.file.Path) public abstract
     *      java.nio.file.FileStore java.nio.file.spi.FileSystemProvider.getFileStore(java.nio.file.Path) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileStore_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newByteChannel(java.nio.file.Path, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public abstract java.nio.channels.SeekableByteChannel
     * java.nio.file.spi.FileSystemProvider.newByteChannel(java.nio.file.Path,java.util.Set<? extends
     * java.nio.file.OpenOption>,java.nio.file.attribute.FileAttribute<?>...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newByteChannel(java.nio.file.Path, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public abstract java.nio.channels.SeekableByteChannel
     * java.nio.file.spi.FileSystemProvider.newByteChannel(java.nio.file.Path,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newByteChannel(java.nio.file.Path, java.util.Set,
     *      java.nio.file.attribute.FileAttribute...) public abstract java.nio.channels.SeekableByteChannel
     *      java.nio.file.spi.FileSystemProvider.newByteChannel(java.nio.file.Path,java.util.Set,java.nio.file.attribute
     *      .FileAttribute[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newByteChannel_Path_Set_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getPath(java.net.URI) public abstract
     * java.nio.file.Path java.nio.file.spi.FileSystemProvider.getPath(java.net.URI)}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getPath(java.net.URI) public abstract
     * java.nio.file.Path java.nio.file.spi.FileSystemProvider.getPath(java.net.URI)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#getPath(java.net.URI) public abstract java.nio.file.Path
     *      java.nio.file.spi.FileSystemProvider.getPath(java.net.URI) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPath_URI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#createDirectory(java.nio.file.Path, java.nio.file.attribute.FileAttribute...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.createDirectory(java.nio.file.Path,java.nio.file.attribute.FileAttribute
     * <?>...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#createDirectory(java.nio.file.Path, java.nio.file.attribute.FileAttribute...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.createDirectory(java.nio.file.Path,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#createDirectory(java.nio.file.Path,
     *      java.nio.file.attribute.FileAttribute...) public abstract void
     *      java.nio.file.spi.FileSystemProvider.createDirectory(java.nio.file.Path,java.nio.file.attribute.
     *      FileAttribute[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDirectory_Path_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#copy(java.nio.file.Path, java.nio.file.Path, java.nio.file.CopyOption...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.copy(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#copy(java.nio.file.Path, java.nio.file.Path, java.nio.file.CopyOption...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.copy(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#copy(java.nio.file.Path, java.nio.file.Path,
     *      java.nio.file.CopyOption...) public abstract void
     *      java.nio.file.spi.FileSystemProvider.copy(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption[])
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_copy_Path_Path_CopyOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newFileChannel(java.nio.file.Path, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public java.nio.channels.FileChannel
     * java.nio.file.spi.FileSystemProvider.newFileChannel(java.nio.file.Path,java.util.Set<? extends
     * java.nio.file.OpenOption>,java.nio.file.attribute.FileAttribute<?>...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newFileChannel(java.nio.file.Path, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public java.nio.channels.FileChannel
     * java.nio.file.spi.FileSystemProvider.newFileChannel(java.nio.file.Path,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newFileChannel(java.nio.file.Path, java.util.Set,
     *      java.nio.file.attribute.FileAttribute...) public java.nio.channels.FileChannel
     *      java.nio.file.spi.FileSystemProvider.newFileChannel(java.nio.file.Path,java.util.Set,java.nio.file.attribute
     *      .FileAttribute[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newFileChannel_Path_Set_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newInputStream(java.nio.file.Path, java.nio.file.OpenOption...)
     * public java.io.InputStream
     * java.nio.file.spi.FileSystemProvider.newInputStream(java.nio.file.Path,java.nio.file.OpenOption...) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newInputStream(java.nio.file.Path, java.nio.file.OpenOption...)
     * public java.io.InputStream
     * java.nio.file.spi.FileSystemProvider.newInputStream(java.nio.file.Path,java.nio.file.OpenOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newInputStream(java.nio.file.Path, java.nio.file.OpenOption...) public
     *      java.io.InputStream
     *      java.nio.file.spi.FileSystemProvider.newInputStream(java.nio.file.Path,java.nio.file.OpenOption[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInputStream_Path_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#readAttributes(java.nio.file.Path, Class, java.nio.file.LinkOption...)
     * public abstract <A> A java.nio.file.spi.FileSystemProvider.readAttributes(java.nio.file.Path,java.lang.Class
     * <A>,java.nio.file.LinkOption...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#readAttributes(java.nio.file.Path, Class, java.nio.file.LinkOption...)
     * public abstract java.nio.file.attribute.BasicFileAttributes
     * java.nio.file.spi.FileSystemProvider.readAttributes(java.nio.file.Path,java.lang.Class,java.nio.file.LinkOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#readAttributes(java.nio.file.Path, Class, java.nio.file.LinkOption...)
     *      public abstract java.nio.file.attribute.BasicFileAttributes
     *      java.nio.file.spi.FileSystemProvider.readAttributes(java.nio.file.Path,java.lang.Class,java.nio.file.
     *      LinkOption[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAttributes_Path_Class_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#readAttributes(java.nio.file.Path, String, java.nio.file.LinkOption...)
     * public abstract java.util.Map<java.lang.String, java.lang.Object>
     * java.nio.file.spi.FileSystemProvider.readAttributes(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#readAttributes(java.nio.file.Path, String, java.nio.file.LinkOption...)
     * public abstract java.util.Map
     * java.nio.file.spi.FileSystemProvider.readAttributes(java.nio.file.Path,java.lang.String,java.nio.file.LinkOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#readAttributes(java.nio.file.Path, String, java.nio.file.LinkOption...)
     *      public abstract java.util.Map
     *      java.nio.file.spi.FileSystemProvider.readAttributes(java.nio.file.Path,java.lang.String,java.nio.file.
     *      LinkOption[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAttributes_Path_String_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newOutputStream(java.nio.file.Path, java.nio.file.OpenOption...)
     * public java.io.OutputStream
     * java.nio.file.spi.FileSystemProvider.newOutputStream(java.nio.file.Path,java.nio.file.OpenOption...) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newOutputStream(java.nio.file.Path, java.nio.file.OpenOption...)
     * public java.io.OutputStream
     * java.nio.file.spi.FileSystemProvider.newOutputStream(java.nio.file.Path,java.nio.file.OpenOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newOutputStream(java.nio.file.Path, java.nio.file.OpenOption...) public
     *      java.io.OutputStream
     *      java.nio.file.spi.FileSystemProvider.newOutputStream(java.nio.file.Path,java.nio.file.OpenOption[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newOutputStream_Path_OpenOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#setAttribute(java.nio.file.Path, String, Object, java.nio.file.LinkOption...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.setAttribute(java.nio.file.Path,java.lang.String,java.lang.Object,java.nio.file.LinkOption...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#setAttribute(java.nio.file.Path, String, Object, java.nio.file.LinkOption...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.setAttribute(java.nio.file.Path,java.lang.String,java.lang.Object,java.nio.file.LinkOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#setAttribute(java.nio.file.Path, String, Object,
     *      java.nio.file.LinkOption...) public abstract void
     *      java.nio.file.spi.FileSystemProvider.setAttribute(java.nio.file.Path,java.lang.String,java.lang.Object,java.
     *      nio.file.LinkOption[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_Path_String_Object_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#checkAccess(java.nio.file.Path, java.nio.file.AccessMode...) public
     * abstract void java.nio.file.spi.FileSystemProvider.checkAccess(java.nio.file.Path,java.nio.file.AccessMode...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#checkAccess(java.nio.file.Path, java.nio.file.AccessMode...) public
     * abstract void java.nio.file.spi.FileSystemProvider.checkAccess(java.nio.file.Path,java.nio.file.AccessMode...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#checkAccess(java.nio.file.Path, java.nio.file.AccessMode...) public
     *      abstract void
     *      java.nio.file.spi.FileSystemProvider.checkAccess(java.nio.file.Path,java.nio.file.AccessMode[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkAccess_Path_AccessModeArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#isHidden(java.nio.file.Path) public abstract boolean
     * java.nio.file.spi.FileSystemProvider.isHidden(java.nio.file.Path) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#isHidden(java.nio.file.Path) public abstract boolean
     * java.nio.file.spi.FileSystemProvider.isHidden(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#isHidden(java.nio.file.Path) public abstract boolean
     *      java.nio.file.spi.FileSystemProvider.isHidden(java.nio.file.Path) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isHidden_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#readSymbolicLink(java.nio.file.Path) public
     * java.nio.file.Path java.nio.file.spi.FileSystemProvider.readSymbolicLink(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#readSymbolicLink(java.nio.file.Path) public
     * java.nio.file.Path java.nio.file.spi.FileSystemProvider.readSymbolicLink(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#readSymbolicLink(java.nio.file.Path) public java.nio.file.Path
     *      java.nio.file.spi.FileSystemProvider.readSymbolicLink(java.nio.file.Path) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readSymbolicLink_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newDirectoryStream(java.nio.file.Path, java.nio.file.DirectoryStream.Filter)
     * public abstract java.nio.file.DirectoryStream<java.nio.file.Path>
     * java.nio.file.spi.FileSystemProvider.newDirectoryStream(java.nio.file.Path,java.nio.file.DirectoryStream.java.nio.file.DirectoryStream$Filter<?
     * super java.nio.file.Path>) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#newDirectoryStream(java.nio.file.Path, java.nio.file.DirectoryStream.Filter)
     * public abstract java.nio.file.DirectoryStream
     * java.nio.file.spi.FileSystemProvider.newDirectoryStream(java.nio.file.Path,java.nio.file.DirectoryStream$Filter)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newDirectoryStream(java.nio.file.Path,
     *      java.nio.file.DirectoryStream.Filter) public abstract java.nio.file.DirectoryStream
     *      java.nio.file.spi.FileSystemProvider.newDirectoryStream(java.nio.file.Path,java.nio.file.
     *      DirectoryStream$Filter) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newDirectoryStream_Path_Filter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getFileSystem(java.net.URI) public abstract
     * java.nio.file.FileSystem java.nio.file.spi.FileSystemProvider.getFileSystem(java.net.URI)}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getFileSystem(java.net.URI) public abstract
     * java.nio.file.FileSystem java.nio.file.spi.FileSystemProvider.getFileSystem(java.net.URI)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#getFileSystem(java.net.URI) public abstract java.nio.file.FileSystem
     *      java.nio.file.spi.FileSystemProvider.getFileSystem(java.net.URI) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileSystem_URI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#newFileSystem(java.nio.file.Path, java.util.Map)
     * public java.nio.file.FileSystem
     * java.nio.file.spi.FileSystemProvider.newFileSystem(java.nio.file.Path,java.util.Map<java.lang.String, ?>) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#newFileSystem(java.nio.file.Path, java.util.Map)
     * public java.nio.file.FileSystem
     * java.nio.file.spi.FileSystemProvider.newFileSystem(java.nio.file.Path,java.util.Map) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newFileSystem(java.nio.file.Path, java.util.Map) public
     *      java.nio.file.FileSystem
     *      java.nio.file.spi.FileSystemProvider.newFileSystem(java.nio.file.Path,java.util.Map) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newFileSystem_Path_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#newFileSystem(java.net.URI, java.util.Map) public
     * abstract java.nio.file.FileSystem
     * java.nio.file.spi.FileSystemProvider.newFileSystem(java.net.URI,java.util.Map<java.lang.String, ?>) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#newFileSystem(java.net.URI, java.util.Map) public
     * abstract java.nio.file.FileSystem java.nio.file.spi.FileSystemProvider.newFileSystem(java.net.URI,java.util.Map)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#newFileSystem(java.net.URI, java.util.Map) public abstract
     *      java.nio.file.FileSystem java.nio.file.spi.FileSystemProvider.newFileSystem(java.net.URI,java.util.Map)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newFileSystem_URI_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#deleteIfExists(java.nio.file.Path) public boolean
     * java.nio.file.spi.FileSystemProvider.deleteIfExists(java.nio.file.Path) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#deleteIfExists(java.nio.file.Path) public boolean
     * java.nio.file.spi.FileSystemProvider.deleteIfExists(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#deleteIfExists(java.nio.file.Path) public boolean
     *      java.nio.file.spi.FileSystemProvider.deleteIfExists(java.nio.file.Path) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteIfExists_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#move(java.nio.file.Path, java.nio.file.Path, java.nio.file.CopyOption...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.move(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.spi.FileSystemProvider#move(java.nio.file.Path, java.nio.file.Path, java.nio.file.CopyOption...)
     * public abstract void
     * java.nio.file.spi.FileSystemProvider.move(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#move(java.nio.file.Path, java.nio.file.Path,
     *      java.nio.file.CopyOption...) public abstract void
     *      java.nio.file.spi.FileSystemProvider.move(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption[])
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_move_Path_Path_CopyOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getScheme() public abstract java.lang.String
     * java.nio.file.spi.FileSystemProvider.getScheme()}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileSystemProvider#getScheme() public abstract java.lang.String
     * java.nio.file.spi.FileSystemProvider.getScheme()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileSystemProvider#getScheme() public abstract java.lang.String
     *      java.nio.file.spi.FileSystemProvider.getScheme() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScheme()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
