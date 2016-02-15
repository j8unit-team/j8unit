package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.TimerTask class java.util.TimerTask}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link TimerTaskClassTests}.
 * </p>
 *
 * @see java.util.TimerTask class java.util.TimerTask (the hereby targeted class-under-test class)
 * @see TimerTaskClassTests TimerTaskClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimerTaskTests<SUT extends java.util.TimerTask>
extends org.j8unit.repository.java.lang.RunnableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.TimerTask#run() public abstract void java.util.TimerTask.run()}.
     *
     * <p>
     * Test method for {@link java.util.TimerTask#run() public abstract void java.util.TimerTask.run()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TimerTask#run() public abstract void java.util.TimerTask.run() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_run()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.TimerTask#scheduledExecutionTime() public long
     * java.util.TimerTask.scheduledExecutionTime()}.
     *
     * <p>
     * Test method for {@link java.util.TimerTask#scheduledExecutionTime() public long
     * java.util.TimerTask.scheduledExecutionTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TimerTask#scheduledExecutionTime() public long java.util.TimerTask.scheduledExecutionTime() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scheduledExecutionTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.TimerTask#cancel() public boolean java.util.TimerTask.cancel()}.
     *
     * <p>
     * Test method for {@link java.util.TimerTask#cancel() public boolean java.util.TimerTask.cancel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.TimerTask#cancel() public boolean java.util.TimerTask.cancel() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_cancel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
