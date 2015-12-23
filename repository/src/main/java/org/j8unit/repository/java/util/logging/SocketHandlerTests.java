package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.logging.SocketHandler class java.util.logging.SocketHandler}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.logging.SocketHandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.logging.SocketHandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.logging.SocketHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketHandlerTests<SUT extends java.util.logging.SocketHandler>
extends org.j8unit.repository.java.util.logging.StreamHandlerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.SocketHandler#close() public synchronized void
     * java.util.logging.SocketHandler.close() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.SocketHandler#close()
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
     * Test method for {@link java.util.logging.SocketHandler#publish(java.util.logging.LogRecord) public synchronized
     * void java.util.logging.SocketHandler.publish(java.util.logging.LogRecord)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.SocketHandler#publish(java.util.logging.LogRecord)
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
