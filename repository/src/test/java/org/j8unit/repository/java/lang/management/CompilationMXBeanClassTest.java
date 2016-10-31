package org.j8unit.repository.java.lang.management;

import java.lang.management.CompilationMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompilationMXBeanClassTest
implements org.j8unit.repository.java.lang.management.CompilationMXBeanClassTests<CompilationMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.CompilationMXBean]

    @Override
    public Class<CompilationMXBean> createNewSUT() {
        return CompilationMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.CompilationMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.CompilationMXBean]

}
