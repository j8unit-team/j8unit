package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.DirectoryIteratorException class java.nio.file.DirectoryIteratorException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.DirectoryIteratorExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DirectoryIteratorExceptionTests<SUT extends java.nio.file.DirectoryIteratorException>
extends org.j8unit.repository.java.util.ConcurrentModificationExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.DirectoryIteratorException#getCause() public java.io.IOException
     * java.nio.file.DirectoryIteratorException.getCause()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
