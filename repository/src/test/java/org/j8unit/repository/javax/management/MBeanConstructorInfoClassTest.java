package org.j8unit.repository.javax.management;

import javax.management.MBeanConstructorInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanConstructorInfo} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.MBeanConstructorInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanConstructorInfoClassTest
implements MBeanConstructorInfoClassTests<MBeanConstructorInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanConstructorInfo]

    @Override
    public Class<MBeanConstructorInfo> createNewSUT() {
        return MBeanConstructorInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanConstructorInfo#MBeanConstructorInfo(String, java.lang.reflect.Constructor) public
     * javax.management.MBeanConstructorInfo(java.lang.String,java.lang.reflect.Constructor<?>)}.
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
    public void create_MBeanConstructorInfo_String_Constructor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanConstructorInfo sut = null; // = new MBeanConstructorInfo(String, java.lang.reflect.Constructor);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanConstructorInfo#MBeanConstructorInfo(String, String, javax.management.MBeanParameterInfo[], javax.management.Descriptor)
     * public
     * javax.management.MBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],javax.management.Descriptor)}.
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
    public void create_MBeanConstructorInfo_String_String_MBeanParameterInfoArray_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanConstructorInfo sut = null; // = new MBeanConstructorInfo(String, String,
                                               // javax.management.MBeanParameterInfo[], javax.management.Descriptor);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanConstructorInfo#MBeanConstructorInfo(String, String, javax.management.MBeanParameterInfo[])
     * public
     * javax.management.MBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[])}.
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
    public void create_MBeanConstructorInfo_String_String_MBeanParameterInfoArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanConstructorInfo sut = null; // = new MBeanConstructorInfo(String, String,
                                               // javax.management.MBeanParameterInfo[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanConstructorInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanConstructorInfo]

}
