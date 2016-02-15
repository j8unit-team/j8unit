package org.j8unit.repository.java.util.jar;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.jar.JarInputStream class java.util.jar.JarInputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JarInputStreamClassTests}.
 * </p>
 *
 * @see java.util.jar.JarInputStream class java.util.jar.JarInputStream (the hereby targeted class-under-test class)
 * @see JarInputStreamClassTests JarInputStreamClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JarInputStreamTests<SUT extends java.util.jar.JarInputStream>
extends org.j8unit.repository.java.util.zip.ZipInputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#getNextJarEntry() public java.util.jar.JarEntry
     * java.util.jar.JarInputStream.getNextJarEntry() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#getNextJarEntry() public java.util.jar.JarEntry
     * java.util.jar.JarInputStream.getNextJarEntry() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarInputStream#getNextJarEntry() public java.util.jar.JarEntry
     *      java.util.jar.JarInputStream.getNextJarEntry() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextJarEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#getNextEntry() public java.util.zip.ZipEntry
     * java.util.jar.JarInputStream.getNextEntry() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#getNextEntry() public java.util.zip.ZipEntry
     * java.util.jar.JarInputStream.getNextEntry() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarInputStream#getNextEntry() public java.util.zip.ZipEntry
     *      java.util.jar.JarInputStream.getNextEntry() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNextEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#read(byte[], int, int) public int
     * java.util.jar.JarInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#read(byte[], int, int) public int
     * java.util.jar.JarInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarInputStream#read(byte[], int, int) public int
     *      java.util.jar.JarInputStream.read(byte[],int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#getManifest() public java.util.jar.Manifest
     * java.util.jar.JarInputStream.getManifest()}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarInputStream#getManifest() public java.util.jar.Manifest
     * java.util.jar.JarInputStream.getManifest()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarInputStream#getManifest() public java.util.jar.Manifest
     *      java.util.jar.JarInputStream.getManifest() (the hereby targeted method-under-test)
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

}
