package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.beancontext.BeanContextEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextEventClassTest
implements BeanContextEventClassTests<BeanContextEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextEvent]

    @Override
    public Class<BeanContextEvent> createNewSUT() {
        return BeanContextEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextEvent]

}
