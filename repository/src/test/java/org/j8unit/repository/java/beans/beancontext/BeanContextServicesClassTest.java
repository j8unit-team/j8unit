package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServices;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanContextServices} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.beancontext.BeanContextServicesClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BeanContextServicesClassTest
implements BeanContextServicesClassTests<BeanContextServices> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServices]

    @Override
    public Class<BeanContextServices> createNewSUT() {
        return BeanContextServices.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextServices]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServices]

}
