package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.DirectoryIteratorException class
 * java.nio.file.DirectoryIteratorException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DirectoryIteratorExceptionClassTests}.
 * </p>
 *
 * @see java.nio.file.DirectoryIteratorException class java.nio.file.DirectoryIteratorException (the hereby targeted
 *      class-under-test class)
 * @see DirectoryIteratorExceptionClassTests DirectoryIteratorExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirectoryIteratorExceptionTests<SUT extends java.nio.file.DirectoryIteratorException>
extends org.j8unit.repository.java.util.ConcurrentModificationExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.DirectoryIteratorException#getCause() public java.io.IOException
     * java.nio.file.DirectoryIteratorException.getCause()}.
     *
     * <p>
     * Test method for {@link java.nio.file.DirectoryIteratorException#getCause() public java.io.IOException
     * java.nio.file.DirectoryIteratorException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.DirectoryIteratorException#getCause() public java.io.IOException
     *      java.nio.file.DirectoryIteratorException.getCause() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
