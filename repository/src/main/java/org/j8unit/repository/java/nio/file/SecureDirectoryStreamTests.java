package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.SecureDirectoryStream interface
 * java.nio.file.SecureDirectoryStream}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SecureDirectoryStreamClassTests}.
 * </p>
 *
 * @see java.nio.file.SecureDirectoryStream interface java.nio.file.SecureDirectoryStream (the hereby targeted
 *      class-under-test class)
 * @see SecureDirectoryStreamClassTests SecureDirectoryStreamClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecureDirectoryStreamTests<SUT extends java.nio.file.SecureDirectoryStream<T>, T>
extends DirectoryStreamTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link java.nio.file.SecureDirectoryStream#getFileAttributeView(Class) public abstract <V> V
     * java.nio.file.SecureDirectoryStream.getFileAttributeView(java.lang.Class<V>)}.
     *
     * <p>
     * Test method for {@link java.nio.file.SecureDirectoryStream#getFileAttributeView(Class) public abstract
     * java.nio.file.attribute.FileAttributeView
     * java.nio.file.SecureDirectoryStream.getFileAttributeView(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.SecureDirectoryStream#getFileAttributeView(Class) public abstract
     *      java.nio.file.attribute.FileAttributeView
     *      java.nio.file.SecureDirectoryStream.getFileAttributeView(java.lang.Class) (the hereby targeted
     *      method-under-test)
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
     * {@link java.nio.file.SecureDirectoryStream#getFileAttributeView(Object, Class, java.nio.file.LinkOption...)
     * public abstract <V> V java.nio.file.SecureDirectoryStream.getFileAttributeView(T,java.lang.Class
     * <V>,java.nio.file.LinkOption...)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#getFileAttributeView(Object, Class, java.nio.file.LinkOption...)
     * public abstract java.nio.file.attribute.FileAttributeView
     * java.nio.file.SecureDirectoryStream.getFileAttributeView(java.lang.Object,java.lang.Class,java.nio.file.LinkOption...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.SecureDirectoryStream#getFileAttributeView(Object, Class, java.nio.file.LinkOption...) public
     *      abstract java.nio.file.attribute.FileAttributeView
     *      java.nio.file.SecureDirectoryStream.getFileAttributeView(java.lang.Object,java.lang.Class,java.nio.file.
     *      LinkOption[]) (the hereby targeted method-under-test)
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
     * {@link java.nio.file.SecureDirectoryStream#newByteChannel(Object, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public abstract java.nio.channels.SeekableByteChannel
     * java.nio.file.SecureDirectoryStream.newByteChannel(T,java.util.Set<? extends
     * java.nio.file.OpenOption>,java.nio.file.attribute.FileAttribute<?>...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#newByteChannel(Object, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public abstract java.nio.channels.SeekableByteChannel
     * java.nio.file.SecureDirectoryStream.newByteChannel(java.lang.Object,java.util.Set,java.nio.file.attribute.FileAttribute...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.SecureDirectoryStream#newByteChannel(Object, java.util.Set,
     *      java.nio.file.attribute.FileAttribute...) public abstract java.nio.channels.SeekableByteChannel
     *      java.nio.file.SecureDirectoryStream.newByteChannel(java.lang.Object,java.util.Set,java.nio.file.attribute.
     *      FileAttribute[]) throws java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.file.SecureDirectoryStream#deleteFile(Object) public abstract void
     * java.nio.file.SecureDirectoryStream.deleteFile(T) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.SecureDirectoryStream#deleteFile(Object) public abstract void
     * java.nio.file.SecureDirectoryStream.deleteFile(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.SecureDirectoryStream#deleteFile(Object) public abstract void
     *      java.nio.file.SecureDirectoryStream.deleteFile(java.lang.Object) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#move(Object, java.nio.file.SecureDirectoryStream, Object) public
     * abstract void java.nio.file.SecureDirectoryStream.move(T,java.nio.file.SecureDirectoryStream<T>,T) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#move(Object, java.nio.file.SecureDirectoryStream, Object) public
     * abstract void
     * java.nio.file.SecureDirectoryStream.move(java.lang.Object,java.nio.file.SecureDirectoryStream,java.lang.Object)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.SecureDirectoryStream#move(Object, java.nio.file.SecureDirectoryStream, Object) public
     *      abstract void
     *      java.nio.file.SecureDirectoryStream.move(java.lang.Object,java.nio.file.SecureDirectoryStream,java.lang.
     *      Object) throws java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.file.SecureDirectoryStream#deleteDirectory(Object) public abstract void
     * java.nio.file.SecureDirectoryStream.deleteDirectory(T) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.SecureDirectoryStream#deleteDirectory(Object) public abstract void
     * java.nio.file.SecureDirectoryStream.deleteDirectory(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.SecureDirectoryStream#deleteDirectory(Object) public abstract void
     *      java.nio.file.SecureDirectoryStream.deleteDirectory(java.lang.Object) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#newDirectoryStream(Object, java.nio.file.LinkOption...) public
     * abstract java.nio.file.SecureDirectoryStream
     * <T> java.nio.file.SecureDirectoryStream.newDirectoryStream(T,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.SecureDirectoryStream#newDirectoryStream(Object, java.nio.file.LinkOption...) public
     * abstract java.nio.file.SecureDirectoryStream
     * java.nio.file.SecureDirectoryStream.newDirectoryStream(java.lang.Object,java.nio.file.LinkOption...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.SecureDirectoryStream#newDirectoryStream(Object, java.nio.file.LinkOption...) public abstract
     *      java.nio.file.SecureDirectoryStream
     *      java.nio.file.SecureDirectoryStream.newDirectoryStream(java.lang.Object,java.nio.file.LinkOption[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
