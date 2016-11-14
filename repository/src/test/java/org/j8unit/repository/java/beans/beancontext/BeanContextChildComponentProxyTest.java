package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextChildComponentProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextChildComponentProxy} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextChildComponentProxyTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextChildComponentProxyTest
implements BeanContextChildComponentProxyTests<BeanContextChildComponentProxy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextChildComponentProxy]

    @Override
    public BeanContextChildComponentProxy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextChildComponentProxy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextChildComponentProxy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextChildComponentProxy]

}
