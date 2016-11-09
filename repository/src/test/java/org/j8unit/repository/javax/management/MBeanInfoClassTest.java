package org.j8unit.repository.javax.management;

import javax.management.MBeanInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanInfo} (by simply reusing the J8Unit
 * test interface {@link MBeanInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanInfoClassTest
implements MBeanInfoClassTests<MBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanInfo]

    @Override
    public Class<MBeanInfo> createNewSUT() {
        return MBeanInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanInfo#MBeanInfo(String, String, javax.management.MBeanAttributeInfo[], javax.management.MBeanConstructorInfo[], javax.management.MBeanOperationInfo[], javax.management.MBeanNotificationInfo[])
     * public
     * javax.management.MBeanInfo(java.lang.String,java.lang.String,javax.management.MBeanAttributeInfo[],javax.management.MBeanConstructorInfo[],javax.management.MBeanOperationInfo[],javax.management.MBeanNotificationInfo[])
     * throws java.lang.IllegalArgumentException}.
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
    public void create_MBeanInfo_String_String_MBeanAttributeInfoArray_MBeanConstructorInfoArray_MBeanOperationInfoArray_MBeanNotificationInfoArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanInfo sut = null; // = new MBeanInfo(String, String, javax.management.MBeanAttributeInfo[],
                                    // javax.management.MBeanConstructorInfo[], javax.management.MBeanOperationInfo[],
                                    // javax.management.MBeanNotificationInfo[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanInfo#MBeanInfo(String, String, javax.management.MBeanAttributeInfo[], javax.management.MBeanConstructorInfo[], javax.management.MBeanOperationInfo[], javax.management.MBeanNotificationInfo[], javax.management.Descriptor)
     * public
     * javax.management.MBeanInfo(java.lang.String,java.lang.String,javax.management.MBeanAttributeInfo[],javax.management.MBeanConstructorInfo[],javax.management.MBeanOperationInfo[],javax.management.MBeanNotificationInfo[],javax.management.Descriptor)
     * throws java.lang.IllegalArgumentException}.
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
    public void create_MBeanInfo_String_String_MBeanAttributeInfoArray_MBeanConstructorInfoArray_MBeanOperationInfoArray_MBeanNotificationInfoArray_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanInfo sut = null; // = new MBeanInfo(String, String, javax.management.MBeanAttributeInfo[],
                                    // javax.management.MBeanConstructorInfo[], javax.management.MBeanOperationInfo[],
                                    // javax.management.MBeanNotificationInfo[], javax.management.Descriptor);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanInfo]

}
