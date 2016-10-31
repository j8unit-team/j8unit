package org.j8unit.repository.java.lang.management;

import java.lang.management.MonitorInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorInfoClassTest
implements org.j8unit.repository.java.lang.management.MonitorInfoClassTests<MonitorInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.MonitorInfo]

    @Override
    public Class<MonitorInfo> createNewSUT() {
        return MonitorInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.management.MonitorInfo#MonitorInfo(String, int, int, StackTraceElement) public
     * java.lang.management.MonitorInfo(java.lang.String,int,int,java.lang.StackTraceElement)}.
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
    public void create_MonitorInfo_String_int_int_StackTraceElement()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MonitorInfo sut = null; // = new MonitorInfo(String, int, int, StackTraceElement);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.MonitorInfo#from(javax.management.openmbean.CompositeData) public static
     * java.lang.management.MonitorInfo
     * java.lang.management.MonitorInfo.from(javax.management.openmbean.CompositeData)}.
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
    public void test_from_CompositeData()
    throws Exception {
        // write some test for {@link java.lang.management.MonitorInfo#from(javax.management.openmbean.CompositeData)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.MonitorInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.MonitorInfo]

}
