package org.j8unit.repository.java.util.zip;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.zip.ZipFile class java.util.zip.ZipFile}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ZipFileClassTests}.
 * </p>
 *
 * @see java.util.zip.ZipFile class java.util.zip.ZipFile (the hereby targeted class-under-test class)
 * @see ZipFileClassTests ZipFileClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZipFileTests<SUT extends java.util.zip.ZipFile>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.zip.ZipFile#getComment() public java.lang.String
     * java.util.zip.ZipFile.getComment()}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#getComment() public java.lang.String
     * java.util.zip.ZipFile.getComment()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#getComment() public java.lang.String java.util.zip.ZipFile.getComment() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComment()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.ZipFile#getEntry(String) public java.util.zip.ZipEntry
     * java.util.zip.ZipFile.getEntry(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#getEntry(String) public java.util.zip.ZipEntry
     * java.util.zip.ZipFile.getEntry(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#getEntry(String) public java.util.zip.ZipEntry
     *      java.util.zip.ZipFile.getEntry(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.ZipFile#close() public void java.util.zip.ZipFile.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#close() public void java.util.zip.ZipFile.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#close() public void java.util.zip.ZipFile.close() throws java.io.IOException (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.zip.ZipFile#getInputStream(java.util.zip.ZipEntry) public java.io.InputStream
     * java.util.zip.ZipFile.getInputStream(java.util.zip.ZipEntry) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#getInputStream(java.util.zip.ZipEntry) public java.io.InputStream
     * java.util.zip.ZipFile.getInputStream(java.util.zip.ZipEntry) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#getInputStream(java.util.zip.ZipEntry) public java.io.InputStream
     *      java.util.zip.ZipFile.getInputStream(java.util.zip.ZipEntry) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputStream_ZipEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.ZipFile#entries() public java.util.Enumeration<? extends
     * java.util.zip.ZipEntry> java.util.zip.ZipFile.entries()}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#entries() public java.util.Enumeration
     * java.util.zip.ZipFile.entries()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#entries() public java.util.Enumeration java.util.zip.ZipFile.entries() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_entries()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.ZipFile#getName() public java.lang.String java.util.zip.ZipFile.getName()}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#getName() public java.lang.String java.util.zip.ZipFile.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#getName() public java.lang.String java.util.zip.ZipFile.getName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.ZipFile#size() public int java.util.zip.ZipFile.size()}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#size() public int java.util.zip.ZipFile.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#size() public int java.util.zip.ZipFile.size() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.ZipFile#stream() public java.util.stream.Stream<? extends
     * java.util.zip.ZipEntry> java.util.zip.ZipFile.stream()}.
     *
     * <p>
     * Test method for {@link java.util.zip.ZipFile#stream() public java.util.stream.Stream
     * java.util.zip.ZipFile.stream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.ZipFile#stream() public java.util.stream.Stream java.util.zip.ZipFile.stream() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
