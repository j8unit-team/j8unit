package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServices;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextServices} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.beans.beancontext.BeanContextServicesTests}).
 */
@RunWith(J8Unit4.class)
public class BeanContextServicesTest
implements BeanContextServicesTests<BeanContextServices> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextServices]

    @Override
    public BeanContextServices createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextServices], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextServices]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextServices]

}
