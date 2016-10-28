package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BeanContextClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextClassTests<BeanContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContext]

    @Override
    public Class<BeanContext> createNewSUT() {
        return BeanContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContext]

}
