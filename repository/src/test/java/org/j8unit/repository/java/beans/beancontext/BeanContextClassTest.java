package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.beancontext.BeanContextClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BeanContextClassTest
implements BeanContextClassTests<BeanContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContext]

    @Override
    public Class<BeanContext> createNewSUT() {
        return BeanContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContext]

}
