package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.MonitorSettingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MonitorSettingException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.monitor.MonitorSettingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class MonitorSettingExceptionClassTest
implements MonitorSettingExceptionClassTests<MonitorSettingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.MonitorSettingException]

    @Override
    public Class<MonitorSettingException> createNewSUT() {
        return MonitorSettingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.monitor.MonitorSettingException#MonitorSettingException() public
     * javax.management.monitor.MonitorSettingException()}.
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
    public void create_MonitorSettingException()
    throws Exception {
        // create new instance
        final MonitorSettingException sut = new MonitorSettingException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.monitor.MonitorSettingException#MonitorSettingException(String) public
     * javax.management.monitor.MonitorSettingException(java.lang.String)}.
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
    public void create_MonitorSettingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MonitorSettingException sut = null; // = new MonitorSettingException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.MonitorSettingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.MonitorSettingException]

}
