package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.StringMonitor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringMonitorClassTest
implements org.j8unit.repository.javax.management.monitor.StringMonitorClassTests<StringMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.StringMonitor]

    @Override
    public Class<StringMonitor> createNewSUT() {
        return StringMonitor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.monitor.StringMonitor#StringMonitor() public javax.management.monitor.StringMonitor()}.
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
    public void create_StringMonitor()
    throws Exception {
        // create new instance
        final StringMonitor sut = new StringMonitor();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.StringMonitor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.StringMonitor]

}
