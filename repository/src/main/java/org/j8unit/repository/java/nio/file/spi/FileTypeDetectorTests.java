package org.j8unit.repository.java.nio.file.spi;

import java.nio.file.spi.FileTypeDetector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link FileTypeDetector public abstract class java.nio.file.spi.FileTypeDetector}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.nio.file.spi.FileTypeDetectorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileTypeDetectorTests<SUT extends FileTypeDetector>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.spi.FileTypeDetector]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.spi.FileTypeDetector#probeContentType(java.nio.file.Path) public abstract java.lang.String
     * java.nio.file.spi.FileTypeDetector.probeContentType(java.nio.file.Path) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.spi.FileTypeDetector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.spi.FileTypeDetector]

}
