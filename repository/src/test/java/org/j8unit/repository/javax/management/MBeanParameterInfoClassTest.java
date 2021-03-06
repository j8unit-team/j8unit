package org.j8unit.repository.javax.management;

import javax.management.MBeanParameterInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanParameterInfo} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.MBeanParameterInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class MBeanParameterInfoClassTest
implements MBeanParameterInfoClassTests<MBeanParameterInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanParameterInfo]

    @Override
    public Class<MBeanParameterInfo> createNewSUT() {
        return MBeanParameterInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanParameterInfo#MBeanParameterInfo(String, String, String) public
     * javax.management.MBeanParameterInfo(java.lang.String,java.lang.String,java.lang.String)}.
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
    public void create_MBeanParameterInfo_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanParameterInfo sut = null; // = new MBeanParameterInfo(String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanParameterInfo#MBeanParameterInfo(String, String, String, javax.management.Descriptor)
     * public
     * javax.management.MBeanParameterInfo(java.lang.String,java.lang.String,java.lang.String,javax.management.Descriptor)}.
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
    public void create_MBeanParameterInfo_String_String_String_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanParameterInfo sut = null; // = new MBeanParameterInfo(String, String, String,
                                             // javax.management.Descriptor);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanParameterInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanParameterInfo]

}
