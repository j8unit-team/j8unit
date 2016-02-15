package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.logging.ConsoleHandler class java.util.logging.ConsoleHandler}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ConsoleHandlerClassTests}.
 * </p>
 *
 * @see java.util.logging.ConsoleHandler class java.util.logging.ConsoleHandler (the hereby targeted class-under-test
 *      class)
 * @see ConsoleHandlerClassTests ConsoleHandlerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConsoleHandlerTests<SUT extends java.util.logging.ConsoleHandler>
extends StreamHandlerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.ConsoleHandler#close() public void
     * java.util.logging.ConsoleHandler.close()}.
     *
     * <p>
     * Test method for {@link java.util.logging.ConsoleHandler#close() public void
     * java.util.logging.ConsoleHandler.close()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.logging.ConsoleHandler#close() public void java.util.logging.ConsoleHandler.close() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.logging.ConsoleHandler#publish(java.util.logging.LogRecord) public void
     * java.util.logging.ConsoleHandler.publish(java.util.logging.LogRecord)}.
     *
     * <p>
     * Test method for {@link java.util.logging.ConsoleHandler#publish(java.util.logging.LogRecord) public void
     * java.util.logging.ConsoleHandler.publish(java.util.logging.LogRecord)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.logging.ConsoleHandler#publish(java.util.logging.LogRecord) public void
     *      java.util.logging.ConsoleHandler.publish(java.util.logging.LogRecord) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_publish_LogRecord()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
