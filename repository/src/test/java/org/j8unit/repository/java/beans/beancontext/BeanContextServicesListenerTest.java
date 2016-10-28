package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServicesListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextServicesListenerTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerTests<BeanContextServicesListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextServicesListener]

    @Override
    public BeanContextServicesListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextServicesListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextServicesListener]

}
