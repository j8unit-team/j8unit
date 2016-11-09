package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryNotificationInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MemoryNotificationInfo} (by simply
 * reusing the J8Unit test interface {@link MemoryNotificationInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class MemoryNotificationInfoClassTest
implements MemoryNotificationInfoClassTests<MemoryNotificationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.MemoryNotificationInfo]

    @Override
    public Class<MemoryNotificationInfo> createNewSUT() {
        return MemoryNotificationInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.management.MemoryNotificationInfo#MemoryNotificationInfo(String, java.lang.management.MemoryUsage, long)
     * public java.lang.management.MemoryNotificationInfo(java.lang.String,java.lang.management.MemoryUsage,long)}.
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
    public void create_MemoryNotificationInfo_String_MemoryUsage_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MemoryNotificationInfo sut = null; // = new MemoryNotificationInfo(String,
                                                 // java.lang.management.MemoryUsage, long);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.MemoryNotificationInfo#from(javax.management.openmbean.CompositeData) public static
     * java.lang.management.MemoryNotificationInfo
     * java.lang.management.MemoryNotificationInfo.from(javax.management.openmbean.CompositeData)}.
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
        // write some test for {@link
        // java.lang.management.MemoryNotificationInfo#from(javax.management.openmbean.CompositeData)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.MemoryNotificationInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.MemoryNotificationInfo]

}
