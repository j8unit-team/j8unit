package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextChild;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextChild} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.beancontext.BeanContextChildClassTests}).
 */
@RunWith(J8Unit4.class)
public class BeanContextChildClassTest
implements BeanContextChildClassTests<BeanContextChild> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextChild]

    @Override
    public Class<BeanContextChild> createNewSUT() {
        return BeanContextChild.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextChild]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextChild]

}
