package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.FileSystem class java.nio.file.FileSystem}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FileSystemClassTests}.
 * </p>
 *
 * @see java.nio.file.FileSystem class java.nio.file.FileSystem (the hereby targeted class-under-test class)
 * @see FileSystemClassTests FileSystemClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileSystemTests<SUT extends java.nio.file.FileSystem>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#close() public abstract void java.nio.file.FileSystem.close()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#close() public abstract void java.nio.file.FileSystem.close()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#close() public abstract void java.nio.file.FileSystem.close() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#newWatchService() public abstract java.nio.file.WatchService
     * java.nio.file.FileSystem.newWatchService() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#newWatchService() public abstract java.nio.file.WatchService
     * java.nio.file.FileSystem.newWatchService() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#newWatchService() public abstract java.nio.file.WatchService
     *      java.nio.file.FileSystem.newWatchService() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newWatchService()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getUserPrincipalLookupService() public abstract
     * java.nio.file.attribute.UserPrincipalLookupService java.nio.file.FileSystem.getUserPrincipalLookupService()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getUserPrincipalLookupService() public abstract
     * java.nio.file.attribute.UserPrincipalLookupService java.nio.file.FileSystem.getUserPrincipalLookupService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#getUserPrincipalLookupService() public abstract
     *      java.nio.file.attribute.UserPrincipalLookupService java.nio.file.FileSystem.getUserPrincipalLookupService()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUserPrincipalLookupService()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getPath(String, String...) public abstract java.nio.file.Path
     * java.nio.file.FileSystem.getPath(java.lang.String,java.lang.String...)}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getPath(String, String...) public abstract java.nio.file.Path
     * java.nio.file.FileSystem.getPath(java.lang.String,java.lang.String...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#getPath(String, String...) public abstract java.nio.file.Path
     *      java.nio.file.FileSystem.getPath(java.lang.String,java.lang.String[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPath_String_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getRootDirectories() public abstract java.lang.Iterable
     * <java.nio.file.Path> java.nio.file.FileSystem.getRootDirectories()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getRootDirectories() public abstract java.lang.Iterable
     * java.nio.file.FileSystem.getRootDirectories()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#getRootDirectories() public abstract java.lang.Iterable
     *      java.nio.file.FileSystem.getRootDirectories() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRootDirectories()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getSeparator() public abstract java.lang.String
     * java.nio.file.FileSystem.getSeparator()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getSeparator() public abstract java.lang.String
     * java.nio.file.FileSystem.getSeparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#getSeparator() public abstract java.lang.String
     *      java.nio.file.FileSystem.getSeparator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSeparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getPathMatcher(String) public abstract java.nio.file.PathMatcher
     * java.nio.file.FileSystem.getPathMatcher(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getPathMatcher(String) public abstract java.nio.file.PathMatcher
     * java.nio.file.FileSystem.getPathMatcher(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#getPathMatcher(String) public abstract java.nio.file.PathMatcher
     *      java.nio.file.FileSystem.getPathMatcher(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPathMatcher_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#supportedFileAttributeViews() public abstract java.util.Set
     * <java.lang.String> java.nio.file.FileSystem.supportedFileAttributeViews()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#supportedFileAttributeViews() public abstract java.util.Set
     * java.nio.file.FileSystem.supportedFileAttributeViews()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#supportedFileAttributeViews() public abstract java.util.Set
     *      java.nio.file.FileSystem.supportedFileAttributeViews() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_supportedFileAttributeViews()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#provider() public abstract java.nio.file.spi.FileSystemProvider
     * java.nio.file.FileSystem.provider()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#provider() public abstract java.nio.file.spi.FileSystemProvider
     * java.nio.file.FileSystem.provider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#provider() public abstract java.nio.file.spi.FileSystemProvider
     *      java.nio.file.FileSystem.provider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getFileStores() public abstract java.lang.Iterable
     * <java.nio.file.FileStore> java.nio.file.FileSystem.getFileStores()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#getFileStores() public abstract java.lang.Iterable
     * java.nio.file.FileSystem.getFileStores()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#getFileStores() public abstract java.lang.Iterable
     *      java.nio.file.FileSystem.getFileStores() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileStores()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#isReadOnly() public abstract boolean
     * java.nio.file.FileSystem.isReadOnly()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#isReadOnly() public abstract boolean
     * java.nio.file.FileSystem.isReadOnly()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#isReadOnly() public abstract boolean java.nio.file.FileSystem.isReadOnly() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isReadOnly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileSystem#isOpen() public abstract boolean
     * java.nio.file.FileSystem.isOpen()}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileSystem#isOpen() public abstract boolean
     * java.nio.file.FileSystem.isOpen()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileSystem#isOpen() public abstract boolean java.nio.file.FileSystem.isOpen() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isOpen()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
