package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServiceProviderBeanInfoClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderBeanInfoClassTests<BeanContextServiceProviderBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServiceProviderBeanInfo]

    @Override
    public Class<BeanContextServiceProviderBeanInfo> createNewSUT() {
        return BeanContextServiceProviderBeanInfo.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServiceProviderBeanInfo]

}
