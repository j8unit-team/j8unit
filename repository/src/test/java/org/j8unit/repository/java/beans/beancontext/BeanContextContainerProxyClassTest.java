package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextContainerProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextContainerProxy} (by simply
 * reusing the J8Unit test interface {@link BeanContextContainerProxyClassTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextContainerProxyClassTest
implements BeanContextContainerProxyClassTests<BeanContextContainerProxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextContainerProxy]

    @Override
    public Class<BeanContextContainerProxy> createNewSUT() {
        return BeanContextContainerProxy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextContainerProxy]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextContainerProxy]

}
