package org.j8unit.repository.java.util.jar;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.jar.JarFile class java.util.jar.JarFile}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link JarFileClassTests}.
 * </p>
 *
 * @see java.util.jar.JarFile class java.util.jar.JarFile (the hereby targeted class-under-test class)
 * @see JarFileClassTests JarFileClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JarFileTests<SUT extends java.util.jar.JarFile>
extends org.j8unit.repository.java.util.zip.ZipFileTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.jar.JarFile#getEntry(String) public java.util.zip.ZipEntry
     * java.util.jar.JarFile.getEntry(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarFile#getEntry(String) public java.util.zip.ZipEntry
     * java.util.jar.JarFile.getEntry(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarFile#getEntry(String) public java.util.zip.ZipEntry
     *      java.util.jar.JarFile.getEntry(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.jar.JarFile#getInputStream(java.util.zip.ZipEntry) public synchronized
     * java.io.InputStream java.util.jar.JarFile.getInputStream(java.util.zip.ZipEntry) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarFile#getInputStream(java.util.zip.ZipEntry) public synchronized
     * java.io.InputStream java.util.jar.JarFile.getInputStream(java.util.zip.ZipEntry) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarFile#getInputStream(java.util.zip.ZipEntry) public synchronized java.io.InputStream
     *      java.util.jar.JarFile.getInputStream(java.util.zip.ZipEntry) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.jar.JarFile#entries() public java.util.Enumeration
     * <java.util.jar.JarEntry> java.util.jar.JarFile.entries()}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarFile#entries() public java.util.Enumeration
     * java.util.jar.JarFile.entries()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarFile#entries() public java.util.Enumeration java.util.jar.JarFile.entries() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.jar.JarFile#getManifest() public java.util.jar.Manifest
     * java.util.jar.JarFile.getManifest() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarFile#getManifest() public java.util.jar.Manifest
     * java.util.jar.JarFile.getManifest() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarFile#getManifest() public java.util.jar.Manifest java.util.jar.JarFile.getManifest() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getManifest()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.jar.JarFile#getJarEntry(String) public java.util.jar.JarEntry
     * java.util.jar.JarFile.getJarEntry(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarFile#getJarEntry(String) public java.util.jar.JarEntry
     * java.util.jar.JarFile.getJarEntry(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarFile#getJarEntry(String) public java.util.jar.JarEntry
     *      java.util.jar.JarFile.getJarEntry(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getJarEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.jar.JarFile#stream() public java.util.stream.Stream
     * <java.util.jar.JarEntry> java.util.jar.JarFile.stream()}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarFile#stream() public java.util.stream.Stream
     * java.util.jar.JarFile.stream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarFile#stream() public java.util.stream.Stream java.util.jar.JarFile.stream() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_stream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
