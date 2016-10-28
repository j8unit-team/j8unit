package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServices;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BeanContextServicesClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextServicesClassTests<BeanContextServices> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextServices]

    @Override
    public Class<BeanContextServices> createNewSUT() {
        return BeanContextServices.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextServices]

}
