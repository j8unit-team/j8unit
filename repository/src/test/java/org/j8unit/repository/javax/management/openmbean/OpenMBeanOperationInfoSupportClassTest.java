package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanOperationInfoSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenMBeanOperationInfoSupport} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoSupportClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanOperationInfoSupportClassTest
implements OpenMBeanOperationInfoSupportClassTests<OpenMBeanOperationInfoSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenMBeanOperationInfoSupport]

    @Override
    public Class<OpenMBeanOperationInfoSupport> createNewSUT() {
        return OpenMBeanOperationInfoSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#OpenMBeanOperationInfoSupport(String, String, javax.management.openmbean.OpenMBeanParameterInfo[], javax.management.openmbean.OpenType, int)
     * public
     * javax.management.openmbean.OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType<?>,int)}.
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
    public void create_OpenMBeanOperationInfoSupport_String_String_OpenMBeanParameterInfoArray_OpenType_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OpenMBeanOperationInfoSupport sut = null; // = new OpenMBeanOperationInfoSupport(String, String,
                                                        // javax.management.openmbean.OpenMBeanParameterInfo[],
                                                        // javax.management.openmbean.OpenType, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#OpenMBeanOperationInfoSupport(String, String, javax.management.openmbean.OpenMBeanParameterInfo[], javax.management.openmbean.OpenType, int, javax.management.Descriptor)
     * public
     * javax.management.openmbean.OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType<?>,int,javax.management.Descriptor)}.
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
    public void create_OpenMBeanOperationInfoSupport_String_String_OpenMBeanParameterInfoArray_OpenType_int_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OpenMBeanOperationInfoSupport sut = null; // = new OpenMBeanOperationInfoSupport(String, String,
                                                        // javax.management.openmbean.OpenMBeanParameterInfo[],
                                                        // javax.management.openmbean.OpenType, int,
                                                        // javax.management.Descriptor);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenMBeanOperationInfoSupport]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenMBeanOperationInfoSupport]

}
