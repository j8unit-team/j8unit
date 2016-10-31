package org.j8unit.repository.java.lang.management;

import java.lang.management.ClassLoadingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassLoadingMXBeanClassTest
implements org.j8unit.repository.java.lang.management.ClassLoadingMXBeanClassTests<ClassLoadingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.ClassLoadingMXBean]

    @Override
    public Class<ClassLoadingMXBean> createNewSUT() {
        return ClassLoadingMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.ClassLoadingMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.ClassLoadingMXBean]

}
