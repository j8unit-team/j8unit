package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassLoadingMXBeanClassTest
implements org.j8unit.repository.java.lang.management.ClassLoadingMXBeanClassTests<java.lang.management.ClassLoadingMXBean> {

    @Override
    public Class<java.lang.management.ClassLoadingMXBean> createNewSUT() {
        return java.lang.management.ClassLoadingMXBean.class;
    }

}
