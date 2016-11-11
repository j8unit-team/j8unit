package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextProxy} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.beancontext.BeanContextProxyTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextProxyTest
implements BeanContextProxyTests<BeanContextProxy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextProxy]

    @Override
    public BeanContextProxy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextProxy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextProxy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextProxy]

}
