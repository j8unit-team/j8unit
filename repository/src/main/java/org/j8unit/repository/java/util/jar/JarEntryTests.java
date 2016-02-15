package org.j8unit.repository.java.util.jar;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.jar.JarEntry class java.util.jar.JarEntry}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link JarEntryClassTests}.
 * </p>
 *
 * @see java.util.jar.JarEntry class java.util.jar.JarEntry (the hereby targeted class-under-test class)
 * @see JarEntryClassTests JarEntryClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JarEntryTests<SUT extends java.util.jar.JarEntry>
extends org.j8unit.repository.java.util.zip.ZipEntryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.jar.JarEntry#getAttributes() public java.util.jar.Attributes
     * java.util.jar.JarEntry.getAttributes() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarEntry#getAttributes() public java.util.jar.Attributes
     * java.util.jar.JarEntry.getAttributes() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarEntry#getAttributes() public java.util.jar.Attributes
     *      java.util.jar.JarEntry.getAttributes() throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.jar.JarEntry#getCodeSigners() public java.security.CodeSigner[]
     * java.util.jar.JarEntry.getCodeSigners()}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarEntry#getCodeSigners() public java.security.CodeSigner[]
     * java.util.jar.JarEntry.getCodeSigners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarEntry#getCodeSigners() public java.security.CodeSigner[]
     *      java.util.jar.JarEntry.getCodeSigners() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCodeSigners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.jar.JarEntry#getCertificates() public java.security.cert.Certificate[]
     * java.util.jar.JarEntry.getCertificates()}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarEntry#getCertificates() public java.security.cert.Certificate[]
     * java.util.jar.JarEntry.getCertificates()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarEntry#getCertificates() public java.security.cert.Certificate[]
     *      java.util.jar.JarEntry.getCertificates() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificates()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
