package org.j8unit.repository.javax.swing;

import javax.swing.Timer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Timer} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.swing.TimerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TimerClassTest
implements org.j8unit.repository.javax.swing.TimerClassTests<Timer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Timer]

    @Override
    public Class<Timer> createNewSUT() {
        return Timer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.Timer#Timer(int, java.awt.event.ActionListener) public
     * javax.swing.Timer(int,java.awt.event.ActionListener)}.
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
    public void create_Timer_int_ActionListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Timer sut = null; // = new Timer(int, java.awt.event.ActionListener);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.Timer#getLogTimers() public static
     * boolean javax.swing.Timer.getLogTimers()}.
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
    public void test_getLogTimers()
    throws Exception {
        // write some test for {@link javax.swing.Timer#getLogTimers()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.Timer#setLogTimers(boolean) public
     * static void javax.swing.Timer.setLogTimers(boolean)}.
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
    public void test_setLogTimers_boolean()
    throws Exception {
        // write some test for {@link javax.swing.Timer#setLogTimers(boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Timer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Timer]

}
