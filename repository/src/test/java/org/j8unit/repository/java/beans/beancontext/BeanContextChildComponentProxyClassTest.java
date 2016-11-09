package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextChildComponentProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextChildComponentProxy} (by
 * simply reusing the J8Unit test interface {@link BeanContextChildComponentProxyClassTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextChildComponentProxyClassTest
implements BeanContextChildComponentProxyClassTests<BeanContextChildComponentProxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextChildComponentProxy]

    @Override
    public Class<BeanContextChildComponentProxy> createNewSUT() {
        return BeanContextChildComponentProxy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextChildComponentProxy]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextChildComponentProxy]

}
