package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextProxyClassTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextProxyClassTests<BeanContextProxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.beancontext.BeanContextProxy]

    @Override
    public Class<BeanContextProxy> createNewSUT() {
        return BeanContextProxy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.beancontext.BeanContextProxy]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.beancontext.BeanContextProxy]

}
