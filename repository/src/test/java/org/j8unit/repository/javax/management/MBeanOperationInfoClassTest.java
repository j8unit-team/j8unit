package org.j8unit.repository.javax.management;

import javax.management.MBeanOperationInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanOperationInfo} (by simply reusing
 * the J8Unit test interface {@link MBeanOperationInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanOperationInfoClassTest
implements MBeanOperationInfoClassTests<MBeanOperationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanOperationInfo]

    @Override
    public Class<MBeanOperationInfo> createNewSUT() {
        return MBeanOperationInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanOperationInfo#MBeanOperationInfo(String, java.lang.reflect.Method) public
     * javax.management.MBeanOperationInfo(java.lang.String,java.lang.reflect.Method)}.
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
    public void create_MBeanOperationInfo_String_Method()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanOperationInfo sut = null; // = new MBeanOperationInfo(String, java.lang.reflect.Method);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanOperationInfo#MBeanOperationInfo(String, String, javax.management.MBeanParameterInfo[], String, int, javax.management.Descriptor)
     * public
     * javax.management.MBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int,javax.management.Descriptor)}.
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
    public void create_MBeanOperationInfo_String_String_MBeanParameterInfoArray_String_int_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanOperationInfo sut = null; // = new MBeanOperationInfo(String, String,
                                             // javax.management.MBeanParameterInfo[], String, int,
                                             // javax.management.Descriptor);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanOperationInfo#MBeanOperationInfo(String, String, javax.management.MBeanParameterInfo[], String, int)
     * public
     * javax.management.MBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int)}.
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
    public void create_MBeanOperationInfo_String_String_MBeanParameterInfoArray_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanOperationInfo sut = null; // = new MBeanOperationInfo(String, String,
                                             // javax.management.MBeanParameterInfo[], String, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanOperationInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanOperationInfo]

}
