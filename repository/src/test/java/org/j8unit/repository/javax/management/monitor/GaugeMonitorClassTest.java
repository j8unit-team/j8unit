package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.GaugeMonitor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GaugeMonitorClassTest
implements org.j8unit.repository.javax.management.monitor.GaugeMonitorClassTests<GaugeMonitor> {

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

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.GaugeMonitor]

}
