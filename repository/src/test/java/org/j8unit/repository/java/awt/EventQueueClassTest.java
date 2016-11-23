package org.j8unit.repository.java.awt;

import java.awt.EventQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventQueue} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.EventQueueClassTests}).
 */

@RunWith(J8Unit4.class)
public class EventQueueClassTest
implements EventQueueClassTests<EventQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.EventQueue]

    @Override
    public Class<EventQueue> createNewSUT() {
        return EventQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.EventQueue#EventQueue() public
     * java.awt.EventQueue()}.
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
    public void create_EventQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EventQueue sut = new EventQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.EventQueue#getCurrentEvent() public static
     * java.awt.AWTEvent java.awt.EventQueue.getCurrentEvent()}.
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
    public void test_getCurrentEvent()
    throws Exception {
        // write some test for {@link java.awt.EventQueue#getCurrentEvent()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.EventQueue#getMostRecentEventTime() public
     * static long java.awt.EventQueue.getMostRecentEventTime()}.
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
    public void test_getMostRecentEventTime()
    throws Exception {
        // write some test for {@link java.awt.EventQueue#getMostRecentEventTime()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.EventQueue#invokeAndWait(Runnable) public
     * static void java.awt.EventQueue.invokeAndWait(java.lang.Runnable) throws
     * java.lang.InterruptedException,java.lang.reflect.InvocationTargetException}.
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
    public void test_invokeAndWait_Runnable()
    throws Exception {
        // write some test for {@link java.awt.EventQueue#invokeAndWait(Runnable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.EventQueue#isDispatchThread() public static
     * boolean java.awt.EventQueue.isDispatchThread()}.
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
    public void test_isDispatchThread()
    throws Exception {
        // write some test for {@link java.awt.EventQueue#isDispatchThread()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.EventQueue#invokeLater(Runnable) public
     * static void java.awt.EventQueue.invokeLater(java.lang.Runnable)}.
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
    public void test_invokeLater_Runnable()
    throws Exception {
        // write some test for {@link java.awt.EventQueue#invokeLater(Runnable)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.EventQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.EventQueue]

}
