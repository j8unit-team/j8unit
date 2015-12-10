package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompilationMXBeanClassTest
implements org.j8unit.repository.java.lang.management.CompilationMXBeanClassTests<java.lang.management.CompilationMXBean> {

    @Override
    public Class<java.lang.management.CompilationMXBean> createNewSUT() {
        return java.lang.management.CompilationMXBean.class;
    }

}
