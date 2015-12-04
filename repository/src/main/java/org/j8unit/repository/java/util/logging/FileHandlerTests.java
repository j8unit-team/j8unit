package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.logging.FileHandler class java.util.logging.FileHandler}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.logging.FileHandlerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileHandlerTests<SUT extends java.util.logging.FileHandler>
extends org.j8unit.repository.java.util.logging.StreamHandlerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.FileHandler#close() public synchronized void
     * java.util.logging.FileHandler.close() throws java.lang.SecurityException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.logging.FileHandler#publish(java.util.logging.LogRecord) public synchronized
     * void java.util.logging.FileHandler.publish(java.util.logging.LogRecord)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_publish_LogRecord()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
