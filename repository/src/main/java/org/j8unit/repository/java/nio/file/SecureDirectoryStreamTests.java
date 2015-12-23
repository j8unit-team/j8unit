package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.SecureDirectoryStream interface
 * java.nio.file.SecureDirectoryStream}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.SecureDirectoryStreamTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.SecureDirectoryStreamClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.SecureDirectoryStream
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecureDirectoryStreamTests<SUT extends java.nio.file.SecureDirectoryStream<T>, T>
extends org.j8unit.repository.java.nio.file.DirectoryStreamTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.nio.file.SecureDirectoryStream#deleteDirectory(java.lang.Object) public abstract void
     * java.nio.file.SecureDirectoryStream.deleteDirectory(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.SecureDirectoryStream#deleteDirectory(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteDirectory_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.SecureDirectoryStream#deleteFile(java.lang.Object) public abstract void
     * java.nio.file.SecureDirectoryStream.deleteFile(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.SecureDirectoryStream#deleteFile(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteFile_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.SecureDirectoryStream#getFileAttributeView(java.lang.Class) public abstract
     * java.nio.file.attribute.FileAttributeView
     * java.nio.file.SecureDirectoryStream.getFileAttributeView(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.SecureDirectoryStream#getFileAttributeView(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileAttributeView_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#getFileAttributeView(java.lang.Object, java.lang.Class, java.nio.file.LinkOption...)
     * public abstract java.nio.file.attribute.FileAttributeView
     * java.nio.file.SecureDirectoryStream.getFileAttributeView(java.lang.Object,java.lang.Class,java.nio.file.LinkOption...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.SecureDirectoryStream#getFileAttributeView(java.lang.Object, java.lang.Class,
     *             java.nio.file.LinkOption...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileAttributeView_Object_Class_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#move(java.lang.Object, java.nio.file.SecureDirectoryStream, java.lang.Object)
     * public abstract void
     * java.nio.file.SecureDirectoryStream.move(java.lang.Object,java.nio.file.SecureDirectoryStream,java.lang.Object)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.SecureDirectoryStream#move(java.lang.Object, java.nio.file.SecureDirectoryStream,
     *             java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_move_Object_SecureDirectoryStream_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#newByteChannel(java.lang.Object, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public abstract java.nio.channels.SeekableByteChannel
     * java.nio.file.SecureDirectoryStream.newByteChannel(java.lang.Object,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.SecureDirectoryStream#newByteChannel(java.lang.Object, java.util.Set,
     *             java.nio.file.attribute.FileAttribute...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newByteChannel_Object_Set_FileAttributeArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#newDirectoryStream(java.lang.Object, java.nio.file.LinkOption...)
     * public abstract java.nio.file.SecureDirectoryStream
     * java.nio.file.SecureDirectoryStream.newDirectoryStream(java.lang.Object,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.SecureDirectoryStream#newDirectoryStream(java.lang.Object, java.nio.file.LinkOption...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newDirectoryStream_Object_LinkOptionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
