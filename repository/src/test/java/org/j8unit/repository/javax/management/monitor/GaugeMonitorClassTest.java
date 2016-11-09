package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.GaugeMonitor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GaugeMonitor} (by simply reusing the
 * J8Unit test interface {@link GaugeMonitorClassTests}).
 */

@RunWith(J8Unit4.class)
public class GaugeMonitorClassTest
implements GaugeMonitorClassTests<GaugeMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.GaugeMonitor]

    @Override
    public Class<GaugeMonitor> createNewSUT() {
        return GaugeMonitor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.monitor.GaugeMonitor#GaugeMonitor() public javax.management.monitor.GaugeMonitor()}.
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
    public void create_GaugeMonitor()
    throws Exception {
        // create new instance
        final GaugeMonitor sut = new GaugeMonitor();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.GaugeMonitor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.GaugeMonitor]

}
