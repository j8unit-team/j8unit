package org.j8unit.repository.javax.management;

import javax.management.MBeanNotificationInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanNotificationInfoClassTest
implements org.j8unit.repository.javax.management.MBeanNotificationInfoClassTests<MBeanNotificationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanNotificationInfo]

    @Override
    public Class<MBeanNotificationInfo> createNewSUT() {
        return MBeanNotificationInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanNotificationInfo#MBeanNotificationInfo(String[], String, String) public
     * javax.management.MBeanNotificationInfo(java.lang.String[],java.lang.String,java.lang.String)}.
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
    public void create_MBeanNotificationInfo_StringArray_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanNotificationInfo sut = null; // = new MBeanNotificationInfo(String[], String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanNotificationInfo#MBeanNotificationInfo(String[], String, String, javax.management.Descriptor)
     * public
     * javax.management.MBeanNotificationInfo(java.lang.String[],java.lang.String,java.lang.String,javax.management.Descriptor)}
     * .
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
    public void create_MBeanNotificationInfo_StringArray_String_String_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanNotificationInfo sut = null; // = new MBeanNotificationInfo(String[], String, String,
                                                // javax.management.Descriptor);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanNotificationInfo]

}
