package org.j8unit.repository.javax.management.timer;

import javax.management.timer.Timer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerClassTest
implements org.j8unit.repository.javax.management.timer.TimerClassTests<Timer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.timer.Timer]

    @Override
    public Class<Timer> createNewSUT() {
        return Timer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.management.timer.Timer#Timer() public
     * javax.management.timer.Timer()}.
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
    public void create_Timer()
    throws Exception {
        // create new instance
        final Timer sut = new Timer();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.timer.Timer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.timer.Timer]

}
