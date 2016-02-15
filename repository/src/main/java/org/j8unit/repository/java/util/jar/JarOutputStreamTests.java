package org.j8unit.repository.java.util.jar;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.jar.JarOutputStream class java.util.jar.JarOutputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JarOutputStreamClassTests}.
 * </p>
 *
 * @see java.util.jar.JarOutputStream class java.util.jar.JarOutputStream (the hereby targeted class-under-test class)
 * @see JarOutputStreamClassTests JarOutputStreamClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JarOutputStreamTests<SUT extends java.util.jar.JarOutputStream>
extends org.j8unit.repository.java.util.zip.ZipOutputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.jar.JarOutputStream#putNextEntry(java.util.zip.ZipEntry) public void
     * java.util.jar.JarOutputStream.putNextEntry(java.util.zip.ZipEntry) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.jar.JarOutputStream#putNextEntry(java.util.zip.ZipEntry) public void
     * java.util.jar.JarOutputStream.putNextEntry(java.util.zip.ZipEntry) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.jar.JarOutputStream#putNextEntry(java.util.zip.ZipEntry) public void
     *      java.util.jar.JarOutputStream.putNextEntry(java.util.zip.ZipEntry) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_putNextEntry_ZipEntry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
