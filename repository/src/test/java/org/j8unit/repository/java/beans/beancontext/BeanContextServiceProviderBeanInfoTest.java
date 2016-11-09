package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextServiceProviderBeanInfo}
 * (by simply reusing the J8Unit test interface {@link BeanContextServiceProviderBeanInfoTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextServiceProviderBeanInfoTest
implements BeanContextServiceProviderBeanInfoTests<BeanContextServiceProviderBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceProviderBeanInfo]

    @Override
    public BeanContextServiceProviderBeanInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextServiceProviderBeanInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceProviderBeanInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceProviderBeanInfo]

}
