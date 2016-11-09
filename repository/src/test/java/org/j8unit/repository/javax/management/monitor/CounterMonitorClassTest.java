package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.CounterMonitor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CounterMonitor} (by simply reusing the
 * J8Unit test interface {@link CounterMonitorClassTests}).
 */

@RunWith(J8Unit4.class)
public class CounterMonitorClassTest
implements CounterMonitorClassTests<CounterMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.CounterMonitor]

    @Override
    public Class<CounterMonitor> createNewSUT() {
        return CounterMonitor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.monitor.CounterMonitor#CounterMonitor() public
     * javax.management.monitor.CounterMonitor()}.
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
    public void create_CounterMonitor()
    throws Exception {
        // create new instance
        final CounterMonitor sut = new CounterMonitor();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.CounterMonitor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.CounterMonitor]

}
