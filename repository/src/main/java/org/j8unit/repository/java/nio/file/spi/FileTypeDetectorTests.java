package org.j8unit.repository.java.nio.file.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.spi.FileTypeDetector class
 * java.nio.file.spi.FileTypeDetector}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link FileTypeDetectorClassTests}.
 * </p>
 *
 * @see java.nio.file.spi.FileTypeDetector class java.nio.file.spi.FileTypeDetector (the hereby targeted
 *      class-under-test class)
 * @see FileTypeDetectorClassTests FileTypeDetectorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileTypeDetectorTests<SUT extends java.nio.file.spi.FileTypeDetector>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.spi.FileTypeDetector#probeContentType(java.nio.file.Path) public abstract
     * java.lang.String java.nio.file.spi.FileTypeDetector.probeContentType(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.spi.FileTypeDetector#probeContentType(java.nio.file.Path) public abstract
     * java.lang.String java.nio.file.spi.FileTypeDetector.probeContentType(java.nio.file.Path) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.spi.FileTypeDetector#probeContentType(java.nio.file.Path) public abstract java.lang.String
     *      java.nio.file.spi.FileTypeDetector.probeContentType(java.nio.file.Path) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_probeContentType_Path()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
